package ex3;

import java.util.ArrayList;

/** Ici nous decrivont la zone des animaux carnivores, ou sont stockés les mammifères carnivores
 * Une fonction verifZone permet de vérifier si l'animal à ajouter est de type MAMMIFERE ET CARNIVORE
 * On définit également ici la valeur du coefficient pour la calcul de quantité de nourriture chez le carnivore
 * @author Leila
 *
 */
public class ZoneCarnivore extends Zone {

	public ZoneCarnivore(){
		this.nom = "Zone Carnivore";
		this.coeff = 10;
	}

		public boolean verifZone(Animal animal){
			if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")){
				this.animaux.add(animal);
				return true;
			}
		return false;	
		
		}
	
}
