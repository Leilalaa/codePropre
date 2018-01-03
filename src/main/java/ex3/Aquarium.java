package ex3;

import java.util.ArrayList;

/** Ici nous decrivont la zone de type aquarium, ou sont stock�s les animaux de type poisson
 * Une fonction verifZone permet de v�rifier si l'animal � ajouter est de type POISSON
 * On d�finit �galement ici la valeur du coefficient pour la calcul de quantit� de nourriture chez le poisson
 * @author Leila
 *
 */

public class Aquarium extends Zone {
	
	public Aquarium(){
		this.nom = "Aquarium";
		this.coeff = 0.2;
	}

	public boolean verifZone(Animal animal){
		if (animal.getType().equals("POISSON")){
			this.animaux.add(animal);
			return true;
		}
		return false;
		
	}
	

}
