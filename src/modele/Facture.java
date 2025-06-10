package modele;
import java.util.Calendar;
import java.util.Date;

public class Facture {
    private static int nbreDeFactures = 0; // Compteur de factures
    protected int numero;
    protected Date dateEmission;
    protected double montantTotal;
    protected Eleve eleve;
    protected EllaDanse ellaDanse;

    public Facture(Eleve eleve, EllaDanse ella) {
        nbreDeFactures++;
        this.numero = nbreDeFactures;
        this.dateEmission = Calendar.getInstance().getTime(); // Date actuelle
        this.montantTotal = eleve.coutTotal();
        this.eleve = eleve;
        this.ellaDanse = ella;
    }

    //Getters and setters
    public int getNumero() {
        return numero;
    }
    public Date getDateEmission() {
        return dateEmission;
    }
    public double getMontantTotal() {
        return montantTotal;
    }
    public Eleve getEleve() {
        return eleve;
    }
    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
        this.montantTotal = eleve.coutTotal(); // Met à jour le montant total
    }

}