import java.util.Scanner;

public class Etudiant {
	protected int carteEtudiant;
	protected String nom, prenom;
	
	public Etudiant ()
	{
		this.carteEtudiant=0;
		this.nom="";
		this.prenom="";
	}
	
	
	public Etudiant(int carteEtudiant, String nom, String prenom) {
		this.carteEtudiant = carteEtudiant;
		this.nom = nom;
		this.prenom = prenom;
	}
	public void saisir () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner une carte");
		this.carteEtudiant = sc.nextInt();
		System.out.println("Donner le nom");
		this.nom = sc.next();
		System.out.println("Donner le prenom");
		this.prenom = sc.next();
	}
	public void afficher() {
		System.out.println("Le num de carte : " + this.carteEtudiant);
		System.out.println("Le nom : " + this.nom);
		System.out.println("Le prenom : " + this.prenom);
	}


	public int getCarteEtudiant() {
		return carteEtudiant;
	}


	public void setCarteEtudiant(int carteEtudiant) {
		this.carteEtudiant = carteEtudiant;
	}


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
	
	
	
	
	
}

