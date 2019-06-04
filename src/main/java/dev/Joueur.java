package dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Joueur {
	private String pseudo;
	private ArrayList<Carte> mainCourrante;

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public ArrayList<Carte> getMainCourrante() {
		return mainCourrante;
	}

	public void setMainCourrante(ArrayList<Carte> mainCourrante) {
		this.mainCourrante = mainCourrante;
	}

	public Joueur(String pseudo, List<Carte> mainCourrante) {
		this.pseudo = pseudo;
		this.mainCourrante = new ArrayList<>(mainCourrante);
	}

	public void jouerBataille(Joueur p) {
		Carte cJ1 = null, cJ2 = null;
		int countE;
		int countM = 0;
		ArrayList<Carte> board = new ArrayList<Carte>();
		// tant que la main du joueur 1 ou du joueur 2 n'est pas vide
		while (!this.getMainCourrante().isEmpty() && !p.getMainCourrante().isEmpty()) {
			countE = 1;
			// tant que cJ1 et egale a cJ2
			do {

				if (countE > 1) {
					if (this.getMainCourrante().isEmpty() || p.getMainCourrante().isEmpty()) {
						break;
					}
					board.add(this.getMainCourrante().get(0));
					board.add(p.getMainCourrante().get(0));
					this.getMainCourrante().remove(0);
					p.getMainCourrante().remove(0);
				}
				cJ1 = this.getMainCourrante().get(0);
				board.add(cJ1);
				this.getMainCourrante().remove(0);

				cJ2 = p.getMainCourrante().get(0);
				board.add(cJ2);
				p.getMainCourrante().remove(0);
				// si il y égalité on rajoute une carte a la table face caché

				// Le joueur 1 joue une carte
				System.out.println(this.getPseudo() + " joue le " + cJ1);
				// Le joueur 2 joue une carte
				System.out.println(p.getPseudo() + " joue le " + cJ2);
				countE++;
			} while (cJ1.compareCarte(cJ2).equals("="));
			// on melange les carte de la table avant que le gagnant les ajoute a ça main
			Collections.shuffle(board);
			// si cJ1 < cJ2 joueur 2 gagne la manche et donc les carte de la table
			if (cJ1.compareCarte(cJ2).equals("<")) {
				p.getMainCourrante().addAll(board);
				board.clear();
				System.out.println(p.getPseudo() + " gagne la manche");
				System.out.println("-------------------------------");
			}
			// si cJ1 > cJ2 joueur 1 gagne la manche et donc les carte de la table
			if (cJ1.compareCarte(cJ2).equals(">")) {
				this.getMainCourrante().addAll(board);
				board.clear();
				System.out.println(this.getPseudo() + " gagne la manche");
				System.out.println("-------------------------------");
			}
			countM++;
		}

		if (this.getMainCourrante().isEmpty()) {
			System.out.println(p.getPseudo() + " Gagne la partie en " + countM + " manche");
		} else
			System.out.println(this.getPseudo() + " Gagne la partie en " + countM + " manche");

	}
}
