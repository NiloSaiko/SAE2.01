package modele;
import java.util.ArrayList;
import java.util.Date;

import modele.Eleve;

public class Cour {
    private static int nbreDeCours = 0; // Compteur de cours

    protected int id; // Identifiant unique du cours
    protected String nom; // Nom du cours
    protected Date journee; // Date du jour du cours
    protected int cout; // Coût du cours en euros
    
    
    static private ArrayList<Eleve> lesParticipant = new ArrayList<>();
    

    public Cour(String nom, Date journee, int cout) {
        nbreDeCours++;
        this.id = nbreDeCours;
        this.nom = nom;
        this.journee = journee;
        this.cout = cout;
        
    }
    // Main
    public static void main(String[] args) {
        Eleve e1 = new Eleve("John", "Doe", "adresse1", "adresse2", "12345", "Paris");
        Eleve e2 = new Eleve("Jane", "Smith", "adresse3", "adresse4", "67890", "Lyon");
        Eleve e3 = new Eleve("Alice", "Johnson", "adresse5", "adresse6", "54321", "Marseille");
        Eleve e4 = new Eleve("Bob", "Brown", "adresse7", "adresse8", "98765", "Toulouse");
        Eleve e5 = new Eleve("Charlie", "Davis", "adresse9", "adresse10", "11223", "Nice");
        Eleve e6 = new Eleve("Eve", "Wilson", "adresse11", "adresse12", "44556", "Bordeaux");
        Eleve e7 = new Eleve("Frank", "Garcia", "adresse13", "adresse14", "77889", "Lille");
        Eleve e8 = new Eleve("Grace", "Martinez", "adresse15", "adresse16", "99000", "Strasbourg");
        Eleve e9 = new Eleve("Hank", "Lopez", "adresse17", "adresse18", "22334", "Nantes");
        Eleve e10 = new Eleve("Ivy", "Gonzalez", "adresse19", "adresse20", "55667", "Rennes");
        Cour c1 = new Cour("Mathématiques", new Date(), 50);
        c1.ajouterEleve(e1);
        c1.ajouterEleve(e2);
        c1.ajouterEleve(e3);
        c1.ajouterEleve(e4);
        c1.ajouterEleve(e5);
        c1.ajouterEleve(e6);
        c1.ajouterEleve(e7);
        c1.ajouterEleve(e8);
        c1.ajouterEleve(e9);
        c1.ajouterEleve(e10);
        c1.afficher();
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
    
    public ArrayList<Eleve> getLesEleves(){
    	return lesParticipant;
    }


    public void ajouterEleve(Eleve e) {
        e.ajouterCour(this);
		lesParticipant.add(e);
	}
	
	public void supprimerEleve(Eleve e) {
		if (lesParticipant.contains(e)) {
            e.seDesinscrire(this);
            lesParticipant.remove(e);
        }
	}
	
	//Affichage
    public void afficher() {
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Journee: " + journee);
        System.out.println("Cout: " + cout);
        System.out.println("Participants: ");
        for (Eleve e : lesParticipant) {
            System.out.println("- " + e.getNom() + " " + e.getPrenom());
        }
    }
    
}
