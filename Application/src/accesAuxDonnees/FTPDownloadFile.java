package accesAuxDonnees;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPSClient;

/**
 *
 * @author Guillaume
 */
public class FTPDownloadFile {

    private String server = "iutdoua-samba.univ-lyon1.fr";
    private int port = 990;
    private String user = "p1403994";
    private String pass = "A123456a";

    public FTPDownloadFile(String filePath, String fileName) {
        FTPSClient ftpClient = new FTPSClient();

        try {

            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
            //Création de l'objet à envoyer
            File firstLocalFile = new File(filePath);
            String firstRemoteFile = new String();
            firstRemoteFile = "public_html/Projet_Vip/assets/images/vip/" + fileName;
            InputStream inputStream = new FileInputStream(firstLocalFile);
            
            System.out.println("Début de l'upload du fichier ... ");
            
            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
            inputStream.close();
            if (done) {
                System.out.println("Upload réussi ! ");
            } else {
                System.out.println("Erreur lors de l'upload !");
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
