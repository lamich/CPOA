/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DaoPays;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import metier.Pays;
import metier.VIP;


public class ModeleJComboBox extends AbstractListModel {
     private List<Pays> leConteneur;
    // le titre des champs du conteneur
    private String[] titre;
    // l'objet DAO pour mettre à jour le conteneur
    private DaoPays leDaoPays;

    public ModeleJComboBox(DaoPays leDaoPays) {
        // définition du conteneur d'étudiants
        this.leConteneur = new ArrayList<>();
        // définition des noms du champ
        this.titre = new String[]{"nomPays"};
        // l'objet DAO utilisé
        this.leDaoPays= leDaoPays;
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
