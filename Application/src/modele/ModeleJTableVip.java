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
public class ModeleJTableVip extends AbstractTableModel {
    // le conteneur de données

    public List<VIP> leConteneur;
    // le titre des champs du conteneur
    private String[] titre;
    // l'objet DAO pour mettre à jour le conteneur
    private DaoVip leDaoVip;

    public ModeleJTableVip(DaoVip leDaoVip) {
        // définition du conteneur d'étudiants
        this.leConteneur = new ArrayList<>();
        // définition des noms du champ
        this.titre = new String[]{"numVip", "nomVip", "prenomVip", "civilite", "dateNaissance", "lieuNaissance", "codeRole", "nomPays", "codeStatut"};
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
        } else if (column == 3) {
            return Vip.getCivilite();
        } else if (column == 4) {
            return Vip.getDateNaissance();
        } else if (column == 5) {
            return Vip.getLieuNaissance();
        } else if (column == 6) {
            return Vip.getCodeRole();
        } else if (column == 7) {
            return Vip.getNomPays();
        } else if (column == 8) {
            return Vip.getCodeStatut();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }

    public void insererVip(VIP Vip) {
        try {
            leDaoVip.insererVIP(Vip);
            leConteneur.add(Vip);
            this.fireTableDataChanged();

        } catch (Exception e) {
            System.out.println("Exception insererVip modele : " + e.getMessage());
        }
    }

    public void chargerLesVip() throws SQLException {
        leDaoVip.lireLesVip(leConteneur);
        fireTableDataChanged();  // notification de modification des données à la vue
    }

    public void supprimerVIP(int ligne)  {
        String numVip = getValueAt(ligne, 0).toString();
        leDaoVip.supprimerVip(numVip);
        leConteneur.remove(ligne);
        this.fireTableDataChanged();
    }

    public void rafraichir() throws SQLException {
        leConteneur.clear();
        leDaoVip.lireLesVip(leConteneur);
        this.fireTableDataChanged();

    }

}
