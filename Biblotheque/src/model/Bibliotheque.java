package model;


import java.util.List;


public class Bibliotheque {

	// Liste des documents de la bibliotheque
	private List<Document> documents;

	/**
	 * Constructeur d'une bibliotheque dont la liste de documents est vide.
	 */
	public Bibliotheque() {
		// TO DO ... ( "vide" ne veut pas dire null ! )
		throw new RuntimeException("Bibliotheque() not yet implemented"); 
	}
	
	/**
	 * Renvoie la liste des documents de la bibliotheque.
	 */
	public List<Document> getDocuments() {
		return documents;
	}

	/**
	 * Renvoie le i ème document de la liste des documents, s’il existe, 
	 * ou null sinon.
	 */
	public Document getDocument(int i) {
		// TO DO ...
		Document doc = null;
		try{
			doc = documents.get(i);
			throw new RuntimeException("getDocument() not yet implemented");	
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		return doc;
	}


	/**
	 * Si doc est non null et n'appartient pas déjà à la liste des documents,
	 * alors ajoute doc à cette liste et renvoie true ;
	 * sinon renvoie faux.
	 */
	public boolean addDocument(Document doc) {
		// TO DO ...
		boolean bool;
		try{
			documents.add(doc);
			bool = true;
			throw new RuntimeException("addDocument() not yet implemented");
			
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
			bool = false;
		}
		return bool;
	}
	
	/**
	 * Si doc est dans la liste des documents, alors l'y supprime et renvoie true;
	 * sinon renvoie false.
	 */
	public boolean removeDocument(Document doc) {
		// TO DO ...
		boolean bool;
		try{
			documents.remove(doc);
			bool = true;
			throw new RuntimeException("removeDocument() not yet implemented"); 
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
			bool = false;
		}
		return bool;
	
	}

	@Override
	public String toString() {
		return "Bibliotheque de " + documents.size() + " documents";
	}	
}
