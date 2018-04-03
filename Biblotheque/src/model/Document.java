package model;

// TO DO ...
public abstract class Document {
	
	private int numEnreg = 0;
	private String titre;
	
	public Document(String titre){
		this.titre = titre;
		numEnreg += 1;
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
		return numEnreg + " , " + titre ;
	}
}
