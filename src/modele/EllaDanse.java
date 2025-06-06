package part3;
public class EllaDanse {
    private String nom;
    private String adresse;
    private String numTelephone;
    private String email;

    public EllaDanse(String nom, String adresse, String numTelephone, String email) {
        this.nom = nom;
        this.adresse = adresse;
        this.numTelephone = numTelephone;
        this.email = email;
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getnumTelephone() {
        return numTelephone;
    }
    public void setnumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
