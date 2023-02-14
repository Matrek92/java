import java.util.Scanner;
public class Alternant extends Etudiant {
	
	private String entreprise;
	private static int nbAnnees;
	private float salaire;
	
	public Alternant()
	{
		super ();
		this.entreprise = "" ;
		Alternant.nbAnnees = 0;
		this.salaire = 0;
	}
	
	public Alternant(int carteEtudiant, String nom, String prenom, String entreprise, int nbAnnees, float salaire)
	{
		super (carteEtudiant, prenom, nom);
		this.entreprise = entreprise ;
		Alternant.nbAnnees = nbAnnees;
		this.salaire = salaire;
	}
	
	public void saisir () {
		Scanner sc = new Scanner(System.in);
		super.saisir(); //saisie des attributs hérités de Etudiant
		System.out.println("Donner l'entreprise : ");
		this.entreprise = sc.next();
		System.out.println("Donner le salaire : ");
		this.salaire = sc.nextFloat();
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("L'entreprise : " + this.entreprise);
		System.out.println("Le nombre d'années : " + Alternant.nbAnnees);
		System.out.println("Le salaire : " + this.salaire);

		}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public static int getNbAnnees() {
		return nbAnnees;
	}

	public static void setNbAnnees(int nbAnnees) {
		Alternant.nbAnnees = nbAnnees;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
	
}
