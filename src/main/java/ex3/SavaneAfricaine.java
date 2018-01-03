package ex3;

import java.util.ArrayList;

/** Ici nous decrivont la zone savane africaine, ou sont stock�s les mammif�res v�g�tariens
 * Une fonction verifZone permet de v�rifier si l'animal � ajouter est de type MAMMIFERE ET HERBIVORE
 * On d�finit �galement ici la valeur du coefficient pour la calcul de quantit� de nourriture chez l'herbivore
 * @author Leila
 *
 */

public class SavaneAfricaine extends Zone {

	public SavaneAfricaine(){
		this.nom = "Savane Africaine";
		this.coeff = 0.2;
	}
	
	public boolean verifZone(Animal animal){
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")){
			this.animaux.add(animal);
			return true;
		}
	return false;	
	
	}	

}
