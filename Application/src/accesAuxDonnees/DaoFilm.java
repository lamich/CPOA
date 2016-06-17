/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import metier.VIP;

/**
 *
 * @author cyrille
 */
public class DaoFilm {

    private final Connection connexion;

    public DaoFilm(Connection connexion) {
        this.connexion = connexion;
    }

    public void lireLesRealisateurs(List<VIP> lesRealisateurs) throws SQLException {
        String requete = "select * from VIP";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {// traitement du résulat
            if (rset.getString(7).equalsIgnoreCase("R") || rset.getString(7).equalsIgnoreCase("AR")) {
                int numVip = rset.getInt(1);
                String nomVip = rset.getString(2);
                VIP temp = new VIP(Integer.toString(numVip), nomVip);
                lesRealisateurs.add(temp);
            }

        }
        rset.close();
        pstmt.close();

    }

    public void lireLesActeurs(List<VIP> lesActeurs) throws SQLException {
        String requete = "select * from VIP";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat
            if (rset.getString(7).equalsIgnoreCase("A") || rset.getString(7).equalsIgnoreCase("AR")) {
                String numVip = rset.getString(1);
                String nomVip = rset.getString(2);
                VIP temp = new VIP(numVip, nomVip);
                lesActeurs.add(temp);
            }
        }
        rset.close();
        pstmt.close();
    }

    public void lireLesGenres(List<String> lesGenres) throws SQLException {
        String requete = "select * from GENRE ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat
            String nomGenre = rset.getString(1);
            lesGenres.add(nomGenre);
        }
        rset.close();
        pstmt.close();
    }

    public void ajouterFilm(int numVisa, String titre, Date dateSortie) throws SQLException {
        String requete = "insert into FILM (numVisa, titre, anneeSortie) values (?,?,?)";
        PreparedStatement pstmt;
        String erreur = null;
        pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVisa);
        pstmt.setString(2, titre);
        pstmt.setDate(3, (java.sql.Date) dateSortie);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void ajoutCasting(int numVip, int numVisa) throws SQLException {
        String requete = "insert into CASTING (numVip,numVisa) values (?,?)";
        PreparedStatement pstmt;
        pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip);
        pstmt.setInt(2, numVisa);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void ajoutRealise(int numVip, int numVisa) throws SQLException {
        String requete = "insert into REALISE (numVip,numVisa) values (?,?)";
        PreparedStatement pstmt;
        pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip);
        pstmt.setInt(2, numVisa);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void ajoutGenre(int numVisa, String genre) throws SQLException {
        String requete = "insert into FILMGENRE (numVisa,libelleGenre) values (?,?)";
        PreparedStatement pstmt;
        pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVisa);
        pstmt.setString(2, genre);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
