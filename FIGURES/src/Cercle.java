import java.util.Scanner;
public class Cercle {
	private float rayon;
	
	public Cercle(){
		this.rayon = 0;
	}
	
	public void saisir() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner un nombre :");
		this.rayon = sc.nextFloat();
	}
	public void afficher() {
		System.out.println("Le rayon est de :" + this.rayon);
	}
	public void surface() {
		float s;
		s = (float) (Math.PI * Math.pow(this.rayon, 2));
		System.out.println("La surface est de :" + s);
	}
	public void perimetre() {
		float p;
		p  = (float) (Math.PI * 2 * this.rayon);
	}
	
	
	
	
	
	
	
	
}
