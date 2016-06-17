/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import accesAuxDonnees.DaoPhoto;
import accesAuxDonnees.FTPDownloadFile;
import java.sql.Date;

/**
 *
 * @author cyrille
 */
public class ModelePhoto {

    private DaoPhoto daoPhoto;

    public ModelePhoto(DaoPhoto daoPhoto) {
        this.daoPhoto=daoPhoto;
    }

    public void AjouterPhoto(String URLPhoto, String NumeroVip, Date datePhoto, String LieuPhoto, int profil) {

            int numSequentiel=1;
//            numSequentiel = daoPhoto.numSequentielMax(NumeroVip) + 1;
//            if (profil == 1) {
//                daoPhoto.ModificationProfil(NumeroVip);
//            }
//            daoPhoto.ajoutPhoto(NumeroVip, numSequentiel, LieuPhoto, datePhoto, profil);
//          String nomPhoto = NumeroVip + numSequentiel;
            FTPDownloadFile FTP = new FTPDownloadFile(URLPhoto, "1");

    }

    

}
