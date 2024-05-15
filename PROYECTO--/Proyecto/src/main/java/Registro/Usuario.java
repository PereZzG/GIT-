package Registro;

public class Usuario {
    private String coElec;
    private String con;
    private String confCon;
    private String nom;
    private String ape;
    private String cc;

    public Usuario(String coElec, String con, String confCon, String nom, String ape, String cc) {
        this.coElec = coElec;
        this.con = con;
        this.confCon = confCon;
        this.nom = nom;
        this.ape = ape;
        this.cc = cc;
    }

    // Getter y Setter para coElec
    public String getCoElec() {
        return coElec;
    }

    public void setCoElec(String coElec) {
        this.coElec = coElec;
    }

    // Getter y Setter para con
    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    // Getter y Setter para confCon
    public String getConfCon() {
        return confCon;
    }

    public void setConfCon(String confCon) {
        this.confCon = confCon;
    }

    // Getter y Setter para nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter y Setter para ape
    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    // Getter y Setter para cc
    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}