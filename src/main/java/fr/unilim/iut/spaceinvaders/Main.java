package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.moteurJeu.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		SpaceInvaders jeu = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
		DessinSpaceInvaders aff = new DessinSpaceInvaders(jeu);
		
		jeu.initialiserJeu();
		
		MoteurGraphique moteur = new MoteurGraphique(jeu, aff);
		moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR,Constante.ESPACEJEU_HAUTEUR);
	}
}
