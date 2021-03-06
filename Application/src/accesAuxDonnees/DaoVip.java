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
        String requete = "select numVip, nomVip, prenomVip, civilite, dateNaissance, lieuNaissance, codeRole, nomPays, codeStatut from VIP ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat

            String numVip = Integer.toString(rset.getInt(1));
            String nomVip = rset.getString(2);
            String prenomVip = rset.getString(3);
            String civilite = rset.getString(4);
            Date dateNaissance = rset.getDate(5);
            String lieuNaissance = rset.getString(6);
            String codeRole = rset.getString(7);
            String nomPays = rset.getString(8);
            String codeStatut = rset.getString(9);

            VIP temp = new VIP(numVip, nomVip, prenomVip, civilite, dateNaissance, lieuNaissance, codeRole, nomPays, codeStatut);
            lesVip.add(temp);

        }
        rset.close();
        pstmt.close();
    }

    public void insererVIP(VIP Vip) {

        String requete = "insert into VIP (nomVip, prenomVip, civilite, dateNaissance, lieuNaissance, codeRole, nomPays, codeStatut) values (?,?,?,?,?,?,?,? )";
        PreparedStatement pstmt;
        try {
            pstmt = connexion.prepareStatement(requete);

            pstmt.setString(1, Vip.getNomVip());
            pstmt.setString(2, Vip.getPrenomVip());
            pstmt.setString(3, Vip.getCivilite());
            pstmt.setDate(4, Vip.getDateNaissance());
            pstmt.setString(5, Vip.getLieuNaissance());
            pstmt.setString(6, Vip.getCodeRole());
            pstmt.setString(7, Vip.getNomPays());
            pstmt.setString(8, Vip.getCodeStatut());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Exception DAO : " + e.getMessage());
        }

    }

    public void supprimerVip(String numVip) {
        String requete = "delete from VIP where numVip = ?";
        PreparedStatement pstmt;
        try {
            pstmt = connexion.prepareStatement(requete);
            pstmt.setInt(1, Integer.parseInt(numVip));
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Exception sup DAO : " + e.getMessage());
        }
    }

    public void lireVipMariage(List<VIP> lesvip) throws SQLException {
        String requete = "select numVip, nomVip, prenomVip from VIP ";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) {       // traitement du résulat

            String numVip = Integer.toString(rset.getInt(1));
            String nomVip = rset.getString(2);
            String prenomVip = rset.getString(3);
            VIP temp = new VIP(numVip, nomVip, prenomVip);
            lesvip.add(temp);

        }
        rset.close();
        pstmt.close();
    }

    public boolean rechercherMariage(int numvip) throws SQLException {
        boolean resultat = true;
        PreparedStatement pstmt = connexion.prepareStatement("select codeStatut from VIP where numVip= ? ");
        pstmt.setInt(1, numvip);
        ResultSet rset = pstmt.executeQuery();
        while (rset.next()) {
            String codestatut = rset.getString(1);
            if (codestatut.contains("C") || codestatut.contains("D")) {
                resultat = false;
            }
        }
        rset.close();
        pstmt.close();
        return resultat;
    }

    public Date rechercherDateDivorce(String numVip) throws SQLException {
        
        Date max=null;
        PreparedStatement pstmt = connexion.prepareStatement("select codeStatut from VIP where numVip= ? ");
        pstmt.setInt(1, Integer.parseInt(numVip));
        ResultSet rset = pstmt.executeQuery();
        while (rset.next()) {
            String codestatut = rset.getString(1);
            if (codestatut.contains("D")) {
                PreparedStatement pstmt2 = connexion.prepareStatement("select dateDivorce from EVENEMENT where numVip= ? or numConjoint=? and dateDivorce!=null");
                pstmt2.setInt(1, Integer.parseInt(numVip));
                pstmt2.setInt(2, Integer.parseInt(numVip));
                ResultSet rset2 = pstmt2.executeQuery();
                while (rset2.next()) {
                    if(max==null){
                        max=rset2.getDate(1);
                    }
                    else
                        if(max.compareTo(rset2.getDate(1))==-1){
                            max=rset2.getDate(1);
                        }
                    

                }
            }
        }
        rset.close();
        pstmt.close();
        return max;
    }
}
