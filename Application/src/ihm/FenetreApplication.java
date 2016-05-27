/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.VIP;
import modele.ModeleJComboBox;
import modele.ModeleJTable;

/**
 *
 * @author Alain
 */
public class FenetreApplication extends javax.swing.JFrame {

    private ModeleJTable leModele;
    private ModeleJComboBox leModeleComboBox;

    public FenetreApplication(ModeleJTable leModele,ModeleJComboBox leModeleComboBox) {
        this.leModele = leModele;
        this.leModeleComboBox = leModeleComboBox;
        // initialisation
        initComponents();
        // affichage
        try {
            leModele.chargerLesVip();
            leModeleComboBox.chargerPays();
        } catch (Exception ex) {
            Logger.getLogger(FenetreApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelVip = new javax.swing.JPanel();
        btAjouterVip = new javax.swing.JButton();
        btSupprimerVip = new javax.swing.JButton();
        jSPVip = new javax.swing.JScrollPane();
        jTableVip = new javax.swing.JTable();
        jPanelEvenement = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelPhoto = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Affichage des employés");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btAjouterVip.setText("Ajouter");
        btAjouterVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjouterVipActionPerformed(evt);
            }
        });

        btSupprimerVip.setText("Supprimer");
        btSupprimerVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupprimerVipActionPerformed(evt);
            }
        });

        jTableVip.setModel(leModele);
        jSPVip.setViewportView(jTableVip);

        javax.swing.GroupLayout jPanelVipLayout = new javax.swing.GroupLayout(jPanelVip);
        jPanelVip.setLayout(jPanelVipLayout);
        jPanelVipLayout.setHorizontalGroup(
            jPanelVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVipLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSupprimerVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAjouterVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jSPVip, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelVipLayout.setVerticalGroup(
            jPanelVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVipLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btAjouterVip)
                .addGap(70, 70, 70)
                .addComponent(btSupprimerVip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVipLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSPVip, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("VIP", jPanelVip);

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelEvenementLayout = new javax.swing.GroupLayout(jPanelEvenement);
        jPanelEvenement.setLayout(jPanelEvenementLayout);
        jPanelEvenementLayout.setHorizontalGroup(
            jPanelEvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvenementLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEvenementLayout.setVerticalGroup(
            jPanelEvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvenementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Evenement", jPanelEvenement);

        javax.swing.GroupLayout jPanelPhotoLayout = new javax.swing.GroupLayout(jPanelPhoto);
        jPanelPhoto.setLayout(jPanelPhotoLayout);
        jPanelPhotoLayout.setHorizontalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanelPhotoLayout.setVerticalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Photo", jPanelPhoto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez vraiment sortir ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (reponse == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btAjouterVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjouterVipActionPerformed
        try {
            VIP Vip = new VIP();
//            leModele.recuperer_numemro_dernier_vip();
            FenetreSaisie laSaisie = new FenetreSaisie(this, Vip,leModeleComboBox);
            if (laSaisie.doModal() == true) {
            leModele.insererVip(Vip);
            leModele.rafraichir();
            }
        } catch (Exception e) {
            System.out.println("Exception à l'insertion : " + e.getMessage());
        }
    }//GEN-LAST:event_btAjouterVipActionPerformed

    private void btSupprimerVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupprimerVipActionPerformed
        try {
            int ligne = jTableVip.getSelectedRow();
            leModele.supprimerVIP(ligne);
        } catch (Exception e) {
            System.out.println("Exception à la suppression : " + e.getMessage());
        }
    }//GEN-LAST:event_btSupprimerVipActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjouterVip;
    private javax.swing.JButton btSupprimerVip;
    private javax.swing.JPanel jPanelEvenement;
    private javax.swing.JPanel jPanelPhoto;
    private javax.swing.JPanel jPanelVip;
    private javax.swing.JScrollPane jSPVip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableVip;
    // End of variables declaration//GEN-END:variables
}
