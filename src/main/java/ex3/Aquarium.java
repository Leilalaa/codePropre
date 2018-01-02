package ex3;

import java.util.ArrayList;

public class Aquarium extends Zone {
	
	private ArrayList<Animal> listeAquarium;
	private static double coeff = 0.2;

	
	public double calculerKgsNourritureParJour(){
		return listeAquarium.size() * coeff;
	}
}
