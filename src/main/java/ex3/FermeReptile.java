package ex3;

import java.util.ArrayList;

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
