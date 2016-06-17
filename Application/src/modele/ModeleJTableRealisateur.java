/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DaoFilm;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.VIP;

/**
 *
 * @author cyrille
 */
public class ModeleJTableRealisateur extends AbstractTableModel {

    private List<VIP> leConteneurRealisateur;
    private String[] titre;

    private DaoFilm leDaoFilm;

    public ModeleJTableRealisateur(DaoFilm leDaoFilm) {
        this.leConteneurRealisateur = new ArrayList<>();
        this.titre = new String[]{"numVip", "nomVip"};
        this.leDaoFilm = leDaoFilm;
    }

    public void chargerRealisateurs() throws SQLException {

        leDaoFilm.lireLesRealisateurs(leConteneurRealisateur);
        fireTableDataChanged();
    }

    public void rafraichir() throws SQLException {

        leConteneurRealisateur.clear();
        leDaoFilm.lireLesRealisateurs(leConteneurRealisateur);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return leConteneurRealisateur.size();
    }

    @Override
    public int getColumnCount() {
        return titre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        VIP Vip = leConteneurRealisateur.get(row);
        if (column == 0) {
            return Vip.getNumVip();
        } else if (column == 1) {
            return Vip.getNomVip();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }
}
