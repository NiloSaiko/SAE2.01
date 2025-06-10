package modele;
public class Rappel extends Facture {
    private static int nbreDeRappels = 0; // Compteur de rappels
    
    public Rappel(Eleve eleve, EllaDanse ella) {
        super(eleve, ella);
        nbreDeRappels++;
        this.numero = nbreDeRappels; // Assigne un numéro unique pour le rappel
        this.montantTotal = 0; // Le montant total est 0 pour un rappel
    }
}
