/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import accesAuxDonnees.DaoEvenement;
import accesAuxDonnees.DaoFilm;
import accesAuxDonnees.DaoPays;
import accesAuxDonnees.DaoPhoto;
import accesAuxDonnees.DaoVip;
import accesAuxDonnees.SourceMySql;
import ihm.FenetreApplication;
import ihm.FenetreIdentification;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modele.ModeleJComboBox;
import modele.ModeleJTableActeur;
import modele.ModeleJTableEvenement;
import modele.ModeleJTableFilm;
import modele.ModeleJTableGenre;
import modele.ModeleJTableMariage;
import modele.ModeleJTableRealisateur;
import modele.ModeleJTableVip;
import modele.ModelePhoto;

/**
 *
 * @author cyrille
 */
public class Appli {

    private static DataSource laSourceDeDonnees;
    private static Connection laConnexion;
    private static DaoVip daoVip;
    private static DaoPays daoPays;
    private static DaoEvenement daoEvenement;
    private static DaoPhoto daoPhoto;
    private static DaoFilm daoFilm;
    
    public static void main(String[] args) {
        
        // Look and Feel windows
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.print(e.getMessage());
        }
        
        boolean etat = false;
        do {
            FenetreIdentification fi = new FenetreIdentification(null);
            PasswordAuthentication login = fi.identifier();
            try {
                laSourceDeDonnees = SourceMySql.getSource(login);
                laConnexion = laSourceDeDonnees.getConnection();
                etat = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "login incorrect : " + ex.getMessage(),
                        "avertissement", JOptionPane.WARNING_MESSAGE);
            }
        } while (etat == false);
        
        try {
            // les DAO nécessaires
            daoVip = new DaoVip(laConnexion);
            daoPays = new DaoPays(laConnexion);
            daoEvenement = new DaoEvenement(laConnexion);
            daoPhoto = new DaoPhoto(laConnexion);
            daoFilm = new DaoFilm(laConnexion);
            // les modèles de données avec le DAO à partir duquel se feront les échanges de données
            final ModeleJTableVip leModeleVip = new ModeleJTableVip(daoVip);
            final ModeleJComboBox leModeleComboBox = new ModeleJComboBox(daoPays);
            final ModeleJTableEvenement leModeleEvenement = new ModeleJTableEvenement(daoEvenement);
            final ModeleJTableMariage leModelMariage = new ModeleJTableMariage(daoVip);
            final ModelePhoto leModelPhoto = new ModelePhoto(daoPhoto);
            final ModeleJTableFilm leModelFilm = new ModeleJTableFilm(daoFilm);
            final ModeleJTableRealisateur leModelRealisateur = new ModeleJTableRealisateur(daoFilm);
            final ModeleJTableActeur leModelActeur = new ModeleJTableActeur(daoFilm);
            final ModeleJTableGenre leModelGenre = new ModeleJTableGenre(daoFilm);
            // la fenetre principale de l'application qui tourne dans l'EDT
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new FenetreApplication(leModeleVip,leModeleComboBox,leModeleEvenement,leModelMariage,leModelPhoto,leModelFilm,leModelRealisateur,leModelActeur,leModelGenre).setVisible(true);
                }
            });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problème dans la création des objets nécessaires" + ex.getMessage(),
                    "avertissement", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
