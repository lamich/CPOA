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

/**
 *
 * @author cyrille
 */
public class ModeleJTableGenre extends AbstractTableModel {

    private List<String> leConteneurGenre;
    private String[] titre;

    private DaoFilm leDaoFilm;

    public ModeleJTableGenre(DaoFilm leDaoFilm) {
        this.leConteneurGenre = new ArrayList<>();
        this.titre = new String[]{"nomGenre"};
        this.leDaoFilm = leDaoFilm;
    }

    public void chargerGenre() throws SQLException {
        leDaoFilm.lireLesGenres(leConteneurGenre);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return leConteneurGenre.size();
    }


    @Override
    public int getColumnCount() {
        return titre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        String nomGenre = leConteneurGenre.get(row);
        if (column == 0) {
            return nomGenre;

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }

}
