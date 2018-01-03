package ex3;

import java.util.ArrayList;

/** Ici nous decrivont la zone de type ferme reptilienne, ou sont stockés les animaux de type reptile
 * Une fonction verifZone permet de vérifier si l'animal à ajouter est de type REPTILE
 * On définit également ici la valeur du coefficient pour la calcul de quantité de nourriture chez le reptile
 * @author Leila
 *
 */

public class FermeReptile extends Zone {
	
	public FermeReptile(){
		this.nom = "Ferme des reptiles";
		this.coeff = 0.1;
	}

		public boolean verifZone(Animal animal){
			if (animal.getType().equals("REPTILE")){
				this.animaux.add(animal);
				return true;
			}
			return false;
			
		}

}
