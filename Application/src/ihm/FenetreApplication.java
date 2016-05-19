/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.VIP;
import modele.ModeleJTable;

/**
 *
 * @author Alain
 */
public class FenetreApplication extends javax.swing.JFrame {

    private ModeleJTable leModele;

    public FenetreApplication(ModeleJTable leModele) {
        this.leModele = leModele;
        // initialisation
        initComponents();
        // affichage
        try {
            leModele.chargerLesVip();
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
        laTableVip = new javax.swing.JTable();
        btAjouterVip = new javax.swing.JButton();
        btSupprimerVip = new javax.swing.JButton();
        jPanelEvenement = new javax.swing.JPanel();
        jTable1 = new javax.swing.JTable();
        jPanelPhoto = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Affichage des employés");
        setPreferredSize(new java.awt.Dimension(800, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        laTableVip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        laTableVip.setModel(leModele);
        laTableVip.setPreferredSize(new java.awt.Dimension(500, 450));

        btAjouterVip.setText("Ajpouter");
        btAjouterVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjouterVipActionPerformed(evt);
            }
        });

        btSupprimerVip.setText("Supprimer");

        javax.swing.GroupLayout jPanelVipLayout = new javax.swing.GroupLayout(jPanelVip);
        jPanelVip.setLayout(jPanelVipLayout);
        jPanelVipLayout.setHorizontalGroup(
            jPanelVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVipLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAjouterVip)
                    .addComponent(btSupprimerVip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(laTableVip, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelVipLayout.setVerticalGroup(
            jPanelVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVipLayout.createSequentialGroup()
                .addGroup(jPanelVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVipLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(laTableVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVipLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btAjouterVip)
                        .addGap(70, 70, 70)
                        .addComponent(btSupprimerVip)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VIP", jPanelVip);

        javax.swing.GroupLayout jPanelEvenementLayout = new javax.swing.GroupLayout(jPanelEvenement);
        jPanelEvenement.setLayout(jPanelEvenementLayout);
        jPanelEvenementLayout.setHorizontalGroup(
            jPanelEvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEvenementLayout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelEvenementLayout.setVerticalGroup(
            jPanelEvenementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvenementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Evenement", jPanelEvenement);

        javax.swing.GroupLayout jPanelPhotoLayout = new javax.swing.GroupLayout(jPanelPhoto);
        jPanelPhoto.setLayout(jPanelPhotoLayout);
        jPanelPhotoLayout.setHorizontalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );
        jPanelPhotoLayout.setVerticalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
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
            VIP vip = new VIP();
            FenetreSaisie laSaisie = new FenetreSaisie(this, vip);
            if (laSaisie.doModal() == true) {
               
            }
        } catch (Exception e) {
            System.out.println("Exception à l'insertion : " + e.getMessage());
        }
    }//GEN-LAST:event_btAjouterVipActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjouterVip;
    private javax.swing.JButton btSupprimerVip;
    private javax.swing.JPanel jPanelEvenement;
    private javax.swing.JPanel jPanelPhoto;
    private javax.swing.JPanel jPanelVip;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable laTableVip;
    // End of variables declaration//GEN-END:variables
}