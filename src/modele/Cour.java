package part3;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cour {
    private static int nbreDeCours = 0; // Compteur de cours

    protected int id; // Identifiant unique du cours
    protected String nom; // Nom du cours
    protected Date journee; // Date du jour du cours
    protected int cout; // Coût du cours en euros

    

    public Cour(String nom, Date journee, int cout) {
        nbreDeCours++;
        this.id = nbreDeCours;
        this.nom = nom;
        this.journee = journee;
        this.cout = cout;
        
    }

    // Getters and setters
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public Date getJournee() {
        return journee;
    }
    public int getCout() {
        return cout;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setJournee(Date journee) {
        this.journee = journee;
    }
    public void setCout(int cout) {
        this.cout = cout;
    }
    
}
