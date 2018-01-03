package ex3;

import java.util.ArrayList;

/** Ici nous decrivont la zone de type ferme reptilienne, ou sont stock�s les animaux de type reptile
 * Une fonction verifZone permet de v�rifier si l'animal � ajouter est de type REPTILE
 * On d�finit �galement ici la valeur du coefficient pour la calcul de quantit� de nourriture chez le reptile
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
