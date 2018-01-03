package ex3;

import java.util.ArrayList;

public abstract class Zone {
	
	protected String nom;
	protected double coeff;
	protected ArrayList<Animal> animaux = new ArrayList<Animal>();
	

	
	public void ajouterAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.getNom());
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * coeff;
	}
	
	public abstract boolean verifZone(Animal animal);

}
