import java.util.Scanner;
public class Compte {
    private String nom, prenom; 
    private int numero; 
    private float solde ; 
    
    public Compte () {
        this.nom="";
        this.prenom="";
        this.numero=0;
        this.solde=0;
    }
    public void ouvrir() {
        Scanner sc = new Scanner (System.in); 
        System.out.println("Donner le nom :");
        this.nom = sc.next(); 
        System.out.println("Donner le prenom :");
        this.prenom = sc.next(); 
        System.out.println("Donner le numero :");
        this.numero = sc.nextInt(); 
        System.out.println("Donner le solde :");
        this.solde = sc.nextFloat(); 
    }
    public void consulter () {
        System.out.println("Le nom est : " + this.nom);
        System.out.println("Le prenom est : "  + this.prenom);
        System.out.println("Le numero est : " + this.numero);
        System.out.println("Le solde est de : "  + this.solde);
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
        }
    }
    public void menu () {
        Scanner sc = new Scanner (System.in); 
        int choix = 0; 
        do {
            System.out.println("______ MENU Banque _____");
            System.out.println("1- Ouvrir le compte ");
            System.out.println("2- Consulter le compte");
            System.out.println("3- Déposer "); 
            System.out.println("4- Retirer ");
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
    //getters and setters 
    public String getNom() {
        return nom;
    }
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
    public float getSolde() {
        return solde;
    }
    public void setSolde(float solde) {
        this.solde = solde;
    }
    
}