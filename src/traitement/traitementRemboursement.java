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
import model.modelRemboursement;

public class traitementRemboursement implements InterfaceTraitement<modelRemboursement>{
    
    Connection con = null;
    PreparedStatement pst = null;
    StringBuilder sb = null;
    ResultSet rs = null;
    
    @Override
    public void enregistrer(modelRemboursement e) {
       //Création d'une chaine de requête
       sb = new StringBuilder();
       //concatenation de requete
       sb.append("INSERT INTO remboursements VALUES(");
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
           pst.setString(2,e.getIdPret());
           pst.setString(3,e.getNomVersement());
           pst.setDouble(4,e.getMontantRembourse());
           pst.setString(5,e.getDateRemboursement());
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
       Logger.getLogger(traitementRemboursement.class.getName()).log(Level.SEVERE, null, ex);  
     }
    }

    @Override
    public void afficher() {
        getAll();
    }

    @Override
    public void modifier(modelRemboursement m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimer(String id) {
        sb = new StringBuilder();
        sb.append("DELETE FROM remboursements WHERE ID=?");
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
            Logger.getLogger(traitementRemboursement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<modelRemboursement> getAll() {
        ArrayList<modelRemboursement> amr = new ArrayList<modelRemboursement> ();
       sb = new StringBuilder();
        sb.append ("SELECT* FROM remboursements");
        
      //recuperation de la conction
      con = ConnectionBase.idan();
      try {
          //passer la requete
          pst =con.prepareStatement(sb.toString());
          //executer la requete
          rs = pst.executeQuery();
          //parcurir le resusltat
          while(rs.next()){
          modelRemboursement mrm = new modelRemboursement();
          
          mrm.setId(rs.getString(1));
          mrm.setIdPret(Integer.toString(rs.getInt(2)));
          mrm.setNomVersement(rs.getString(3));          
          mrm.setMontantRembourse(rs.getDouble(4));
          mrm.setDateRemboursement(rs.getString(5));
          amr.add(mrm);
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
    Logger.getLogger(traitementRemboursement.class.getName()).log(Level.SEVERE, null, ex);
     
 }
    return amr;
    }

    @Override
    public modelRemboursement getFromId(String id) {
        modelRemboursement mrm = new modelRemboursement();
        sb = new StringBuilder();
        sb.append("SELECT* FROM remboursements WHERE ID=?");
        con = ConnectionBase.idan();
        try {
            pst = con.prepareStatement(sb.toString());
            pst.setString(1, id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                mrm.setId(rs.getString(1));
                mrm.setIdPret(rs.getString(2));
                mrm.setNomVersement(rs.getString(3));
                mrm.setMontantRembourse(rs.getDouble(4));
                mrm.setDateRemboursement(""+rs.getDate(5));    
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
            Logger.getLogger(traitementRemboursement.class.getName()).log(Level.SEVERE, null, ex);
        }
    return mrm;
    }
    
}
