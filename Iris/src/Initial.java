import java.util.Scanner;

public class Initial extends Etudiant 
{
	private String garant ;
	private static float montant ;
	
	public Initial()
	{
		super ();
		this.garant = "" ;
		Initial.montant = 5000;
	}
	
	public Initial(int carteEtudiant, String nom, String prenom, String garant, float montant)
	{
		super (carteEtudiant, prenom, nom);
		this.garant = garant ;
		Initial.montant = montant;
	}
	
	public void saisir () {
		Scanner sc = new Scanner(System.in);
		super.saisir(); //saisie des attributs hérités de Etudiant
		System.out.println("Donner le garant");
		this.garant = sc.next();
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Le garant : " + this.garant);
		System.out.println("Le montant : " + Initial.montant);
	}

	public String getGarant() {
		return garant;
	}

	public void setGarant(String garant) {
		this.garant = garant;
	}

	public static float getMontant() {
		return montant;
	}

	public static void setMontant(float montant) {
		Initial.montant = montant;
	}
	
	
	
}
