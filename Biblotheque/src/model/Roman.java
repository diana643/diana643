package model;

// TO DO ...
public class Roman extends Livre {

	private int prixLitteraire;

	public Roman(int numEnreg, String titre, String auteur, int nbPages, int prixLitteraire) {
		super(numEnreg, titre, auteur, nbPages);
		this.prixLitteraire = prixLitteraire;
	}

	public int getPrixLitteraire() {
		return prixLitteraire;
	}

	public void setPrixLitteraire(int prixLitteraire) {
		this.prixLitteraire = prixLitteraire;
	}

	@Override
	public String toString() {
		return ""+prixLitteraire;
	}
	
	
	
}
