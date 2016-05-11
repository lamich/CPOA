/*
 * To change this template, choose Tools | Templates
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
 * @author Alain
 */
public class ModeleJTable extends AbstractTableModel {
    // le conteneur de données

    private List<VIP> leConteneur;
    // le titre des champs du conteneur
    private String[] titre;
    // l'objet DAO pour mettre à jour le conteneur
    private DaoVip leDaoVip;

    public ModeleJTable(DaoVip leDaoVip) {
        // définition du conteneur d'étudiants
        this.leConteneur = new ArrayList<>();
        // définition des noms du champ
        this.titre = new String[]{"numVip", "nomVip", "prenomVip", "civilite", "dateNaissance", "lieuNaissance", "codeRole", "nomPays", "codeStatut"};
        // l'objet DAO utilisé
        this.leDaoVip= leDaoVip;
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
        if  (column == 0) {
            
            return Vip.getNumVip();
        }
        else if (column == 1) {
            
            return Vip.getNomVip();
        }
        else if (column == 2) {
            
            return Vip.getPrenomVip();
        }
        else if  (column == 3) {
            
            return Vip.getCivilite();
        }
        else if  (column == 4) {
            
            return Vip.getDateNaissance();
        }
        else if  (column == 5) {
            
            return Vip.getLieuNaissance();
        }
        else if  (column == 6) {
            
            return Vip.getCodeRole();
        }
        else if  (column == 7) {
            
            return Vip.getNomPays();
        }
        else if  (column == 8) {
            
            return Vip.getCodeStatut();
        }
        return 0;
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }

//    public void insererEmploye(VIP pays) throws SQLException {
//        leDaoEmp.insererEmploye(pays);
//        leConteneur.add(emp);
//        this.fireTableDataChanged();
//    }

//    public void supprimerEmploye(int ligne) throws SQLException {
//        int numEmp = (int) getValueAt(ligne, 0);
//        leDaoEmp.supprimerEmploye(numEmp);
//        leConteneur.remove(ligne);
//        this.fireTableDataChanged();
//    }

    public void chargerLesVip() throws SQLException {
        leDaoVip.lireLesVip(leConteneur);
        fireTableDataChanged();  // notification de modification des données à la vue
    }
}
