package dev;

import java.util.ArrayList;

public class Carte {

	private int valeur;

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	private String couleur;

	public Carte(int valeur, String couleur) {
		this.setCouleur(couleur);
		this.setValeur(valeur);
	}

	/**
	 * Permet de crée une liste de carte
	 * 
	 * @return ArrayList<Carte>
	 */
	public static ArrayList<Carte> jeuDeCarte() {
		ArrayList<Carte> paquet = new ArrayList<>();
		// on crée les Coeur
		for (int i = 1; i < 14; i++) {
			paquet.add(new Carte(i, "Coeur"));
		}
		// on crée les Carreau
		for (int i = 1; i < 14; i++) {
			paquet.add(new Carte(i, "Carreau"));
		}
		// on crée les Pique
		for (int i = 1; i < 14; i++) {
			paquet.add(new Carte(i, "Pique"));
		}
		// on crée les Trèfle
		for (int i = 1; i < 14; i++) {
			paquet.add(new Carte(i, "Trefle"));
		}
		return paquet;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.valeur + " de " + this.couleur;
	}
}
