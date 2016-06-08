/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DaoEvenement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.Evenement;

/**
 *
 * @author cyrille
 */
public class ModeleJTableEvenement extends AbstractTableModel {

    public List<Evenement> leConteneur;
    // le titre des champs du conteneur
    private String[] titre;
    // l'objet DAO pour mettre à jour le conteneur
    private DaoEvenement leDaoEvenement;

    public ModeleJTableEvenement(DaoEvenement leDaoEvenement) {
        // définition du conteneur d'étudiants
        this.leConteneur = new ArrayList<>();
        // définition des noms du champ
        this.titre = new String[]{"numVip", "dateMariage", "numConjoint", "lieuMariage", "dateDivorce"};
        // l'objet DAO utilisé
        this.leDaoEvenement = leDaoEvenement;
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
        Evenement Event = leConteneur.get(row);
        if (column == 0) {

            return Event.getNumVip();
        } else if (column == 1) {

            return Event.getDateMariage();
        } else if (column == 2) {

            return Event.getNumConjoint();
        } else if (column == 3) {

            return Event.getLieuMariage();
        } else if (column == 4) {

            return Event.getDateDivorce();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }

    public void chargerLesEvenement() throws SQLException {
        leDaoEvenement.lireLesEvenement(leConteneur);
        fireTableDataChanged();  // notification de modification des données à la vue
    }

    public String insererMariage(Evenement event) throws SQLException {
        String erreur;
        erreur = leDaoEvenement.insererMariage(event);
        if (erreur == null) {
            leConteneur.add(event);
            this.fireTableDataChanged();
        }
        return erreur;
    }

    public void rafraichir() throws SQLException {

        leConteneur.clear();
        leDaoEvenement.lireLesEvenement(leConteneur);
        this.fireTableDataChanged();

    }

}
