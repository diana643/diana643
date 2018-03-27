package model;

// TO DO ...
public abstract class Document {
	
	private int numEnreg;
	private String titre;
	
	public Document(int numEnreg, String titre) {
		this.numEnreg = numEnreg;
		this.titre = titre;
	}
	

	public int getNumEnreg() {
		return numEnreg;
	}

	public void setNumEnreg(int numEnreg) {
		this.numEnreg = numEnreg;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}


	@Override
	public String toString() {
		return numEnreg + ", " + titre ;
	}
	
	

	
	
}
