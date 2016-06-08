/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import metier.Evenement;
import modele.ModeleJTableMariage;

/**
 *
 * @author cyrille
 */
public class FenetreSaisieMariage extends javax.swing.JDialog {

    private Evenement Event;
    private boolean etatSortie;
    private ModeleJTableMariage leModelMariage;
    private String numVip;
    private String numConjoint;

    public FenetreSaisieMariage(java.awt.Frame parent, Evenement event, ModeleJTableMariage leModelMariage) throws SQLException {
        super(parent, true);
        this.Event = event;
        this.leModelMariage = leModelMariage;
        leModelMariage.chargerLesVipMariage();
        etatSortie = false;
        initComponents();
    }

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGauche = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDroit = new javax.swing.JTable();
        jDateChooserDateMariage = new com.toedter.calendar.JDateChooser();
        jTextFieldLieuMariage = new javax.swing.JTextField();
        jLDateMariage = new javax.swing.JLabel();
        jLLieuMariage = new javax.swing.JLabel();
        jTextFieldVip = new javax.swing.JTextField();
        jTextFieldConjoint = new javax.swing.JTextField();
        jLVip1 = new javax.swing.JLabel();
        jLConjoint1 = new javax.swing.JLabel();
        jBAjoutVipConjoint = new javax.swing.JButton();
        jButtonAjouterMariage = new javax.swing.JButton();
        test = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTableGauche.setModel(leModelMariage);
        jScrollPane1.setViewportView(jTableGauche);

        jTableDroit.setModel(leModelMariage);
        jScrollPane2.setViewportView(jTableDroit);

        jDateChooserDateMariage.setDateFormatString("yyyy MM dd");

        jLDateMariage.setText("Date Mariage");

        jLLieuMariage.setText("Lieu de mariage");

        jTextFieldVip.setEditable(false);
        jTextFieldVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVipActionPerformed(evt);
            }
        });

        jTextFieldConjoint.setEditable(false);

        jLVip1.setText("Vip");

        jLConjoint1.setText("Conjoint(e)");

        jBAjoutVipConjoint.setText("Ajout Vip/Conjoint");
        jBAjoutVipConjoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAjoutVipConjointActionPerformed(evt);
            }
        });

        jButtonAjouterMariage.setText("Ajouter");
        jButtonAjouterMariage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterMariageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLLieuMariage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLDateMariage, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jLVip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLConjoint1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooserDateMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTextFieldLieuMariage)
                                    .addComponent(jTextFieldVip)
                                    .addComponent(jTextFieldConjoint, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jBAjoutVipConjoint, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAjouterMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLVip1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAjoutVipConjoint, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConjoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLConjoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDateMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserDateMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLieuMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLieuMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButtonAjouterMariage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVipActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextFieldVipActionPerformed

    private void jBAjoutVipConjointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAjoutVipConjointActionPerformed
        // TODO add your handling code here:
        if (jTableGauche.getSelectedRow() == -1 || jTableDroit.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vous avez rentré aucune personne", "Erreur personne", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int ligneDroit = jTableDroit.getSelectedRow(), ligneGauche = jTableGauche.getSelectedRow(), valeurGauche, valeurDroit;
                valeurDroit = Integer.parseInt((String) leModelMariage.getValueAt(ligneDroit, 0));
                valeurGauche = Integer.parseInt((String) leModelMariage.getValueAt(ligneGauche, 0));
                if (ligneDroit == ligneGauche) {
                    JOptionPane.showMessageDialog(this, "Vous avez rentré deux fois la même personne", "Erreur personne", JOptionPane.ERROR_MESSAGE);
                } else if (leModelMariage.rechercheMariage(valeurGauche) == true && leModelMariage.rechercheMariage(valeurDroit) == false) {
                    JOptionPane.showMessageDialog(this, "Votre Vip est déjà marié(e)", "Erreur vip", JOptionPane.ERROR_MESSAGE);
                } else if (leModelMariage.rechercheMariage(valeurGauche) == false && leModelMariage.rechercheMariage(valeurDroit) == true) {
                    JOptionPane.showMessageDialog(this, "Votre Conjoint(e) est déjà marié(e)", "Erreur conjoint(e)", JOptionPane.ERROR_MESSAGE);
                } else if (leModelMariage.rechercheMariage(valeurGauche) == true && leModelMariage.rechercheMariage(valeurDroit) == true) {
                    JOptionPane.showMessageDialog(this, "Vos deux personnes sont déjà mariées", "Erreur vip et conjoint(e)", JOptionPane.ERROR_MESSAGE);
                } else {
                    jTextFieldConjoint.setText((String) leModelMariage.getValueAt(ligneDroit, 1));
                    jTextFieldVip.setText((String) leModelMariage.getValueAt(ligneGauche, 1));
                    this.numVip = leModelMariage.getValueAt(ligneGauche, 0).toString();
                    this.numConjoint = leModelMariage.getValueAt(ligneDroit, 0).toString();

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jBAjoutVipConjointActionPerformed

    private void jButtonAjouterMariageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterMariageActionPerformed

        try {
            if (jTextFieldVip.getText().isEmpty()) {
                throw new Exception("champ Nom Vip vide");
            }
            Event.setNumVip(Integer.parseInt(numVip));

            if (jTextFieldConjoint.getText().isEmpty()) {
                throw new Exception("champ Nom Conjoint vide");
            }
            Event.setNumConjoint(Integer.parseInt(numConjoint));

            if (jDateChooserDateMariage.getCalendar() == null) {
                throw new Exception("champ Date de naissance mal rempli");
            }
            java.sql.Date temp = new java.sql.Date(jDateChooserDateMariage.getDate().getTime());
            Event.setDateMariage(temp);
            if (jTextFieldLieuMariage.getText().isEmpty()) {
                throw new Exception("champ Ville de mariage vide");
            }
            Event.setLieuMariage(jTextFieldLieuMariage.getText());
            etatSortie = true;
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAjouterMariageActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAjoutVipConjoint;
    private javax.swing.JButton jButtonAjouterMariage;
    private com.toedter.calendar.JDateChooser jDateChooserDateMariage;
    private javax.swing.JLabel jLConjoint1;
    private javax.swing.JLabel jLDateMariage;
    private javax.swing.JLabel jLLieuMariage;
    private javax.swing.JLabel jLVip1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDroit;
    private javax.swing.JTable jTableGauche;
    private javax.swing.JTextField jTextFieldConjoint;
    private javax.swing.JTextField jTextFieldLieuMariage;
    private javax.swing.JTextField jTextFieldVip;
    private javax.swing.JTextField test;
    // End of variables declaration//GEN-END:variables

}
