package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;
	int longueur;
	int hauteur;
	
	// constructeur
	public Vaisseau(int x, int y) {
		this.longueur = 1;
		this.hauteur = 1;
		this.x = x;
		this.y = y;
	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur = longueur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}

	// méthodes
	public boolean occupeLaPosition(int x, int y) {
		if ((this.x <= x) && (x <= this.x + this.longueur - 1)) 
		      if ((this.y - this.hauteur + 1 <= y) && (y <= this.y))
			  return true;
		
	     return false;
	}

	public void seDeplacerVersLaDroite() {
		this.x += 1;
	}

	public void seDeplacerVersLaGauche() {
		this.x -= 1;		
	}
	
	// getters
	public int abcisse() {
		return x;
	}

}
