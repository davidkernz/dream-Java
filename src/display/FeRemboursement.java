package display;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.modelRemboursement;

import traitement.traitementRemboursement;
public class FeRemboursement extends javax.swing.JInternalFrame {
    
    public static int fR= 0;
    modelRemboursement mr = new modelRemboursement();
    traitementRemboursement tr = new traitementRemboursement();
        // variable
         JFileChooser fc = null;
         StringTokenizer st = null;
          
    public FeRemboursement() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI internal = (BasicInternalFrameUI) this.getUI();
        internal.setNorthPane(null);
        netoyer();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmontant = new javax.swing.JTextField();
        txtnomversement = new javax.swing.JTextField();
        txtdate = new com.toedter.calendar.JDateChooser();
        btupload = new javax.swing.JButton();
        btsave = new javax.swing.JButton();
        btview = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableau3 = new javax.swing.JTable();
        txtidpret = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("GESTION DES REMBOURSEMENT");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Id pret");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Nom versement");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Montant rembourser");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Date remboursement");

        txtid.setEditable(false);
        txtid.setEnabled(false);

        txtmontant.setEditable(false);
        txtmontant.setEnabled(false);

        txtnomversement.setEditable(false);
        txtnomversement.setEnabled(false);

        txtdate.setEnabled(false);

        btupload.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btupload.setText("Upload");
        btupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btuploadActionPerformed(evt);
            }
        });

        btsave.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btsave.png"))); // NOI18N
        btsave.setText("Enrégistrer");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        btview.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btview.png"))); // NOI18N
        btview.setText("Afficher");
        btview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewActionPerformed(evt);
            }
        });

        btdelete.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btdelete.png"))); // NOI18N
        btdelete.setText("Supprimer");
        btdelete.setEnabled(false);
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        tableau3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id pret", "Nom versement", "Montant rembourser", "Date remboursement"
            }
        ));
        tableau3.setEnabled(false);
        tableau3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableau3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableau3);

        txtidpret.setEditable(false);
        txtidpret.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(txtnomversement, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtidpret, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtmontant, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btsave)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btupload)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btview)
                                .addGap(40, 40, 40)
                                .addComponent(btdelete)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtidpret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnomversement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmontant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(btupload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btsave)
                            .addComponent(btview)
                            .addComponent(btdelete))
                        .addGap(82, 82, 82))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewActionPerformed
        //tr.afficher();
        telechargerDonner();
        tableau3.setEnabled(true);
        btdelete.setEnabled(true);
    }//GEN-LAST:event_btviewActionPerformed
    
    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:
        mr.setIdPret(""+txtidpret.getText());
        mr.setNomVersement(""+txtnomversement.getText());
        mr.setMontantRembourse(Double.valueOf(txtmontant.getText()));
        SimpleDateFormat sj = new SimpleDateFormat("dd/MMyyyy");
        mr.setDateRemboursement(sj.format(txtdate.getDate()));
        tr.enregistrer(mr);
        netoyer();
    }//GEN-LAST:event_btsaveActionPerformed

     public void telechargerDonner() {
        Object [][]tab=new Object[tr.getAll().size()][5];
          int re = 0;
         for(modelRemboursement r:tr.getAll()){
             tab[re][0] = r.getId();
             tab[re][1] = r.getIdPret();
             tab[re][2] = r.getNomVersement();
             tab[re][3] = r.getMontantRembourse();
             tab[re][4] = r.getDateRemboursement();
             re++;
         }
         String header[]={"Id", "Id pret", "Nom versement", "Montant rembourse", "Date remboursement"};
         tableau3.setModel(new DefaultTableModel(tab,header));
     }
    
    private void btuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuploadActionPerformed
        // evenement sur le bouton load
        fc = new JFileChooser();
        int donnee = fc.showOpenDialog(null);
        
        if (donnee == JFileChooser.APPROVE_OPTION){
            File fichier = fc.getSelectedFile();
            String paquet = paquet =fichier.getAbsolutePath();
            
            try {
                 Scanner scp = new Scanner(fichier);
                 if (scp.hasNextLine()) {
                    
                    st = new StringTokenizer(scp.nextLine(), ":");              
                    txtidpret.setText(st.nextToken());
                    txtnomversement.setText(st.nextToken());
                    txtmontant.setText(st.nextToken());   
                }
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(FeRemboursement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btuploadActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
        if(!txtid.getText().isEmpty()){
          tr.supprimer(txtid.getText());
          telechargerDonner();
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void tableau3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableau3MouseClicked
        // TODO add your handling code here:
         int ligne=tableau3.getSelectedRow();
       if(ligne>=0){
           mr = tr.getFromId(""+tableau3.getValueAt(ligne,0));
           if(mr!=null){
           txtid.setText(mr.getId());
           txtidpret.setText(mr.getIdPret());
           txtnomversement.setText(mr.getNomVersement());
           txtmontant.setText(""+mr.getMontantRembourse());
           txtdate.setDateFormatString(""+mr.getDateRemboursement());
           }
       }
       telechargerDonner();
    }//GEN-LAST:event_tableau3MouseClicked
      
    public void netoyer(){
      this.txtid.setText(null);
      this.txtidpret.setText(null);
      this.txtnomversement.setText(null);
      this.txtmontant.setText(null);
      this.txtdate.setDate(new Date());
      tableau3.setEnabled(false);
      btdelete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btsave;
    private javax.swing.JButton btupload;
    private javax.swing.JButton btview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableau3;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidpret;
    private javax.swing.JTextField txtmontant;
    private javax.swing.JTextField txtnomversement;
    // End of variables declaration//GEN-END:variables
}
