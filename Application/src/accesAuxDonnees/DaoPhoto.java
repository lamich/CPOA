/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cyrille
 */
public class DaoPhoto {

    private final Connection connexion;

    public DaoPhoto(Connection connexion) throws SQLException {
        this.connexion = connexion;
    }

    public void ajoutPhoto(String NumeroVip, int numSequentiel, String LieuPhoto, Date datePhoto, int profil) throws Exception {
        String requete = "insert into PHOTOVIP (NumeroVip, numSequentiel, LieuPhoto, anneePhoto, profil) values (?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = connexion.prepareStatement(requete);

            pstmt.setInt(1, Integer.parseInt(NumeroVip));
            pstmt.setInt(2, numSequentiel);
            pstmt.setString(3, LieuPhoto);
            pstmt.setDate(4, datePhoto);
            pstmt.setInt(5, profil);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }

    public int numSequentielMax(String NumeroVip) throws Exception {
        int numSequentiel = 0, numVip = Integer.valueOf(NumeroVip);

        String requete = "select MAX(numSequentiel) from PHOTOVIP where numVip = ? ";
        try (PreparedStatement pstmt = connexion.prepareStatement(requete)) {
            pstmt.setInt(1, numVip);
            ResultSet rset = pstmt.executeQuery(requete);
            while (rset.next()) {       // traitement du résulat
                numSequentiel = rset.getInt(1);
               
            }
            rset.close();
        }

        return numSequentiel;
    }

    public void ModificationProfil(String NumeroVip) throws SQLException {
        int numVip = Integer.valueOf(NumeroVip);

        String requete = "update PHOTOVIP set profil =? where numVip=? and profil=? ";
        PreparedStatement pstmt;
        String erreur = null;

        pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, 0);
        pstmt.setInt(2, numVip);
        pstmt.setInt(3,1);
        pstmt.executeUpdate();
        pstmt.close();

    }
}
