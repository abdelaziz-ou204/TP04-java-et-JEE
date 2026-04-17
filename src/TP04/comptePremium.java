package TP04;

class ComptePremium extends Compte {
    private double plafond;

    public ComptePremium(String n, String t, double s, double p) {
        super(n, t, s);
        plafond = p;
    }

    public void retirer(double montant) {

        if (montant <= plafond) {
            solde = solde - montant;
        } else {
            System.out.println("plafond dépasser");
        }

    }
}