package ex3;



/**
 * @author Leila
 *
 */
public class Animal {
	
	/** Classe regroupant les informations communes sur les animaux
	 * type : Mammifere, poisson ou reptile
	 * nom : nom de l'animal
	 * comportement : carnivore ou herbivore
	 */
	protected String type;
	protected String nom;
	protected String comportement;
	
	public Animal(String type, String nom, String comportement) {
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getComportement() {
		return comportement;
	}

	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
	
	
	

}
