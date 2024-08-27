package model;

public class modelEntreprise {
    // declartion des attributs
    private String id;
    private String idGroupe;
    private String nomEntreprise;
    private String nomProprietaire;
    private String prenomProprietaire;
    private String sexe;
    private String adresse;
    private String telephone;
    private String typePieceProprietaire;
    private String noPieceProprietaire;
    private String dateCreation;
    private String description;
    
    //constructeur de la classe 
    public modelEntreprise() {
    }
    
    //constructeur avec parametres
    public modelEntreprise(String id, String idGroupe, String nomEntreprise, String nomProprietaire, String prenomProprietaire, String sexe, String adresse, String telephone, String typePieceProprietaire, String noPieceProprietaire, String dateCreation, String description) {
        this.id = id;
        this.idGroupe = idGroupe;
        this.nomEntreprise = nomEntreprise;
        this.nomProprietaire = nomProprietaire;
        this.prenomProprietaire = prenomProprietaire;
        this.sexe = sexe;
        this.adresse = adresse;
        this.telephone = telephone;
        this.typePieceProprietaire = typePieceProprietaire;
        this.noPieceProprietaire = noPieceProprietaire;
        this.dateCreation = dateCreation;
        this.description = description;
    }
    //les accesseurs de la classe (les getter) 
    public String getId() {
        return id;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public String getPrenomProprietaire() {
        return prenomProprietaire;
    }

    public String getSexe() {
        return sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getTypePieceProprietaire() {
        return typePieceProprietaire;
    }

    public String getNoPieceProprietaire() {
        return noPieceProprietaire;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getDescription() {
        return description;
    }
    
    // les mutateurs de la classe (les setter)
    public void setId(String id) {
        this.id = id;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public void setPrenomProprietaire(String prenomProprietaire) {
        this.prenomProprietaire = prenomProprietaire;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setTypePieceProprietaire(String typePieceProprietaire) {
        this.typePieceProprietaire = typePieceProprietaire;
    }

    public void setNoPieceProprietaire(String noPieceProprietaire) {
        this.noPieceProprietaire = noPieceProprietaire;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
