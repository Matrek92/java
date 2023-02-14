public class Morpion {
	
	
	
	public final static int NEUTRE = 0;	
	public final static int CROIX = 1;	
	public final static int ROND = 2;
	
	private int cases[][];
	private int joueur;
	private int nbCoups;
	
	public Morpion() {

		cases = new int[3][3];
		joueur = CROIX;
	}
	
	
	
		
	
	public void recommencer() {
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++ ) {
			cases[i][j] = NEUTRE;
     }
 }
 joueur = CROIX;
     nbCoups = 0;
 }
	public boolean setCase(int i, int j) {
		if (cases[i][j] == NEUTRE) {
			cases[i][j] = joueur;
		    nbCoups++;
		    if (gagne(i,j)) {
		    	return true;
		    }
		    joueur = ( joueur == CROIX ? ROND : CROIX);
		}
		return false;
	}
	
	private boolean gagne(int i, int j) {
		return (((cases[i][0] == cases[i][1]) && //ligne de la case pleine
		(cases[i][1] == cases[i][2])) ||
		((cases[0][j] == cases[1][j]) && //col. de la case pleine
	    (cases[1][j] == cases[2][j])) ||
	    ((i == j) &&                     // diagonale pleine
	    (cases[0][0] == cases[1][1]) &&
	    (cases[1][1] == cases[2][2])) ||
	    ((i + j == 2) &&                 // diagonale pleine
	    (cases[0][2] == cases[1][1]) &&
	    (cases[1][1] == cases[2][0])));
	}
	
	
	
	 public int getJoueur() {
		 return joueur;
	 }
	 public int getNbCoups() {
		 return nbCoups;
	 }


	 public static void main(String args[])
	 {
		 Morpion unMorpion = new Morpion();
		 
	 }


}

