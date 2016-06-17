/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DaoFilm;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.VIP;

/**
 *
 * @author cyrille
 */
public class ModeleJTableFilm {

    private DaoFilm leDaoFilm;
//    private String Realisateur;
//    private List<String> leConteneurActeur;
//    private List<String> leConteneurGenre;
//    String NumVisa;
//    String TitreFilm;
//    Date dateSortie;

    public ModeleJTableFilm(DaoFilm leDaoFilm) {
        this.leDaoFilm = leDaoFilm;
    }

    public String Ajouter(String NumVisa, String TitreFilm, Date dateSortie, String Realisateur, List<String> leConteneurGenre, List<String> leConteneurActeur) {
        String Erreur = "null";
        try {
            leDaoFilm.ajouterFilm(Integer.parseInt(NumVisa), TitreFilm, dateSortie);
            for (String numVip : leConteneurActeur) {
                leDaoFilm.ajoutCasting(Integer.parseInt(numVip), Integer.parseInt(NumVisa));
            }
            leDaoFilm.ajoutRealise(Integer.parseInt(Realisateur), Integer.parseInt(NumVisa));
            for (String libelleGenre : leConteneurGenre) {
                leDaoFilm.ajoutGenre(Integer.parseInt(NumVisa), libelleGenre);
            }
            Erreur = "OK";
        } catch (SQLException ex) {
            Logger.getLogger(ModeleJTableFilm.class.getName()).log(Level.SEVERE, null, ex);
            Erreur = ex.getMessage();
        }
        return Erreur;
    }

}
