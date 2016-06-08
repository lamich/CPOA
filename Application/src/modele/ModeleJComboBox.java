/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DaoPays;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import metier.Pays;


public class ModeleJComboBox extends AbstractListModel implements ComboBoxModel {
     private List<Pays> leConteneur;
    // l'objet DAO pour mettre à jour le conteneur
    private DaoPays leDaoPays;
    private String selection = "France";

    public ModeleJComboBox(DaoPays leDaoPays) {
        // définition du conteneur d'étudiants
        this.leConteneur = new ArrayList<>();
        // l'objet DAO utilisé
        this.leDaoPays= leDaoPays;
    }
    public void chargerPays() throws SQLException {
        leDaoPays.lireLesPays(leConteneur); 
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }

    @Override
    public Object getElementAt(int index) {
        String pays = leConteneur.get(index).getNomPays();
        return pays;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection=(String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }
   
}
