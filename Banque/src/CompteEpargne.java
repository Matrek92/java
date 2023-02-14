import java.util.Scanner;

public class CompteEpargne {
	private String nom, prenom;
	private int numero;
	private float solde;
	private float taux;
	private float interets;
	
	public CompteEpargne() {
		this.nom = "";
		this.prenom = "";
		this.solde = 0;
		this.taux = 2;
		this.interets = 0;
	}

	public void ouvrir() {
		Scanner sc = new Scanner (System.in); 
        System.out.println("Donner le nom :");
        this.nom = sc.next(); 
        System.out.println("Donner le prenom :");
        this.prenom = sc.next();  
        System.out.println("Donner le solde :");
        this.solde = sc.nextFloat(); 
        System.out.println("Donner le taux :");
        this.taux = sc.nextFloat();
        System.out.println("Donner les interets :");
        this.interets = sc.nextFloat();
	}
	public void consulter() {
		System.out.println("Le nom est : " + this.nom);
        System.out.println("Le prenom est : "  + this.prenom);
        System.out.println("Le solde est : " + this.solde);
        System.out.println("Le taux est de : "  + this.taux);
        System.out.println("L'interet est de : "  + this.interets);
	}
	
	public void deposer() {
		Scanner sc = new Scanner (System.in); 
        float somme;
        System.out.println("Donner la somme a déposer : ");
        somme = sc.nextFloat();
        this.solde = somme + this.solde;
        System.out.println("New solde : " + this.solde);
	}
	
	public void retirer() {
		Scanner sc = new Scanner (System.in); 
        float somme;
        System.out.println("Donner la somme a retirer : ");
        somme = sc.nextFloat();
        if (this.solde >= somme ) {
            this.solde = this.solde - somme;
            System.out.println("New solde : " + this.solde);
        }
        else {
            System.out.println("Votre solde est insuffisant !!");
        }
		
	}
	public void calculInterets() {
		this.interets = this.solde * this.taux /100;
		System.out.println("Les interets :" + this.interets);
		this.solde = this.solde + this.interets;
		System.out.println("New solde : " + this.solde);
	}
	
	
		public void menu () {
	        Scanner sc = new Scanner (System.in); 
	        int choix = 0; 
	        do {
	            System.out.println("______ MENU Banque Epargne _____");
	            System.out.println("1- Ouvrir le compte ");
	            System.out.println("2- Consulter le compte");
	            System.out.println("3- Déposer "); 
	            System.out.println("4- Retirer ");
	            System.out.println("5- Calcul interets ");
	            System.out.println("0- Quitter");
	            System.out.println("Votre choix :");
	            choix = sc.nextInt(); 
	            switch(choix) {
	            case 1 : this.ouvrir();break;
	            case 2 : this.consulter();break;
	            case 3 : this.deposer();break;
	            case 4 : this.retirer();break;
	            case 5 : this.calculInterets();break;
	            case 0 : System.out.println("Merci"); break;
	            }
	        }while(choix !=0);
		}
	}
	
