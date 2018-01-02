package ex3;

import java.util.ArrayList;

public abstract class Zone {
	
	private String nom;
	private double qteNourriture;
	
	private ArrayList<Animal> animaux = new ArrayList<Animal>();
	
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
