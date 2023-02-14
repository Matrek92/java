import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
         //instanciation de la classe Rectangle 
        Compte unCompte = new Compte (); 
      //instanciation de la classe Rectangle 
        CompteTitre unCompteTitre = new CompteTitre (); 
        //instanciation de la classe Rectangle 
        CompteEpargne unCompteEpargne = new CompteEpargne (); 
       
        
        Scanner sc = new Scanner (System.in);
        int choix = 0;
        do {
            System.out.println("______ MENU BANQUE _____");
            System.out.println("1- Gérer un compte courant ");
            System.out.println("2- Gérer un compte action");
            System.out.println("3- Gérer un compte epargne");
            System.out.println("0- Quitter "); 
            System.out.println("Votre choix :");
            choix = sc.nextInt(); 
            switch(choix) {
            case 1 : unCompte.menu();break;
            case 2 : unCompteTitre.menu();break;
            case 3 : unCompteEpargne.menu();break;            
            case 0 : System.out.println("Merci");break;
            }
        }while(choix!=0);
            
            
            
        
    }
}