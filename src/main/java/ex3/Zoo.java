package ex3;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/** Fonction permettant d'ajouter un animal au zoo, en allant tester dans chaque zone si l'animal a les conditions pour y être admis jusqu'à ce qu'il trouve la zone adequate
	 * @param animal est l'animal que l'on souhaite ajouter
	 * @param animalAdmis est un boolean qui prend la valeur true une fois que la bonne zone est trouvée, afin d'arrêter de parcourir la liste
	 * @param iterZones est un iterateur parcourant la liste de zones pour pouvoir utiliser la fonction de test verifZone dans chaque zone
	 */
	public void ajouterAnimal(Animal animal){
		boolean animalAdmis = false;
		Iterator<Zone> iterZones = Zone.values().iterator();
		
		while (iterZones.hasNext() && !animalAdmis){
			Zone zone = iterZones.next();
			animalAdmis = zone.verifZone(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
