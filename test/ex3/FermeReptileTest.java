package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FermeReptileTest {

	@Test

	public void testVerifZone(){
		FermeReptile ferme = new FermeReptile();
		Animal a = new Animal("Gazelle", "MAMMIFERE", "HERBIVORE");
		boolean result = ferme.verifZone(a);
		assertFalse(result);
		
	}
}
