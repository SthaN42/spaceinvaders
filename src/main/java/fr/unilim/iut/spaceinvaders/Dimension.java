package fr.unilim.iut.spaceinvaders;

public class Dimension {
	int longueur;
	int hauteur;

	public Dimension(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

	public int hauteur() {
		return hauteur;
	}

	public int longueur() {
		return longueur;
	}
}
