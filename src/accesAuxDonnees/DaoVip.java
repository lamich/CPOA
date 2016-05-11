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
import metier.VIP;

/**
 *
 * @author cyrille
 */
public class DaoVip {
    private final Connection connexion;
    
    public DaoVip(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
    
    public void lireLesVip(List<VIP> lesVip) throws SQLException {    
        String requete = "select * from VIP ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat
            
            String numVip = rset.getString(1);
            String nomVip = rset.getString(2);
            String prenomVip = rset.getString(3);
            String civilite = rset.getString(4);
            Date dateNaissance = rset.getDate(5);
            String lieuNaissance = rset.getString(6);
            String codeRole = rset.getString(7);
            String nomPays = rset.getString(8);
            String codeStatut = rset.getString(9);
            
            VIP temp = new VIP(numVip,nomVip,prenomVip,civilite,dateNaissance,lieuNaissance,codeRole,nomPays,codeStatut);
            lesVip.add(temp);
        }
        rset.close();
        pstmt.close();     
    }
}
