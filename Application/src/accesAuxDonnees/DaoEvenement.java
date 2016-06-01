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
import java.util.List;
import metier.Evenement;

/**
 *
 * @author cyrille
 */
public class DaoEvenement {
    private final Connection connexion;

    public DaoEvenement(Connection connexion) {
        this.connexion = connexion;
    }
    public void lireLesPays(List<Evenement> lesEvenement) throws SQLException {    
        String requete = "select * from EVENEMENT ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat
            
            
            int numVip = rset.getInt(1);
            Date dateMariage = rset.getDate(2);
            int numConjoint = rset.getInt(3);
            String lieuMariage = rset.getString(4);
            Date dateDivorce = rset.getDate(5);
            
            Evenement temp = new Evenement(numVip,dateMariage,numConjoint,lieuMariage,dateDivorce);
            lesEvenement.add(temp);
        }
        rset.close();
        pstmt.close();     
    } 
}
