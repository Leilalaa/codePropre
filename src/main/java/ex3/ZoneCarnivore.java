package ex3;

import java.util.ArrayList;

/** Ici nous decrivont la zone des animaux carnivores, ou sont stock�s les mammif�res carnivores
 * Une fonction verifZone permet de v�rifier si l'animal � ajouter est de type MAMMIFERE ET CARNIVORE
 * On d�finit �galement ici la valeur du coefficient pour la calcul de quantit� de nourriture chez le carnivore
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
