package TP04;

class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;

    // Constructeur
    public Compte(String n, String t, double s) {
        numero = n;
        titulaire = t;
        solde = s;
    }

    // Déposer
    public void deposer(double m) {
        solde = solde + m;
    }

    // Retirer
    public void retirer(double m) {
        if (m <= solde) {
            solde = solde - m;
        }
    }

    // Afficher
    public void afficher() {
        System.out.println(numero + " | " + titulaire + " | " + solde);
    }
}