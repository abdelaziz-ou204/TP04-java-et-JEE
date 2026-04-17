package TP04;
class CompteEpargne extends Compte {

    double tauxInteret;
    
    public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) {
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    // calcul des intérêts
    public void calculerInteret() {
        solde = solde + solde * tauxInteret;
    }
    
    public void retirer(double x) {

        if (x <= solde) {
            solde = solde - x;
        } else {
            System.out.println("le solde est insuffisant");
        }

    }
}