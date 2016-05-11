/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Date;



/**
 *
 * @author cyrille
 */
public class VIP {
       private String numVip;
       private String nomVip;
       private String prenomVip;
       private String civilite;
       private Date dateNaissance;
       private String lieuNaissance;
       private String codeRole;
       private String nomPays;
       private String codeStatut;
       
       

    public VIP(String numVip, String nomVip,String prenomVip, String civilite, Date dateNaissance, String lieuNaissance, String codeRole, String nomPays, String codeStatut) {
        this.numVip = numVip;
        this.nomVip = nomVip;
        this.prenomVip = prenomVip;
        this.civilite = civilite;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.codeRole = codeRole;
        this.nomPays = nomPays;
        this.codeStatut = codeStatut;
    }


    public String getNumVip() {
        return numVip;
    }

    public String getNomVip() {
        return nomVip;
    }

    public String getPrenomVip() {
        return prenomVip;
    }

    public String getCivilite() {
        return civilite;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getCodeRole() {
        return codeRole;
    }

    public String getNomPays() {
        return nomPays;
    }

    public String getCodeStatut() {
        return codeStatut;
    }


    public void setNumVip(String numVip) {
        this.numVip = numVip;
    }

    public void setNomVip(String nomVip) {
        this.nomVip = nomVip;
    }

    public void setPrenomVip(String prenomVip) {
        this.prenomVip = prenomVip;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setCodeRole(String codeRole) {
        this.codeRole = codeRole;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setCodeStatut(String codeStatut) {
        this.codeStatut = codeStatut;
    }

       

    
       
    
}
