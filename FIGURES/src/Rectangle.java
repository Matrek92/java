import java.util.Scanner;
public class Rectangle {
    //attributs 
    private float lg, lr ; 
    
    //constructeur 
    public Rectangle () {
        this.lg = 0; 
        this.lr = 0; 
    }
    
    //methodes 
    public void renseigner () {
        Scanner sc = new Scanner (System.in); 
        System.out.println("Donner la longueur :");
        this.lg = sc.nextFloat(); 
        System.out.println("Donner la largeur :");
        this.lr = sc.nextFloat(); 
    }
    public void afficher() {
        System.out.println("La longueur est de : " + this.lg);
        System.out.println("La largeur est de : "  + this.lr);
    }
    public void surface () {
        float s; 
        s = this.lg * this.lr; 
        System.out.println("La surface est de :" + s);
    }
    public void perimetre () {
        float p; 
        p = 2*(this.lg + this.lr); 
        System.out.println("Le périmètre est de : " + p );
    }
    public void menu () {
        Scanner sc = new Scanner (System.in); 
        int choix = 0; 
        do {
            System.out.println("______ MENU Rectangle _____");
            System.out.println("1- Renseigner les côtés ");
            System.out.println("2- Afficher les côtés");
            System.out.println("3- La surface "); 
            System.out.println("4- Le périmètre ");
            System.out.println("0- Quitter");
            System.out.println("Votre choix :");
            choix = sc.nextInt(); 
            switch(choix) {
            case 1 : this.renseigner();break;
            case 2 : this.afficher();break;
            case 3 : this.surface();break;
            case 4 : this.perimetre();break;
            case 0 : System.out.println("Merci"); break;
            }
        }while(choix !=0);
    }
    
    //getters and setters 
    public float getLg() {
        return lg;
    }
    public void setLg(float lg) {
        this.lg = lg;
    }
    public float getLr() {
        return lr;
    }
    public void setLr(float lr) {
        this.lr = lr;
    }   
}