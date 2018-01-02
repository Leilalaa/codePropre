package ex3;

import java.util.ArrayList;

public class SavaneAfricaine extends Zone {
	
	private ArrayList<Animal> animaux;
	private static double qteNourriture = 10;
	
	public void addAnimal(Animal animal) {
			animaux.add(animal);
		}
		
		public void afficherListeAnimaux(){
			for (Animal animal: animaux){
				System.out.println(animal.getNom());
			}
		}
		

	public int compterAnimaux(){
		return animaux.size();
	}
	

	public double calculerKgsNourritureParJour(){
		return animaux.size() * qteNourriture;
	}
}
