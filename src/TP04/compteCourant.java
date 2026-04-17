package TP04;

class CompteCourant extends Compte {

    double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }
    
    public void retirer(double montant) {

        if (solde + decouvertAutorise >= montant) {
            solde = solde - montant;
        } else {
            System.out.println("makaynch flouss kafiin");
        }
    }
    
    public void afficher() {
        System.out.println("numero: " + numero ); 
        System.out.println("titulaire: " + titulaire);
        System.out.println("solde: " + solde);
        System.out.println("decouvert: " + decouvertAutorise);
    }
}