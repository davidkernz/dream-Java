package model;

public class modelPret {
    // declartion des attributs
    private String id;
    private String idGroupe;
    private double montantEmprunte;
    private double interet;
    private double versementMensuel;
    private String datePret;
    private String dateVersement1;
    private String dateVersement2;
    private String dateVersement3;
    private String dateVersement4;
    
    // constructeur de la classe
    public modelPret() {
    }
    
    // constructeur avec paramettres
    public modelPret(String id, String idGroupe, double montantEmprunte, double interet, double versementMensuel, String datePret, String dateVersement1, String dateVersement2, String dateVersement3, String dateVersement4) {
        this.id = id;
        this.idGroupe = idGroupe;
        this.montantEmprunte = montantEmprunte;
        this.interet = interet;
        this.versementMensuel = versementMensuel;
        this.datePret = datePret;
        this.dateVersement1 = dateVersement1;
        this.dateVersement2 = dateVersement2;
        this.dateVersement3 = dateVersement3;
        this.dateVersement4 = dateVersement4;
    }
    
    // les accesseur de la classe (les getter)
    public String getId() {
        return id;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public double getMontantEmprunte() {
        return montantEmprunte;
    }

    public double getInteret() {
        return interet;
    }

    public double getVersementMensuel() {
        return versementMensuel;
    }

    public String getDatePret() {
        return datePret;
    }

    public String getDateVersement1() {
        return dateVersement1;
    }

    public String getDateVersement2() {
        return dateVersement2;
    }

    public String getDateVersement3() {
        return dateVersement3;
    }

    public String getDateVersement4() {
        return dateVersement4;
    }
    
    // les mutateurs de la classe (les setter)
    public void setId(String id) {
        this.id = id;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    public void setMontantEmprunte(double montantEmprunte) {
        this.montantEmprunte = montantEmprunte;
    }

    public void setInteret(double interet) {
        this.interet = interet;
    }

    public void setVersementMensuel(double versementMensuel) {
        this.versementMensuel = versementMensuel;
    }

    public void setDatePret(String datePret) {
        this.datePret = datePret;
    }

    public void setDateVersement1(String dateVersement1) {
        this.dateVersement1 = dateVersement1;
    }

    public void setDateVersement2(String dateVersement2) {
        this.dateVersement2 = dateVersement2;
    }

    public void setDateVersement3(String dateVersement3) {
        this.dateVersement3 = dateVersement3;
    }

    public void setDateVersement4(String dateVersement4) {
        this.dateVersement4 = dateVersement4;
    }
    
}
