package fr.unilim.iut.spaceinvaders;

public abstract class Sprite {

	protected Position origine;
	protected Dimension dimension;
	protected int vitesse;

	protected Sprite() {
		super();
	}

	public Sprite(Dimension dimension, Position origine, int vitesse) {
		super();
		this.origine = origine;
		this.dimension = dimension;
		this.vitesse = vitesse;
	}

	public boolean occupeLaPosition(int x, int y) {
		return estAbscisseCouverte(x) && estOrdonneeCouverte(y);
	}

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse() <= y) && (y <= ordonneeLaPlusHaute());
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}

	public int ordonneeLaPlusBasse() {
		return this.origine.ordonnee() - this.dimension.hauteur() + 1;
	}

	public int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse() + this.dimension.longueur() - 1;
	}

	public int abscisseLaPlusAGauche() {
		return this.origine.abscisse();
	}

	public void positionner(int x, int y) {
		this.origine.changerAbscisse(x);
		this.origine.changerOrdonnee(y);
	}

	public void deplacerVerticalementVers(Direction direction) {
		this.origine.changerOrdonnee(this.origine.ordonnee() + direction.valeur() * vitesse);
	}
	
	public void deplacerHorizontalementVers(Direction direction) {
		this.origine.changerAbscisse(this.origine.abscisse() + direction.valeur() * vitesse);
	}
	
	//TODO Faire déplacer le missile à la verticale de manière autonome : 2. Le jeu SpaceInvaders doit gérer le déplacement du missile

}