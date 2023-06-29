package testsForA7X2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import itemProcessor.*;
import sevenSome.*;
import thingy.*;


class UnitTestForItemProcessor {
	
	@Test
	void testConstructor() {		
		final ItemProcessor itemProcessor = new ItemProcessor();
		
		assertNotNull(itemProcessor);
	}//test

	@Test
	void testReset() {
		final ItemProcessor itemProcessor = new ItemProcessor();
		
		for (int i=0;i<=10;i++) {
			SevenSome<Item> returnedSevenSome = itemProcessor.process(new Item(Color.RED, Size.TINY, Weight.LIGHT, (long)i));
			assertNull(returnedSevenSome);
			itemProcessor.reset();
		}//for
	}//test
	
	@Test
	void testProcess() {		
		final ItemProcessor itemProcessor = new ItemProcessor();
		
		for (int i=0;i<=5;i++) {
			itemProcessor.process(new Item(Color.RED, Size.TINY, Weight.LIGHT, (long)i));
		}//for
		SevenSome<Item> returnedSevenSome = itemProcessor.process(new Item(Color.RED, Size.TINY, Weight.LIGHT, 6L));
		assertNotNull(returnedSevenSome);
	}//test
	
	
}//class