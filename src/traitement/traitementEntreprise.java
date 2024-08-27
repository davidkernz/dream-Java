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
import model.modelEntreprise;

public class traitementEntreprise implements InterfaceTraitement<modelEntreprise> {

    Connection con = null;
    PreparedStatement pst = null;
    StringBuilder sb = null;
    ResultSet rs = null;

    @Override
    public void enregistrer(modelEntreprise e) {
        //Création d'une chaine de requête
        sb = new StringBuilder();
        //concatenation de requete
        sb.append(" INSERT INTO ENTREPRISES VALUES( ");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ",");
        sb.append("?" + ")");

        //recuperation de la connection a la base de données
        con = ConnectionBase.idan();
        try {
            pst = con.prepareStatement(sb.toString());
            //passage des parametres a la requete
            pst.setString(1, null);
            pst.setInt(2, Integer.parseInt(e.getIdGroupe()));
            pst.setString(3, e.getNomEntreprise());
            pst.setString(4, e.getNomProprietaire());
            pst.setString(5, e.getPrenomProprietaire());
            pst.setString(6, e.getSexe());
            pst.setString(7, e.getAdresse());
            pst.setString(8, e.getTelephone());
            pst.setString(9, e.getTypePieceProprietaire());
            pst.setString(10, e.getNoPieceProprietaire());
            pst.setString(11, "" + e.getDateCreation());
            pst.setString(12, e.getDescription());
            System.out.println(pst);
            //execution de la requete
            int n = pst.executeUpdate();
            
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Enregistement réussi !", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Enregistement non réussi !", "Message", JOptionPane.ERROR_MESSAGE);
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(traitementEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void afficher() {
        getAll();
    }

    @Override
    public void modifier(modelEntreprise m) {
        //Création d'une chaine de requête
        sb = new StringBuilder();
        //concatenation de requete
        sb.append("UPDATE entreprises SET ");
        sb.append("IDGroupe=?" + ",");
        sb.append("NomEntreprise=?" + ",");
        sb.append("NomPropriétaire=?" + ",");
        sb.append("PrénomProprietaire=?" + ",");
        sb.append("SexeProprietaire=?" + ",");
        sb.append("AdresseProprietaire=?" + ",");
        sb.append("TéléphoneProprietaire=?" + ",");
        sb.append("TypePièceProprietaire=?" + ",");
        sb.append("NoPièceProprietaire=?" + ",");
        sb.append("DateCréationEntreprise=?" + ",");
        sb.append("Description=?");
        sb.append("WHERE ID=?");

        //Recuperer la connection
        con = ConnectionBase.idan();
        try {
            pst = con.prepareStatement(sb.toString());
            pst.setString(1, m.getIdGroupe());
            pst.setString(2, m.getNomEntreprise());
            pst.setString(3, m.getNomProprietaire());
            pst.setString(4, m.getPrenomProprietaire());
            pst.setString(5, m.getSexe());
            pst.setString(6, m.getAdresse());
            pst.setString(7, m.getTelephone());
            pst.setString(8, m.getTypePieceProprietaire());
            pst.setString(9, m.getNoPieceProprietaire());
            pst.setString(10, m.getDateCreation());
            pst.setString(11, m.getDescription());
            pst.setString(12, m.getId());
            System.out.println(pst);
            int d = pst.executeUpdate();

            if (d > 0) {
                JOptionPane.showMessageDialog(null, "Modification effectuée avec succès !", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Modification échoué !", "Message", JOptionPane.ERROR_MESSAGE);
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(traitementEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void supprimer(String id) {
        // passage de la requete pour trouvé l'id
        sb = new StringBuilder();
        sb.append("DELETE FROM ENTREPRISES WHERE ID=?");
        con = ConnectionBase.idan();
        try {
            pst = con.prepareStatement(sb.toString());
            pst.setString(1, id);
            int conf_id = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer cette entreprise", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (conf_id == JOptionPane.YES_OPTION) {
                int en = pst.executeUpdate();
                if (en > 0) {
                    JOptionPane.showMessageDialog(null, "Suppression éffectuée avec succes !", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Suppression non éffectuée !", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(traitementEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<modelEntreprise> getAll() {
        ArrayList<modelEntreprise> arm = new ArrayList<modelEntreprise>();
        sb = new StringBuilder();
        sb.append("SELECT* FROM ENTREPRISES");

        //recuperation de la conction
        con = ConnectionBase.idan();
        try {
            //passer la requete
            pst = con.prepareStatement(sb.toString());
            //executer la requete
            rs = pst.executeQuery();
            //parcurir le resusltat
            while (rs.next()) {
                modelEntreprise mod = new modelEntreprise();

                mod.setId(rs.getString(1));
                mod.setIdGroupe(Integer.toString(rs.getInt(2)));
                mod.setNomEntreprise(rs.getString(3));
                mod.setNomProprietaire(rs.getString(4));
                mod.setPrenomProprietaire(rs.getString(5));
                mod.setSexe(rs.getString(6));
                mod.setAdresse(rs.getString(7));
                mod.setTelephone(rs.getString(8));
                mod.setTypePieceProprietaire(rs.getString(9));
                mod.setNoPieceProprietaire(rs.getString(10));
                mod.setDateCreation(rs.getString(11));
                mod.setDescription(rs.getString(12));
                arm.add(mod);
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
            Logger.getLogger(traitementEntreprise.class.getName()).log(Level.SEVERE, null, ex);

        }
        return arm;
    }

    @Override
    public modelEntreprise getFromId(String id) {
        modelEntreprise en = new modelEntreprise();
        sb = new StringBuilder();
        sb.append("SELECT* FROM ENTREPRISES WHERE ID=?");
        con = ConnectionBase.idan();
        try {
            pst = con.prepareStatement(sb.toString());
            pst.setString(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
                en.setId(rs.getString(1));
                en.setIdGroupe(rs.getString(2));
                en.setNomEntreprise(rs.getString(3));
                en.setNomProprietaire(rs.getString(4));
                en.setPrenomProprietaire(rs.getString(5));
                en.setSexe(rs.getString(6));
                en.setAdresse(rs.getString(7));
                en.setTelephone(rs.getString(8));
                en.setTypePieceProprietaire(rs.getString(9));
                en.setNoPieceProprietaire(rs.getString(10));
                en.setDateCreation(rs.getString(11));
                en.setDescription(rs.getString(12));
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
            Logger.getLogger(traitementEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
        return en;
    }
}
