package TP04;

public class Test {
    public static void main(String[] args) {

        Compte c1 = new CompteCourant("C1", "user", 6450, 4000);
        Compte c2 = new CompteEpargne("C2", "ahmed", 4500, -85);
        Compte c3 = new ComptePremium("C3", "farid", 3214, 1700);
        Compte c4 = new CompteCourant("C1", "user", 6450, 4000);
        Compte c5 = new CompteCourant("C1", "user", 6450, 4000);
        Compte c6 = 
        		new CompteCourant("C1", "user", 6450, 4000);

        c1.deposer(100);
        c1.retirer(200);
        c1.afficher();

        System.out.println(""
        		+ "");
        
        c2.deposer(50);
        c2.retirer(100);
        c2.afficher();

        System.out.println(""
        		+ "");
        
        c3.deposer(200);
        c3.retirer(1500);
        c3.afficher();
        System.out.println(""
        		+ "");
        
        c6.deposer(80);
        c6.retirer(50);
        c6.afficher();
        System.out.println(""
        		+ "");
        c5.deposer(10000);
        c5.retirer(500);
        c5.afficher();

    }
}