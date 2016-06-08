/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DaoVip;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.VIP;

/**
 *
 * @author cyrille
 */
public class ModeleJTableMariage extends AbstractTableModel {

    public List<VIP> leConteneur;
    // le titre des champs du conteneur
    private String[] titre;
    // l'objet DAO pour mettre à jour le conteneur
    private DaoVip leDaoVip;

    public ModeleJTableMariage(DaoVip leDaoVip) {
        // définition du conteneur d'étudiants
        this.leConteneur = new ArrayList<>();
        // définition des noms du champ
        this.titre = new String[]{"numVip", "nomVip", "prenomVip"};
        // l'objet DAO utilisé
        this.leDaoVip = leDaoVip;
    }

    @Override
    public int getRowCount() {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount() {
        return titre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        VIP Vip = leConteneur.get(row);
        if (column == 0) {

            return Vip.getNumVip();
        } else if (column == 1) {

            return Vip.getNomVip();
        } else if (column == 2) {

            return Vip.getPrenomVip();
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }
    public void chargerLesVipMariage() throws SQLException {
        leDaoVip.lireVipMariage(leConteneur);
        fireTableDataChanged();  // notification de modification des données à la vue
    }

    public boolean rechercheMariage(int numvip) throws SQLException {
        boolean res = leDaoVip.rechercherMariage(numvip);
        return res;
        
    }
    
    

}
