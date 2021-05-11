package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;
	int longueur;
	int hauteur;
	
	// constructeur
	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur = longueur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}
	
	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

	// méthodes
	public boolean occupeLaPosition(int x, int y) {
	     return estAbcisseCouverte(x) && estOrdonneeCouverte(y);
	}

	public boolean estOrdonneeCouverte(int y) {
		return ordonneeLaPlusBasse(y) <= y && (y <= ordonneeLaPlusHaute());
	}

	public int ordonneeLaPlusBasse(int y) {
		return ordonneeLaPlusHaute() - this.hauteur + 1;
	}

	private boolean estAbcisseCouverte(int x) {
		return (abcisseLaPlusAGauche() <= x) && (x <= abcisseLaPlusADroite());
	}

	public int abcisseLaPlusADroite() {
		return this.x + this.longueur - 1;
	}

	public void positionner(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	public void seDeplacerVersLaDroite() {
		this.x += 1;
	}

	public void seDeplacerVersLaGauche() {
		this.x -= 1;		
	}
	
	// getters
	public int abcisseLaPlusAGauche() {
		return this.x;
	}
	
	public int ordonneeLaPlusHaute() {
		return this.y;
	}

}
