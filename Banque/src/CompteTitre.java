import java.util.Scanner;
public class CompteTitre {
	private String nom, prenom;
	private int numero, nbTitres;
	private float solde, valeurTitre;
	
	public CompteTitre() {
		this.nom = "";
		this.prenom = "";
		this.numero = 0;
		this.nbTitres = 0;
		this.solde = 0;
		this.valeurTitre = 0;
	}
	
	public void ouvrir() {
		Scanner sc = new Scanner (System.in); 
        System.out.println("Donner le nom :");
        this.nom = sc.next(); 
        System.out.println("Donner le prenom :");
        this.prenom = sc.next(); 
        System.out.println("Donner le numero :");
        this.numero = sc.nextInt(); 
        System.out.println("Donner le nombre de titre :");
        this.nbTitres = sc.nextInt(); 
        System.out.println("Donner le solde :");
        this.solde = sc.nextFloat(); 
        System.out.println("Donner la valeur du titre :");
        this.valeurTitre = sc.nextFloat(); 
        
	}
	public void consulter() {
		System.out.println("Le nom est : " + this.nom);
        System.out.println("Le prenom est : "  + this.prenom);
        System.out.println("Le numero est : " + this.numero);
        System.out.println("Le nombre de titre est de : "  + this.nbTitres);
        System.out.println("Le solde est de : "  + this.solde);
        System.out.println("La valeur du titre est de : "  + this.valeurTitre);
	}
	public void deposer () {
        Scanner sc = new Scanner (System.in); 
        float somme;
        System.out.println("Donner la somme a déposer : ");
        somme = sc.nextFloat();
        this.solde = somme + this.solde;
        System.out.println("New solde : " + this.solde);
    }
	public void retirer () {
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
        }}
	public void acheter() {
		Scanner sc = new Scanner (System.in);
		int action;
		System.out.println("Donner le nombre d'action a acheter :");
		action = sc.nextInt();
		if(this.solde >= action * this.valeurTitre) {
			this.solde = this.solde - action * this.valeurTitre;
			this.nbTitres = this.nbTitres + action;
		}
		else {
			System.out.println("Solde insuffisant :");
		}
		
	}
	public void vendre() {
		Scanner sc = new Scanner (System.in);
		int action;
		System.out.println("Donner le nombre d'action a vendre :");
		action = sc.nextInt();
		if(this.nbTitres >= action) {
			this.solde = this.solde + action * this.valeurTitre;
			this.nbTitres = this.nbTitres - action;
		}
		else {
			System.out.println("Nombre d'action inssufisant pour vendre !");
		}
		
	}
	public void menu () {
        Scanner sc = new Scanner (System.in); 
        int choix = 0; 
        do {
            System.out.println("______ MENU BanqueAction _____");
            System.out.println("1- Ouvrir le compte ");
            System.out.println("2- Consulter le compte");
            System.out.println("3- Déposer "); 
            System.out.println("4- Retirer ");
            System.out.println("5- Vendres des actions ");
            System.out.println("6- Acheter des actions ");
            System.out.println("0- Quitter");
            System.out.println("Votre choix :");
            choix = sc.nextInt(); 
            switch(choix) {
            case 1 : this.ouvrir();break;
            case 2 : this.consulter();break;
            case 3 : this.deposer();break;
            case 4 : this.retirer();break;
            case 0 : System.out.println("Merci"); break;
            }
        }while(choix !=0);
	}
	
	// getters and setters
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNbTitres() {
		return nbTitres;
	}
	public void setNbTitres(int nbTitres) {
		this.nbTitres = nbTitres;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public float getValeurTitre() {
		return valeurTitre;
	}
	public void setValeurTitre(float valeurTitre) {
		this.valeurTitre = valeurTitre;
	}
	
}
