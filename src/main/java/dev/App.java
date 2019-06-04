package dev;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ArrayList<Carte> paquet = Carte.jeuDeCarte();
		System.out.println(paquet);
		Collections.shuffle(paquet);
		System.out.println(paquet);

		Joueur joueur1 = new Joueur("Robin", paquet.subList(0, 26));
		Joueur joueur2 = new Joueur("Alexei", paquet.subList(26, 52));

		System.out.println(joueur1.getMainCourrante());
		System.out.println(joueur2.getMainCourrante());

		joueur1.jouerBataille(joueur2);

	}
}
