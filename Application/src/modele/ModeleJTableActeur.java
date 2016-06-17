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
public class ModeleJTableActeur extends AbstractTableModel {

    private List<VIP> leConteneurActeur;
    private String[] titre;

    private DaoFilm leDaoFilm;

    public ModeleJTableActeur(DaoFilm leDaoFilm) {
        this.leConteneurActeur = new ArrayList<>();
        this.titre = new String[]{"numVip", "nomVip"};
        this.leDaoFilm = leDaoFilm;
    }

    public void chargerActeur() throws SQLException {
        leDaoFilm.lireLesActeurs(leConteneurActeur);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return leConteneurActeur.size();
    }

    @Override
    public int getColumnCount() {
        return titre.length;
    }

    public void rafraichir() throws SQLException {

        leConteneurActeur.clear();
        leDaoFilm.lireLesActeurs(leConteneurActeur);
        this.fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int row, int column) {
        VIP Vip = leConteneurActeur.get(row);
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
