import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import unq.Multioperador;

public class MultioperadorTest {

	private Multioperador numbers;
	
	@Before
	public void setUp() throws Exception {
		
		numbers = new Multioperador();
		
		numbers.addNumber(6);
		numbers.addNumber(2);
		
	}
	
	@Test
	public void testSum() {
		int amount = numbers.sumNumbers();
	
	assertEquals(8, amount);
	}
	
	@Test
	public void testRest() {
		int amount = numbers.restNumbers();
		
	assertEquals(4, amount);
	}
	
	@Test
	public void testProd() {
		int amount = numbers.multiplyNumbers();
		
	assertEquals(12, amount);
	}

}
