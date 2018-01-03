package ex3;

/**
 * Cette classe contient le main et a pour but de créer un nouveau Zoo en y ajoutant des animaux
 * @author leila
 *
 */
public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.ajouterAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.ajouterAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.ajouterAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
		zoo.ajouterAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
		zoo.ajouterAnimal(new Animal("Requin blanc", "POISSON", "CARNIVORE"));
		zoo.ajouterAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
		zoo.ajouterAnimal(new Animal("Boa constrictor", "REPTILE", "CARNIVORE"));
		zoo.ajouterAnimal(new Animal("Python", "REPTILE", "CARNIVORE"));
	}

}
