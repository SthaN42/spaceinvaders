package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class SpaceInvadersTest {
	
	@Before
	public void initialisation() {
		SpaceInvaders spaceinvaders = new SpaceInvaders(15,10);
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
		 spaceinvaders.positionnerunNouveauVaisseau(7,9);
		 assertEquals("" +
		 "...............\n" +
		 "...............\n" +
		 "...............\n" +
		 "...............\n" +
		 "...............\n" +
		 "...............\n" +
		 "...............\n" +
		 ".........V.....\n" +
		 "...............\n" +
		 "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	 }
	 
	 @Test
	 public void test_unNouveauVaisseauEstPositionneHorsEspaceJeu_DoitLeverUneException() {
		 try {
			 spaceinvaders.positionnerunNouveauVaisseau(15,9);
			 fail("Position trop a droite : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
		 
		 try {
			 spaceinvaders.positionnerunNouveauVaisseau(-1,9);
			 fail("Position trop a gauche : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
		 
		 try {
			 spaceinvaders.positionnerunNouveauVaisseau(14,10);
			 fail("Position trop en bas : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
		 
		 try {
			 spaceinvaders.positionnerunNouveauVaisseau(14,-1);
			 fail("Position trop en haut : devrait déclencher une excpetion HorsEspaceJeuException");
		 } catch(final HorsEspaceJeuException e) {
		 }
	 }

}