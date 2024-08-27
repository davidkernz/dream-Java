package display;

import dataBaseConnection.ConnectionBase;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.modelEntreprise;
import traitement.traitementEntreprise;

public class FeEntreprise extends javax.swing.JInternalFrame {

    public static int fE = 0;
    modelEntreprise me = new modelEntreprise();
    traitementEntreprise te = new traitementEntreprise();
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

    public FeEntreprise() {
        initComponents();
        
        //pour masquer la bar de titre JInternalFrame
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI internal = (BasicInternalFrameUI) this.getUI();
        internal.setNorthPane(null);
        netoyer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutonsexe = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        cbidgroupe = new javax.swing.JComboBox<>();
        txtnomcommune = new javax.swing.JTextField();
        txtnomE = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        masculin = new javax.swing.JRadioButton();
        feminin = new javax.swing.JRadioButton();
        txtadresse = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        cbtype = new javax.swing.JComboBox<>();
        txtno = new javax.swing.JTextField();
        datecreation = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableau = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btsave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btview = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btupdate = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btdelete = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btclear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("ID GROUPE");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("NOM ENTREPRISE");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("NOM PROPRIETAIRE");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("PRENOM PROPRIETAIRE");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("SEXE PROPRIETAIRE");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("ADRESSE PROPRIETAIRE");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("TELEPHONE PROPRIETAIRE");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("TYPE PIECE PROPRIETAIRE");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("NO. PIECE PROPRIETAIRE");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("DATE CREATION DE L'ENTREPRISE");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("DESCRIPTION DE L'ENTREPRISE");

        txtid.setEditable(false);
        txtid.setEnabled(false);

        cbidgroupe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbidgroupe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbidgroupeItemStateChanged(evt);
            }
        });

        txtnomcommune.setEditable(false);
        txtnomcommune.setEnabled(false);

        txtnomE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomEKeyTyped(evt);
            }
        });

        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        txtprenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprenomKeyTyped(evt);
            }
        });

        boutonsexe.add(masculin);
        masculin.setText("Masculin");

        boutonsexe.add(feminin);
        feminin.setText("Féminin");

        txtadresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtadresseKeyTyped(evt);
            }
        });

        txttelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelephoneKeyTyped(evt);
            }
        });

        cbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIF", "CIN", "PASSPORT", "PERMIS DE CONDUIRE" }));

        txtno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnoKeyTyped(evt);
            }
        });

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        txtdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtdesc);

        tableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id groupe", "Nom entreprise", "Nom propriétaire", "Prénom propriétaire", "Sexe propriétaire", "Adresse propriétaire", "Téléphone propriétaire", "Type pièce propriétaire", "No. pièce propriétaire", "Date création entreprise", "Description entreprise"
            }
        ));
        tableau.setEnabled(false);
        tableau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableau);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("GERER LES EMPRUNTEURS");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setFocusTraversalPolicyProvider(true);
        jToolBar1.setFocusable(false);

        btsave.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btsave.png"))); // NOI18N
        btsave.setText("Enregistrer");
        btsave.setFocusable(false);
        btsave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btsave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btsave);

        jSeparator1.setMaximumSize(new java.awt.Dimension(30, 30));
        jSeparator1.setMinimumSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator1);

        btview.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btview.png"))); // NOI18N
        btview.setText("Afficher");
        btview.setFocusable(false);
        btview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btview.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewActionPerformed(evt);
            }
        });
        jToolBar1.add(btview);

        jSeparator2.setMaximumSize(new java.awt.Dimension(30, 30));
        jSeparator2.setMinimumSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator2);

        btupdate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btupdate.png"))); // NOI18N
        btupdate.setText("Modifier");
        btupdate.setEnabled(false);
        btupdate.setFocusable(false);
        btupdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btupdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });
        jToolBar1.add(btupdate);

        jSeparator3.setMaximumSize(new java.awt.Dimension(30, 30));
        jSeparator3.setMinimumSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator3);

        btdelete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btdelete.png"))); // NOI18N
        btdelete.setText("Supprimer");
        btdelete.setEnabled(false);
        btdelete.setFocusable(false);
        btdelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btdelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btdelete);

        jSeparator4.setMaximumSize(new java.awt.Dimension(30, 30));
        jSeparator4.setMinimumSize(new java.awt.Dimension(30, 30));
        jSeparator4.setName(""); // NOI18N
        jToolBar1.add(jSeparator4);

        btclear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/clear.png"))); // NOI18N
        btclear.setText("Actualiser");
        btclear.setFocusable(false);
        btclear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btclear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });
        jToolBar1.add(btclear);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(masculin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(feminin))
                                .addComponent(txtid)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbidgroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtnomcommune))
                                .addComponent(txtnomE)
                                .addComponent(txtnom)
                                .addComponent(txtprenom)
                                .addComponent(txtadresse)
                                .addComponent(txttelephone)
                                .addComponent(cbtype, 0, 166, Short.MAX_VALUE)
                                .addComponent(txtno)
                                .addComponent(datecreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbidgroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomcommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnomE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(masculin)
                            .addComponent(feminin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(datecreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // evenement sur le bouton enregistrer
        me.setIdGroupe("" + cbidgroupe.getSelectedItem());
        me.setNomEntreprise(txtnomE.getText());        
        me.setNomProprietaire(txtnom.getText());
        me.setPrenomProprietaire(txtprenom.getText());
        if (masculin.isSelected()) {
            me.setSexe("Masculin");
        }
        if (feminin.isSelected()) {
            me.setSexe("Féminin");
        }
        me.setAdresse(txtadresse.getText());
        me.setTelephone(txttelephone.getText());
        me.setTypePieceProprietaire("" + cbtype.getSelectedItem());
        me.setNoPieceProprietaire(this.txtno.getText());
        SimpleDateFormat sj = new SimpleDateFormat("dd/MM/yyyy");
        me.setDateCreation(sj.format(datecreation.getDate()));
        me.setDescription(txtdesc.getText());

        if ((me.getIdGroupe().isEmpty()) || me.getNomEntreprise() == null || me.getNomProprietaire() == null || me.getPrenomProprietaire() == null
                || me.getSexe().isEmpty() || me.getAdresse() == null || me.getTelephone() == null || me.getTypePieceProprietaire().isEmpty()
                || me.getNoPieceProprietaire() == null || me.getDescription() == null) {
            JOptionPane.showMessageDialog(null, "Il faut rempli tout les champs !");
        } else {
            te.enregistrer(me);
        }
        netoyer();
    }

    public void netoyer() {
        this.cbidgroupe.setSelectedItem(null);
        this.txtnomcommune.setText(null);
        this.txtnomE.setText(null);
        this.txtnom.setText(null);
        this.txtprenom.setText(null);
        this.boutonsexe.clearSelection();
        this.txtadresse.setText(null);
        this.txttelephone.setText(null);
        this.cbtype.setSelectedItem(null);
        this.txtno.setText(null);
        this.datecreation.setDate(new Date());
        this.txtdesc.setText(null);
        tableau.setEnabled(false);
        btupdate.setEnabled(false);
        btdelete.setEnabled(false);
    }

    public void telechargerDonner() {
        Object[][] tab = new Object[te.getAll().size()][12];
        int en = 0;
        for (modelEntreprise e : te.getAll()) {
            tab[en][0] = e.getId();
            tab[en][1] = e.getIdGroupe();
            tab[en][2] = e.getNomEntreprise();
            tab[en][3] = e.getNomProprietaire();
            tab[en][4] = e.getPrenomProprietaire();
            tab[en][5] = e.getSexe();
            tab[en][6] = e.getAdresse();
            tab[en][7] = e.getTelephone();
            tab[en][8] = e.getTypePieceProprietaire();
            tab[en][9] = e.getNoPieceProprietaire();
            tab[en][10] = e.getDateCreation();
            tab[en][11] = e.getDescription();
            en++;
        }
        String header[] = {"Id", "Id groupe", "Nom entreprise", "Nom propriétaire",
            "Prénom propriétaire", "Sexe propriétaire", "Adresse propriétaire", "Téléphone propriétaire",
            "Type pièce propriétaire", "No. pièce propriétaire", "Date création entreprise", "Description entreprise"};
        tableau.setModel(new DefaultTableModel(tab, header));
    }//GEN-LAST:event_btsaveActionPerformed

    private void cbidgroupeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbidgroupeItemStateChanged
        // evenement affichage nom commune
        con = ConnectionBase.idan();

        String commune = "SELECT Commune FROM groupe_emprunteur WHERE ID=?";
        try {
            pst = con.prepareStatement(commune);
            pst.setString(1, "" + cbidgroupe.getSelectedItem());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtnomcommune.setText(rs.getString(1));
            }
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbidgroupeItemStateChanged

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
        if (!txtid.getText().isEmpty()) {
            te.supprimer(txtid.getText());
            telechargerDonner();
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        // vider les champs
        netoyer();
    }//GEN-LAST:event_btclearActionPerformed

    private void btviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewActionPerformed
        // TODO add your handling code here:
        te.afficher();
        tableau.enable();
        btupdate.setEnabled(true);
        btdelete.setEnabled(true);
        telechargerDonner();
    }//GEN-LAST:event_btviewActionPerformed

    private void tableauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauMouseClicked
        // TODO add your handling code here:
        int ligne = tableau.getSelectedRow();
        if (ligne >= 0) {
            me = te.getFromId("" + tableau.getValueAt(ligne, 0));
            if (me != null) {
                txtid.setText(me.getId());
                cbidgroupe.setSelectedItem(me.getIdGroupe());
                txtnomE.setText(me.getNomEntreprise());
                txtnom.setText(me.getNomProprietaire());
                txtprenom.setText(me.getPrenomProprietaire());
                masculin.setText(me.getSexe());
                feminin.setText(me.getSexe());
                txtadresse.setText(me.getAdresse());
                txttelephone.setText(me.getTelephone());
                cbtype.setSelectedItem(me.getTypePieceProprietaire());
                txtno.setText(me.getNoPieceProprietaire());
                datecreation.setDateFormatString("" + me.getDateCreation());
                txtdesc.setText(me.getDescription());
            }
        }
        telechargerDonner();
    }//GEN-LAST:event_tableauMouseClicked

    private void txttelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelephoneKeyTyped
        // pour autoriser que des chiffres et tiret
        char cha = evt.getKeyChar();
        if((((cha < '0'|| cha >'9'))&& cha != '-') && (cha != KeyEvent.VK_BACK_SPACE)||(txttelephone.getText().isEmpty()&& cha == '.')){
        evt.consume();
    }
    }//GEN-LAST:event_txttelephoneKeyTyped

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
        // pour le passage des miniscule en majuscule et n'autoriser que des lettres et un point.
        char cha = evt.getKeyChar();
        if(Character.isLowerCase(cha)){
            evt.setKeyChar(Character.toUpperCase(cha));
    }
        if((((!(Character.isAlphabetic(cha))) && cha != '.') || cha == KeyEvent.VK_BACK_SPACE || txtnom.getText().contains(".") && cha == '.' || txtnom.getText().isEmpty()&& cha == '.')){
        evt.consume();
    }
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtnomEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomEKeyTyped
        // pour le passage des miniscule en majuscule
        char cha = evt.getKeyChar();
        if(Character.isLowerCase(cha)){
            evt.setKeyChar(Character.toUpperCase(cha));
    }
        if(txtnomE.getText().isEmpty()&& cha == '.'){
          evt.consume();
        }
    }//GEN-LAST:event_txtnomEKeyTyped

    private void txtprenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprenomKeyTyped
        // pour n'autoriser que des lettres
        char cha = evt.getKeyChar();
        if((!(Character.isAlphabetic(cha)) || cha == KeyEvent.VK_BACK_SPACE || txtprenom.getText().isEmpty() && cha == '.')){
        evt.consume();
    }
        
    }//GEN-LAST:event_txtprenomKeyTyped

    private void txtadresseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadresseKeyTyped
        // TODO add your handling code here:
        char cha = evt.getKeyChar();
        if(txtadresse.getText().isEmpty()&& cha == '.'){
          evt.consume();
        }
    }//GEN-LAST:event_txtadresseKeyTyped

    private void txtnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoKeyTyped
        // TODO add your handling code here:
       char cha = evt.getKeyChar();
        if(txtno.getText().isEmpty()&& cha == '.'){
          evt.consume();
        }
    }//GEN-LAST:event_txtnoKeyTyped

    private void txtdescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescKeyTyped
        // 
        char cha = evt.getKeyChar();
        if(txtdesc.getText().isEmpty()&& cha == '.'){
          evt.consume();
        }
    }//GEN-LAST:event_txtdescKeyTyped

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // TODO add your handling code here:
        me.setIdGroupe(String.valueOf(cbidgroupe.getSelectedItem()));
        me.setNomProprietaire(txtnom.getText());
        me.setPrenomProprietaire(txtprenom.getText());
        if (masculin.isSelected()) {
            me.setSexe("Masculin");
        }
        if (feminin.isSelected()) {
            me.setSexe("Féminin");
        }
        me.setAdresse(txtadresse.getText());
        me.setTelephone(txttelephone.getText());
        me.setTypePieceProprietaire(String.valueOf(cbtype.getSelectedItem()));
        me.setNoPieceProprietaire(txtno.getText());
        me.setDescription(txtdesc.getText());
        
        if (txtid.getText().isEmpty() || me.getIdGroupe().isEmpty() || me.getNomProprietaire().isEmpty()|| me.getPrenomProprietaire().isEmpty()
            || me.getAdresse().isEmpty() || me.getTelephone().isEmpty() || me.getTypePieceProprietaire().isEmpty()
            || me.getNoPieceProprietaire().isEmpty() || me.getDescription().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aucun champs ne doit rester vide !");
        } else {
            te.modifier(me);
        }
        telechargerDonner();
    }//GEN-LAST:event_btupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup boutonsexe;
    private javax.swing.JButton btclear;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btsave;
    private javax.swing.JButton btupdate;
    private javax.swing.JButton btview;
    private javax.swing.JComboBox<String> cbidgroupe;
    private javax.swing.JComboBox<String> cbtype;
    private com.toedter.calendar.JDateChooser datecreation;
    private javax.swing.JRadioButton feminin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton masculin;
    private javax.swing.JTable tableau;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnomE;
    private javax.swing.JTextField txtnomcommune;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}
