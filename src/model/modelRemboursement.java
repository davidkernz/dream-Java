package model;

public class modelRemboursement {
    // Declaration des attribut
    private String id;
    private String idPret;
    private String nomVersement;
    private double montantRembourse;
    private String dateRemboursement;
    
    // Constructeur de la classe
    public modelRemboursement() {
    }
    
    // Constructeur avec paramettre
    public modelRemboursement(String id, String idPret, String nomVersement, double montantRembourse, String dateRemboursement) {
        this.id = id;
        this.idPret = idPret;
        this.nomVersement = nomVersement;
        this.montantRembourse = montantRembourse;
        this.dateRemboursement = dateRemboursement;
    }
    
    // les accesseur de la classe (les getter)
    public String getId() {
        return id;
    }

    public String getIdPret() {
        return idPret;
    }

    public String getNomVersement() {
        return nomVersement;
    }

    public double getMontantRembourse() {
        return montantRembourse;
    }

    public String getDateRemboursement() {
        return dateRemboursement;
    }
    
    // les mutateurs de la classe (les setter)
    public void setId(String id) {
        this.id = id;
    }

    public void setIdPret(String idPret) {
        this.idPret = idPret;
    }

    public void setNomVersement(String nomVersement) {
        this.nomVersement = nomVersement;
    }

    public void setMontantRembourse(double montantRembourse) {
        this.montantRembourse = montantRembourse;
    }

    public void setDateRemboursement(String dateRemboursement) {
        this.dateRemboursement = dateRemboursement;
    }  
}
