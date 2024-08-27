package display;

import dataBaseConnection.ConnectionBase;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.modelPret;
import traitement.traitementPret;

public class FePret extends javax.swing.JInternalFrame {
public static int fP = 0;
    modelPret mp = new modelPret();
    traitementPret tp = new traitementPret();  
    String idgroupe;
    String commune;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public FePret(){
        initComponents();
        
        //pour masquer la bar de titre JInternalFrame
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        cbidgroupe = new javax.swing.JComboBox<>();
        txtcommune = new javax.swing.JTextField();
        txtmontant = new javax.swing.JTextField();
        txtinteret = new javax.swing.JTextField();
        txtmensuel = new javax.swing.JTextField();
        datepret = new com.toedter.calendar.JDateChooser();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();
        date3 = new com.toedter.calendar.JDateChooser();
        date4 = new com.toedter.calendar.JDateChooser();
        btsave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableau2 = new javax.swing.JTable();
        btview = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Gestion Prets");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Id groupe");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Montant emprunté");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Interêt");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Versement mensuel");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Date prêt");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Date versement 1");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Date versement 2");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Date versement 3");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Date versement 4");

        txtid.setEditable(false);
        txtid.setEnabled(false);

        cbidgroupe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbidgroupe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbidgroupeItemStateChanged(evt);
            }
        });

        txtcommune.setEditable(false);
        txtcommune.setEnabled(false);

        txtmontant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmontantKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmontantKeyTyped(evt);
            }
        });

        txtinteret.setEditable(false);
        txtinteret.setEnabled(false);

        txtmensuel.setEditable(false);
        txtmensuel.setEnabled(false);

        datepret.setEnabled(false);

        date1.setEnabled(false);

        date2.setEnabled(false);

        date3.setEnabled(false);

        date4.setEnabled(false);

        btsave.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btsave.png"))); // NOI18N
        btsave.setText("Enregistrer");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        tableau2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Id groupe", "Montant emprunté", "Interêt", "Versement mensuel", "Date prêt", "Date versement 1", "Date versement 2", "Date versement 3", "Date versement 4"
            }
        ));
        tableau2.setEnabled(false);
        tableau2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableau2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableau2);

        btview.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btview.png"))); // NOI18N
        btview.setText("Afficher");
        btview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewActionPerformed(evt);
            }
        });

        btdelete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/display/btdelete.png"))); // NOI18N
        btdelete.setText("Supprimer");
        btdelete.setEnabled(false);
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmensuel)
                            .addComponent(datepret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbidgroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcommune, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtid)
                            .addComponent(txtmontant)
                            .addComponent(txtinteret)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btsave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btview)
                        .addGap(18, 18, 18)
                        .addComponent(btdelete)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbidgroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtmontant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtinteret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtmensuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(datepret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(date3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(date4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btsave)
                            .addComponent(btview)
                            .addComponent(btdelete))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat da= null;
        Date dda=null,dds =null;
        String cp=null;
        String nv = null;
        con = ConnectionBase.idan();
        String sql1 = "SELECT * FROM gestionprêts WHERE IDGroupe=?";
        String sql2 = "SELECT * FROM remboursements WHERE IDPrêts=?";
        da = new SimpleDateFormat("dd/MM/yyyy");
        try {
            pst = con.prepareStatement(sql1);
            pst.setInt(1, Integer.parseInt(""+cbidgroupe.getSelectedItem()));
            rs = pst.executeQuery();
            if(rs.next()){
                cp = rs.getString(1);
                pst = con.prepareStatement(sql1);
                try {
                    dda = da.parse(rs.getString(10));
                } catch (ParseException ex) {
                    Logger.getLogger(FePret.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(rs.next()){
                pst = con.prepareStatement(sql2);
                pst.setString(1, cp);
                rs= pst.executeQuery();
                nv = rs.getString(3);
                    try {
                        dds = da.parse(rs.getString(5));
                    } catch (ParseException ex) {
                        Logger.getLogger(FePret.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            if(rs != null ){
                rs.close();
            }
            if(pst != null){
                pst.close();
            }
            if(con != null){
          con.close();
      }
        } catch (SQLException ex) {
            Logger.getLogger(FePret.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean das = false;
        if(cp==null){
            das = true;
        }
        if(dds != null){
            if(dds.before(dda) || !nv.equalsIgnoreCase("Versement4") ){
                das = false;      
            }
            else{
                das = true;
            }
        }
        mp.setIdGroupe(""+(cbidgroupe.getSelectedItem()));
        mp.setMontantEmprunte(Double.valueOf(txtmontant.getText()));
        mp.setInteret(Double.valueOf(txtinteret.getText()));
        mp.setVersementMensuel(Double.valueOf(txtmensuel.getText()));
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        mp.setDatePret(sp.format(datepret.getDate()));
        SimpleDateFormat sp1 = new SimpleDateFormat("dd/MM/yyyy");
        mp.setDateVersement1(sp1.format(date1.getDate()));
        SimpleDateFormat sp2 = new SimpleDateFormat("dd/MM/yyyy");
        mp.setDateVersement2(sp2.format(date2.getDate()));
        SimpleDateFormat sp3 = new SimpleDateFormat("dd/MM/yyyy");
        mp.setDateVersement3(sp3.format(date3.getDate()));
        SimpleDateFormat sp4 = new SimpleDateFormat("dd/MM/yyyy");
        mp.setDateVersement4(sp4.format(date4.getDate()));
         
        if((""+mp.getMontantEmprunte()) == null){
        JOptionPane.showMessageDialog(null, "Il faut choisir le groupe\net mettre le montant !");
     }
        else if (das == false){
            JOptionPane.showMessageDialog(null, "Il faut imperativement terminer l'autre pret\navant de pouvoir effectue un autre.");
        }
     else{
            
         tp.enregistrer(mp);   
     }   
        netoyer();
    }//GEN-LAST:event_btsaveActionPerformed
    
    private void txtmontantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontantKeyReleased
        String don = txtmontant.getText();
       if(don.isEmpty()){
          txtinteret.setText(""+0);
          txtmensuel.setText(""+0); 
          
       }else{
           operation();
       }    
    }//GEN-LAST:event_txtmontantKeyReleased

    private void cbidgroupeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbidgroupeItemStateChanged
        // evenement affichage nom commune
    con = ConnectionBase.idan();
    commune = "SELECT Commune FROM groupe_emprunteur WHERE ID=?";
        try {
            pst = con.prepareStatement(commune);
            pst.setString(1,"" + cbidgroupe.getSelectedItem());
            rs = pst.executeQuery();
            if(rs.next()){
                txtcommune.setText(rs.getString(1));
            }
            if(rs != null ){
                rs.close();
            }
            if(pst != null){
                pst.close();
            }
            if(con != null){
          con.close();
      }
        } catch (SQLException ex) {
            Logger.getLogger(FePret.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbidgroupeItemStateChanged

    private void btviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewActionPerformed
        // TODO add your handling code here:
        tp.afficher(); 
        tableau2.enable();
        btdelete.setEnabled(true);
        telechargerDonner();
    }//GEN-LAST:event_btviewActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
        if(!txtid.getText().isEmpty()){
          tp.supprimer(txtid.getText());
          telechargerDonner();
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void tableau2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableau2MouseClicked
        // TODO add your handling code here:
        int ligne=tableau2.getSelectedRow();
       if(ligne>=0){
           mp = tp.getFromId(""+tableau2.getValueAt(ligne,0));
           if(mp!=null){
           txtid.setText(mp.getId());
           cbidgroupe.setSelectedItem(mp.getIdGroupe());
           
           txtmontant.setText("" + mp.getMontantEmprunte());
           txtinteret.setText("" + mp.getInteret());
           txtmensuel.setText("" + mp.getVersementMensuel());
           datepret.setDateFormatString(mp.getDatePret());
           date1.setDateFormatString(mp.getDateVersement1());
           date2.setDateFormatString(mp.getDateVersement2());
           date3.setDateFormatString(mp.getDateVersement3());
           date4.setDateFormatString(mp.getDateVersement4());
           }
       }
       telechargerDonner();
    }//GEN-LAST:event_tableau2MouseClicked

    private void txtmontantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontantKeyTyped
        // pour autoriser que des nombres et des décimals
        char cha = evt.getKeyChar();
        if((((cha < '0'|| cha >'9'))&& cha != '.') && (cha != KeyEvent.VK_BACK_SPACE)||(txtmontant.getText().contains("."))&& cha == '.' ||(txtmontant.getText().isEmpty()&& cha == '.')){
        evt.consume();
    }
    }//GEN-LAST:event_txtmontantKeyTyped
        public void operation(){
        Double n = Double.parseDouble(txtmontant.getText());
        Double interet = (n*4.5)/100;
        Double mensuel = (n+ interet)/4;
         txtinteret.setText(""+interet);
         txtmensuel.setText(""+mensuel);
        }
     public void netoyer(){
      this.cbidgroupe.setSelectedItem(null);
      this.txtcommune.setText(null);
      this.txtmontant.setText(null);
      this.txtinteret.setText(null);
      this.txtmensuel.setText(null);
      // Calcul des dates 
       datepret.setDate(new Date());
       Date dte = datepret.getDate();
       Date dat1 = new Date(dte.getYear(),dte.getMonth()+2,dte.getDate());
       Date dat2 = new Date(dat1.getYear(),dat1.getMonth()+1,dat1.getDate());
       Date dat3 = new Date(dat2.getYear(),dat2.getMonth()+1,dat2.getDate());
       Date dat4 = new Date(dat3.getYear(),dat3.getMonth()+1,dat3.getDate());
       date1.setDate(dat1);
       date2.setDate(dat2);
       date3.setDate(dat3);
       date4.setDate(dat4);
       
      tableau2.setEnabled(false);
      btdelete.setEnabled(false);
    }
     
    public void telechargerDonner() {
        Object [][]tab=new Object[tp.getAll().size()][10];
          int pr = 0;
         for(modelPret p:tp.getAll()){
             tab[pr][0] = p.getId();
             tab[pr][1] = p.getIdGroupe();
             tab[pr][2] = p.getMontantEmprunte();
             tab[pr][3] = p.getInteret();
             tab[pr][4] = p.getVersementMensuel();
             tab[pr][5] = p.getDatePret();
             tab[pr][6] = p.getDateVersement1();
             tab[pr][7] = p.getDateVersement2();
             tab[pr][8] = p.getDateVersement3();
             tab[pr][9] = p.getDateVersement4();
             pr++;
         }
         String header[]={"Id", "Id groupe", "Montant emprunté", "Interêt",
            "Versement mensuel", "Date prêt", "Date versement 1", 
            "Date versement 2", "Date versement 3", "Date versement 4"};
         tableau2.setModel(new DefaultTableModel(tab,header));
    } 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btsave;
    private javax.swing.JButton btview;
    private javax.swing.JComboBox<String> cbidgroupe;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private com.toedter.calendar.JDateChooser date3;
    private com.toedter.calendar.JDateChooser date4;
    private com.toedter.calendar.JDateChooser datepret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableau2;
    private javax.swing.JTextField txtcommune;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtinteret;
    private javax.swing.JTextField txtmensuel;
    private javax.swing.JTextField txtmontant;
    // End of variables declaration//GEN-END:variables

}
