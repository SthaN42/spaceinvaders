package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class SpaceInvadersTest {
	
	SpaceInvaders spaceinvaders;
	
	@Before
	public void initialisation() {
		spaceinvaders = new SpaceInvaders(15,10);
	}
	
	 @Test
	 public void test_AuDebut_JeuSpaceInvaderEstVide() {
	assertEquals("" + 
		"...............\n" + 
	 	"...............\n" +
	 	"...............\n" + 
	 	"...............\n" + 
	 	"...............\n" + 
	 	"...............\n" + 
	 	"...............\n" + 
	 	"...............\n" + 
	 	"...............\n" + 
	 	"...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	 }
	 
	 @Test
	 public void test_unNouveauVaisseauEstCorrectemntPositionneDansEspaceJeu() {
		 spaceinvaders.positionnerUnNouveauVaisseau(7,9);
		 assertEquals("" + 
					"...............\n" + 
					"...............\n" +
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					".......V.......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	 }
	 
	 @Test
	 public void test_unNouveauVaisseauEstPositionneHorsEspaceJeu_DoitLeverUneException() {
		 try {
			 spaceinvaders.positionnerUnNouveauVaisseau(15,9);
			 fail("Position trop a droite : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
		 
		 try {
			 spaceinvaders.positionnerUnNouveauVaisseau(-1,9);
			 fail("Position trop a gauche : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
		 
		 try {
			 spaceinvaders.positionnerUnNouveauVaisseau(14,10);
			 fail("Position trop en bas : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
		 
		 try {
			 spaceinvaders.positionnerUnNouveauVaisseau(14,-1);
			 fail("Position trop en haut : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
	 }
	 
	 @Test
	 public void test_VaisseauAvance_DeplacerVaisseauVersLaDroite() {
		 spaceinvaders.positionnerUnNouveauVaisseau(7, 9);
		 
		 spaceinvaders.deplacerVaisseauVersLaDroite();
		 
		 assertEquals("" + 
					"...............\n" + 
					"...............\n" +
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"...............\n" + 
					"........V......\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	 }
	 
	 @Test
	 public void test_VaisseauImmoblie_DeplacerVaisseauVersLaDroite() {
		 spaceinvaders.positionnerUnNouveauVaisseau(14, 9);
		 
		 spaceinvaders.deplacerVaisseauVersLaDroite();
		 
		 assertEquals("" +
				 "...............\n" +
				 "...............\n" +
				 "...............\n" +
				 "...............\n" +
				 "...............\n" +
				 "...............\n" +
				 "...............\n" +
				 "...............\n" +
				 "...............\n" +
				 "..............V\n", spaceinvaders.recupererEspaceJeuDansChaineASCII());
	 }
	 
	 @Test
	 public void testVaisseauAvance_DeplacerVaisseauVersLagauche() {
		 spaceinvaders.positionnerUnNouveauVaisseau(7, 9);
		 
		 spaceinvaders.deplacerVaisseauVersLaGauche();
		 
		 assertEquals("" + 
				"...............\n" + 
				"...............\n" +
				"...............\n" + 
				"...............\n" + 
				"...............\n" + 
				"...............\n" + 
				"...............\n" + 
				"...............\n" + 
				"...............\n" + 
				"......V........\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	 }
	 
	 @Test
		public void test_VaisseauImmobile_DeplacerVaisseauVersLaGauche() {
			
			spaceinvaders.positionnerUnNouveauVaisseau(0,9);

			spaceinvaders.deplacerVaisseauVersLaGauche();
			
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"V..............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
		}
	 
	 @Test
	 public void test_unNouveauVaisseauAvecDimensionEstCorrectementPositionneDansEspaceJeu() {
		 spaceinvaders.positionnerUnNouveauVaisseau(3,2,7,9);
			assertEquals("" + 
			"...............\n" + 
			"...............\n" +
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			"...............\n" + 
			".......VVV.....\n" + 
			".......VVV.....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	 }
}
