package ex3;

import java.util.ArrayList;

public class ZoneCarnivore extends Zone {

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
		
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * qteNourriture;
	}
}
