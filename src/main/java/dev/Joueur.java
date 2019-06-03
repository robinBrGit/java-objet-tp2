package dev;

import java.util.ArrayList;
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

	public void jouer() {
		if (this.mainCourrante.isEmpty()) {
			System.out.println(this.pseudo + " n'a plus de carte");
		} else {
			System.out.println(this.pseudo + " joue le " + this.mainCourrante.get(0));
			this.mainCourrante.remove(0);
		}

	}
}
