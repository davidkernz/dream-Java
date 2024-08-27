package display;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class FenetreAccueil extends javax.swing.JFrame {

    public FenetreAccueil() {
        initComponents();
        FondAccueil fa = new FondAccueil();
        if(FondAccueil.fA == 0){
            deks.add(fa, BorderLayout.CENTER);
            fa.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gestionEntreprise = new java.awt.Button();
        bt_Pret = new java.awt.Button();
        bt_Rembourser = new java.awt.Button();
        btout = new java.awt.Button();
        bt_Accueil = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        deks = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Dreams");
        setExtendedState(6);
        setIconImage(new ImageIcon("ico.png").getImage());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        gestionEntreprise.setBackground(new java.awt.Color(51, 153, 255));
        gestionEntreprise.setForeground(new java.awt.Color(255, 255, 255));
        gestionEntreprise.setLabel("Gérer les emprunteurs");
        gestionEntreprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionEntrepriseActionPerformed(evt);
            }
        });

        bt_Pret.setBackground(new java.awt.Color(51, 153, 255));
        bt_Pret.setForeground(new java.awt.Color(255, 255, 255));
        bt_Pret.setLabel("Gérer les prêts");
        bt_Pret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PretActionPerformed(evt);
            }
        });

        bt_Rembourser.setBackground(new java.awt.Color(51, 153, 255));
        bt_Rembourser.setForeground(new java.awt.Color(255, 255, 255));
        bt_Rembourser.setLabel("Gérer les remboursements");
        bt_Rembourser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RembourserActionPerformed(evt);
            }
        });

        btout.setBackground(new java.awt.Color(255, 0, 0));
        btout.setForeground(new java.awt.Color(255, 255, 255));
        btout.setLabel("Quitter");
        btout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoutActionPerformed(evt);
            }
        });

        bt_Accueil.setBackground(new java.awt.Color(51, 153, 255));
        bt_Accueil.setForeground(new java.awt.Color(255, 255, 255));
        bt_Accueil.setLabel("Accueil");
        bt_Accueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AccueilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btout, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bt_Pret, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gestionEntreprise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_Rembourser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bt_Accueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(bt_Accueil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(gestionEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bt_Pret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(bt_Rembourser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        deks.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(deks);

        jMenu1.setText(" ");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gestionEntrepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionEntrepriseActionPerformed
        // evenement sur le boutons de la gestion des entreprises
        FeEntreprise fe = new FeEntreprise();
        if(FeEntreprise.fE == 0){
            deks.add(fe, BorderLayout.CENTER);
            fe.setVisible(true);
        }
        
    }//GEN-LAST:event_gestionEntrepriseActionPerformed

    private void bt_PretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PretActionPerformed
        // evenement sur le bouton de la gestion des prets
        FePret fp = new FePret();
        if(FePret.fP == 0){
            deks.add(fp, BorderLayout.CENTER);
            fp.setVisible(true);
        }
      
    }//GEN-LAST:event_bt_PretActionPerformed

    private void bt_RembourserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RembourserActionPerformed
        // evenement sur le bouton de remboursement
        FeRemboursement fr = new FeRemboursement();
        if(FeRemboursement.fR == 0){
            deks.add(fr, BorderLayout.CENTER);
            fr.setVisible(true);
        }
       
    }//GEN-LAST:event_bt_RembourserActionPerformed

    private void bt_AccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AccueilActionPerformed
        // TODO add your handling code here:
        FondAccueil fa = new FondAccueil();
        if(FondAccueil.fA == 0){
            deks.add(fa, BorderLayout.CENTER);
            fa.setVisible(true);
        }
        
    }//GEN-LAST:event_bt_AccueilActionPerformed

    private void btoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoutActionPerformed
        // pour quitter le programme.
        System.exit(0);
    }//GEN-LAST:event_btoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bt_Accueil;
    private java.awt.Button bt_Pret;
    private java.awt.Button bt_Rembourser;
    private java.awt.Button btout;
    private javax.swing.JDesktopPane deks;
    private java.awt.Button gestionEntreprise;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
