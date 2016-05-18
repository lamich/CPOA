/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import javax.swing.JOptionPane;
import metier.VIP;

/**
 *
 * @author cyrille
 */
public class FenetreSaisie extends javax.swing.JDialog {

    private VIP vip;
    private boolean etatSortie;
    
    public FenetreSaisie(java.awt.Frame parent, VIP vip) {
        super(parent, true);  // mode modal       
        this.vip = vip;
        etatSortie = false;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCodeStatut = new javax.swing.ButtonGroup();
        buttonGroupCivilite = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lbNomVip = new javax.swing.JLabel();
        lbPrenomVip = new javax.swing.JLabel();
        lbCiviliteVip = new javax.swing.JLabel();
        lbDateNaissanceVip = new javax.swing.JLabel();
        lbLieuNaissanceVip = new javax.swing.JLabel();
        lbCodeRoleVip = new javax.swing.JLabel();
        lbNomPaysVip = new javax.swing.JLabel();
        lbCodeStatutVip = new javax.swing.JLabel();
        jTFNomVip = new javax.swing.JTextField();
        jTFPrenomVip = new javax.swing.JTextField();
        jComboBoxNomPays = new javax.swing.JComboBox<>();
        jRbMarie = new javax.swing.JRadioButton();
        jRbCelibataire = new javax.swing.JRadioButton();
        btCalendrier = new javax.swing.JButton();
        jTFDateNaissanceVip = new javax.swing.JTextField();
        jRbFemme = new javax.swing.JRadioButton();
        jRbHomme = new javax.swing.JRadioButton();
        jTFLieuNaissanceVip = new javax.swing.JTextField();
        jRbActeur = new javax.swing.JRadioButton();
        jRbRealisateur = new javax.swing.JRadioButton();
        btValid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbNomVip.setText("Nom");

        lbPrenomVip.setText("Prenom");

        lbCiviliteVip.setText("Civilité");

        lbDateNaissanceVip.setText("Date de naissance");

        lbLieuNaissanceVip.setText("Lieu de naissance");

        lbCodeRoleVip.setText("Code role");

        lbNomPaysVip.setText("Nom pays");

        lbCodeStatutVip.setText("Code statut");

        jTFNomVip.setMinimumSize(new java.awt.Dimension(80, 20));
        jTFNomVip.setPreferredSize(new java.awt.Dimension(80, 20));
        jTFNomVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomVipActionPerformed(evt);
            }
        });

        jComboBoxNomPays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNomPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNomPaysActionPerformed(evt);
            }
        });

        buttonGroupCodeStatut.add(jRbMarie);
        jRbMarie.setText("Marié(e)");

        buttonGroupCodeStatut.add(jRbCelibataire);
        jRbCelibataire.setText("Célibataire");

        btCalendrier.setText("Calendrier");

        jTFDateNaissanceVip.setEditable(false);

        buttonGroupCivilite.add(jRbFemme);
        jRbFemme.setText("Femme");

        buttonGroupCivilite.add(jRbHomme);
        jRbHomme.setText("Homme");

        jRbActeur.setText("Acteur");

        jRbRealisateur.setText("Réalisateur");

        btValid.setText("Valider");
        btValid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDateNaissanceVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCodeStatutVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCiviliteVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbLieuNaissanceVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCodeRoleVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNomPaysVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPrenomVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNomVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRbActeur)
                            .addComponent(jRbMarie)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNomVip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFPrenomVip)
                                .addComponent(jComboBoxNomPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTFLieuNaissanceVip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(jTFDateNaissanceVip, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jRbFemme))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRbHomme)
                                    .addComponent(btCalendrier)
                                    .addComponent(jRbRealisateur)
                                    .addComponent(jRbCelibataire)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btValid)))
                .addGap(8, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomVip)
                    .addComponent(jTFNomVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrenomVip)
                    .addComponent(jTFPrenomVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCiviliteVip)
                    .addComponent(jRbFemme)
                    .addComponent(jRbHomme))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateNaissanceVip)
                    .addComponent(btCalendrier)
                    .addComponent(jTFDateNaissanceVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLieuNaissanceVip)
                    .addComponent(jTFLieuNaissanceVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodeRoleVip)
                    .addComponent(jRbActeur)
                    .addComponent(jRbRealisateur))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomPaysVip)
                    .addComponent(jComboBoxNomPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodeStatutVip)
                    .addComponent(jRbMarie)
                    .addComponent(jRbCelibataire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btValid)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNomPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNomPaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNomPaysActionPerformed

    private void jTFNomVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomVipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomVipActionPerformed

    private void btValidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidActionPerformed
        // TODO add your handling code here:
        try {
            if (jTFNomVip.getText().isEmpty()) {
                throw new Exception("champ Nom Vip vide");
            }
            vip.setNomVip(jTFNomVip.getText());
            
            if (jTFPrenomVip.getText().isEmpty()) {
                throw new Exception("champ Prenom Vip vide");
            }
            vip.setPrenomVip(jTFPrenomVip.getText());
            
             if (!jRbFemme.isSelected() && !jRbHomme.isSelected() ) {
                throw new Exception("champ Civilité vide");
            }
             else{
                 if(!jRbFemme.isSelected()){
                     vip.setCivilite("Homme");
                 }
                 else{
                     vip.setCivilite("Femme");
                 }
            }
            
            
            
            
            
            
            
             
             
            
            
            

            etatSortie = true;
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btValidActionPerformed

public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalendrier;
    private javax.swing.JButton btValid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroupCivilite;
    private javax.swing.ButtonGroup buttonGroupCodeStatut;
    private javax.swing.JComboBox<String> jComboBoxNomPays;
    private javax.swing.JRadioButton jRbActeur;
    private javax.swing.JRadioButton jRbCelibataire;
    private javax.swing.JRadioButton jRbFemme;
    private javax.swing.JRadioButton jRbHomme;
    private javax.swing.JRadioButton jRbMarie;
    private javax.swing.JRadioButton jRbRealisateur;
    private javax.swing.JTextField jTFDateNaissanceVip;
    private javax.swing.JTextField jTFLieuNaissanceVip;
    private javax.swing.JTextField jTFNomVip;
    private javax.swing.JTextField jTFPrenomVip;
    private javax.swing.JLabel lbCiviliteVip;
    private javax.swing.JLabel lbCodeRoleVip;
    private javax.swing.JLabel lbCodeStatutVip;
    private javax.swing.JLabel lbDateNaissanceVip;
    private javax.swing.JLabel lbLieuNaissanceVip;
    private javax.swing.JLabel lbNomPaysVip;
    private javax.swing.JLabel lbNomVip;
    private javax.swing.JLabel lbPrenomVip;
    // End of variables declaration//GEN-END:variables
}
