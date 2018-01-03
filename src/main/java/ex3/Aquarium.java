package ex3;

import java.util.ArrayList;

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
