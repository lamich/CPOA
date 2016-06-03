package metier;

import java.sql.Date;

/**
 *
 * @author cyrille
 */
public class Evenement {

    private int numVip;
    private Date dateMariage;
    private int numConjoint;
    private String lieuMariage;
    private Date dateDivorce;

    public Evenement() {
    }

    public Evenement(int numVip, Date dateMariage, int numConjoint, String lieuMariage, Date dateDivorce) {
        this.numVip = numVip;
        this.dateMariage = dateMariage;
        this.numConjoint = numConjoint;
        this.lieuMariage = lieuMariage;
        this.dateDivorce = dateDivorce;
    }

    public Evenement(int numVip, Date dateMariage, int numConjoint, String lieuMariage) {
        this.numVip = numVip;
        this.dateMariage = dateMariage;
        this.numConjoint = numConjoint;
        this.lieuMariage = lieuMariage;

    }

    public int getNumVip() {
        return numVip;
    }

    public Date getDateMariage() {
        return dateMariage;
    }

    public int getNumConjoint() {
        return numConjoint;
    }

    public String getLieuMariage() {
        return lieuMariage;
    }

    public Date getDateDivorce() {
        return dateDivorce;
    }

    public void setNumVip(int numVip) {
        this.numVip = numVip;
    }

    public void setDateMariage(Date dateMariage) {
        this.dateMariage = dateMariage;
    }

    public void setNumConjoint(int numConjoint) {
        this.numConjoint = numConjoint;
    }

    public void setLieuMariage(String lieuMariage) {
        this.lieuMariage = lieuMariage;
    }

    public void setDateDivorce(Date dateDivorce) {
        this.dateDivorce = dateDivorce;
    }

}
