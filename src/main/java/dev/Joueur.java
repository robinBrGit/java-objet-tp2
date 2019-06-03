package dev;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	private ArrayList<Carte> mainCourrante;

	public ArrayList<Carte> getMainCourrante() {
		return mainCourrante;
	}

	public void setMainCourrante(ArrayList<Carte> mainCourrante) {
		this.mainCourrante = mainCourrante;
	}

	public Joueur(List<Carte> mainCourrante) {
		this.mainCourrante = new ArrayList<>(mainCourrante);
	}

}
