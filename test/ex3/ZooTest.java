package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	@Test
	public void ajouterAnimal(Animal animal){
		boolean animalAdmis = false;
		Iterator<Zone> iterZones = Zone.values().iterator();
		
		while (iterZones.hasNext() && !animalAdmis){
			Zone zone = iterZones.next();
			animalAdmis = zone.verifZone(animal);
		}
	}

}
