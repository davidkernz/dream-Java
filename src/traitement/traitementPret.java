package traitement;

import dataBaseConnection.ConnectionBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.modelPret;

public class traitementPret implements InterfaceTraitement<modelPret>{
    
    Connection con = null;
    PreparedStatement pst = null;
    StringBuilder sb = null;
    ResultSet rs = null;

    @Override
    public void enregistrer(modelPret e) {
        //Création d'une chaine de requête
       sb = new StringBuilder();
       //concatenation de requete
       sb.append(" INSERT INTO gestionprêts VALUES( ");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+",");
       sb.append("?"+")");
       
       //recuperation la connexion a la BD
     con = ConnectionBase.idan();
     try {
           pst = con.prepareStatement(sb.toString());
           //passage des parametres a la requete
           pst.setString(1,null);
           pst.setString(2,""+e.getIdGroupe());
           pst.setDouble(3,e.getMontantEmprunte());
           pst.setDouble(4,e.getInteret());
           pst.setDouble(5,e.getVersementMensuel());
           pst.setString(6,""+e.getDatePret());
           pst.setString(7,""+e.getDateVersement1());
           pst.setString(8,""+e.getDateVersement2());
           pst.setString(9,""+e.getDateVersement3());
           pst.setString(10,""+e.getDateVersement4());
           System.out.println(pst);
           //executer la requete
           int n = pst.executeUpdate();
           if(n > 0){
              JOptionPane.showMessageDialog(null, "Enregistement réussi !", "Message", JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               JOptionPane.showMessageDialog(null, "Enregistement non réussi !", "Message", JOptionPane.ERROR_MESSAGE);
           }
           if(pst != null){
               pst.close();
           }
           if(con != null){
               con.close();
           }
     }catch (SQLException ex){
       Logger.getLogger(traitementPret.class.getName()).log(Level.SEVERE, null, ex);  
     }
    }

    @Override
    public void afficher() {
       getAll();
    }

    @Override
    public void modifier(modelPret m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimer(String id) {
        sb = new StringBuilder();
        sb.append("DELETE FROM gestionprêts WHERE ID=?");
        con = ConnectionBase.idan();
        try {
            pst = con.prepareStatement(sb.toString());
            pst.setString(1,id);
            int conf_id = JOptionPane.showConfirmDialog(null,"Voulez-vous vraiment supprimer ce prêt","Confirmation",JOptionPane.YES_NO_OPTION);
          if(conf_id == JOptionPane.YES_OPTION){
         int en = pst.executeUpdate();
         if(en > 0){
            JOptionPane.showMessageDialog(null,"Suppression éffectuée avec succes !","Message",JOptionPane.INFORMATION_MESSAGE);
         }else{
             JOptionPane.showMessageDialog(null,"Suppression non éffectuée !","Message",JOptionPane.INFORMATION_MESSAGE);
         }
          }
        } catch (SQLException ex) {
            Logger.getLogger(traitementPret.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<modelPret> getAll() {
       ArrayList<modelPret> amp = new ArrayList<modelPret> ();
       sb = new StringBuilder();
        sb.append ("SELECT* FROM gestionprêts");
        
      //recuperation de la conction
      con = ConnectionBase.idan();
      try {
          //passer la requete
          pst =con.prepareStatement(sb.toString());
          //executer la requete
          rs = pst.executeQuery();
          //parcurir le resusltat
          while(rs.next()){
          modelPret mop = new modelPret();
          
          mop.setId(rs.getString(1));
          mop.setIdGroupe(Integer.toString(rs.getInt(2)));
          mop.setMontantEmprunte(rs.getDouble(3));          
          mop.setInteret(rs.getDouble(4));
          mop.setVersementMensuel(rs.getDouble(5));
          mop.setDatePret(rs.getString(6));
          mop.setDateVersement1(rs.getString(7));
          mop.setDateVersement2(rs.getString(8));
          mop.setDateVersement3(rs.getString(9));
          mop.setDateVersement4(rs.getString(10));
          amp.add(mop);
      }
      if(rs != null){
          rs.close();
      }
      if(pst != null){
          pst.close();
      }
      if(con != null){
          con.close();
      }
      
    } catch (SQLException ex){
    Logger.getLogger(traitementPret.class.getName()).log(Level.SEVERE, null, ex);
     
 }
    return amp;
    }

    @Override
    public modelPret getFromId(String id) {
        modelPret mpr = new modelPret();
        sb = new StringBuilder();
        sb.append("SELECT* FROM gestionprêts WHERE ID=?");
        con = ConnectionBase.idan();
        try {
            pst = con.prepareStatement(sb.toString());
            pst.setString(1, id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                mpr.setId(rs.getString(1));
                mpr.setIdGroupe(rs.getString(2));
                mpr.setMontantEmprunte(rs.getDouble(3));
                mpr.setInteret(rs.getDouble(4));
                mpr.setVersementMensuel(rs.getDouble(5));
                mpr.setDatePret(rs.getString(6));
                mpr.setDateVersement1(rs.getString(7));
                mpr.setDateVersement2(rs.getString(8));
                mpr.setDateVersement3(rs.getString(9));
                mpr.setDateVersement4(rs.getString(10));
            }
            if(rs != null){
             rs.close();
            }
            if(pst != null){
             pst.close();
            }
            if(con != null){
             con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(traitementPret.class.getName()).log(Level.SEVERE, null, ex);
        }
    return mpr;
    }
    
}
