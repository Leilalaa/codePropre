package ex3;

import java.util.ArrayList;

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
