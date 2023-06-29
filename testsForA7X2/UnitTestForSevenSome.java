package testsForA7X2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import itemProcessor.*;
import sevenSome.*;
import thingy.*;


class UnitTestForSevenSome {
	
	@Test
	void testConstructor() {		
		final SevenSome<Integer> sevenSome = new SevenSome<Integer>();
		
		assertNotNull(sevenSome);
	}//test

	@Test
	void testAddElement() {
		final SevenSome<Integer> sevenSome = new SevenSome<Integer>();
		
		for (int i=0;i<=6;i++) {
			boolean returnOffAdd = sevenSome.addElement(i);
			if (i!=6) {
				assertFalse(returnOffAdd);
			} else {
				assertTrue(returnOffAdd);
			}//if
		}//for
	}//test
	
	@Test
	void testGet() {		
		final SevenSome<Integer> sevenSome = new SevenSome<Integer>();
		
		for (int i=0;i<=3;i++) {
			sevenSome.addElement(i);
		}//for

		assertEquals(0, sevenSome.get(0));
		assertEquals(1, sevenSome.get(1));
		assertEquals(2, sevenSome.get(2));
	}//test
	
	
}//class