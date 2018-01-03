package ex3;

import java.util.ArrayList;

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
