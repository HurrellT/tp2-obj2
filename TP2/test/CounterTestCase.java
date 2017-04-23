/*
import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTestCase {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
*/

//package unq;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import unq.Counter;

public class CounterTestCase {   
    private Counter counter;    
    
    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        
        //Se crea el contador
        counter = new Counter();
        
        //Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {
        
        // Getting the even occurrences
            int amount = counter.getEvenOcurrences();
                
        // I check the amount is the expected one
            assertEquals(1, amount);
    }
    
    @Test
    public void testUnevenNumbers() {
        
        // Getting the uneven occurrences
            int amount = counter.getUnevenOcurrences();
                
        // I check the amount is the expected one
            assertEquals(9, amount);
    }
    
    @Test
    public void testMultiplesOcurrences() {
    	int amount = counter.getMultiplesOcurrences(3);
    			
    	assertEquals(2, amount);

    }
    
    @Test
    public void test1() {
    	int num = 22;
    	boolean res = num % 2 == 0;
    	int total = 0;
    			if (res) {
					total = total++;
				}
    	assertEquals(true, res);
    }
   

}