package ex3;

import java.util.ArrayList;

/** Représentation d'un zoo avec ses différentes zones, ainsi qu'avec les animaux y habitant
 * @author Leila
 *
 */
public class Zoo {

	private String nom;
	private ArrayList<Zone> zones = new ArrayList<Zone>();
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		zones.add(new SavaneAfricaine());
		zones.add(new Aquarium());
		zones.add(new FermeReptile());
		zones.add(new ZoneCarnivore());
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
			Zone zones = iterZones.next();
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
