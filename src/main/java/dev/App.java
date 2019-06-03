package dev;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Carte c1 = new Carte(1, "Trefle");
		Carte c2 = new Carte(8, "Pique");
		Carte c3 = new Carte(8, "Coeur");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		ArrayList<Carte> paquet = Carte.jeuDeCarte();
		System.out.println(paquet);
		Collections.shuffle(paquet);
		System.out.println(paquet);

		Joueur joueur1 = new Joueur(paquet.subList(0, paquet.size() / 2));
		Joueur joueur2 = new Joueur(paquet.subList(paquet.size() / 2, paquet.size()));

		System.out.println(joueur1.getMainCourrante());
		System.out.println(joueur2.getMainCourrante());

		System.out.println(joueur1.getMainCourrante().get(8));

	}
}
