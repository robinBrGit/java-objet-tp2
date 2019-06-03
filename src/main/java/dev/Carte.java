package dev;

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.valeur + " de " + this.couleur;
	}
}
