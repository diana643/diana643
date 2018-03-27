package model;

// TO DO ...
public class Livre extends Document implements InterfaceAuteur{

	private String auteur;
	private int nbPages;
	
	public Livre(int numEnreg, String titre, String auteur, int nbPages) {
		super(numEnreg, titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	@Override
	public String toString() {
		return auteur + ", " + nbPages ;
	}
	
	
	
	
	
	
	
	
}
