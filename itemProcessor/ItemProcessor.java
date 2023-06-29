package itemProcessor;

import java.util.Map;
import java.util.HashMap;
import sevenSome.*;
import thingy.*;



/**
 * A ItemProcessor processes Items.
 * 
 * @author		Julian Rüscher
 * @version		28.06.2023
 */
public class ItemProcessor implements ItemProcessor_I {     
	final Map<Color,SevenSome<Item>> sevenSomeMap;

	/**
	 * The constructor ItemProcessor() initializes a new ItemProcessor.
	 */
    public ItemProcessor() {
    	sevenSomeMap = new HashMap<Color,SevenSome<Item>>();
    }//constructor
    
    
    
    /**
     * process Item and return SevenSome if present
     * 
     * @param	Item	item to Process
     * @return	SevenSome if present, else null
     */
    public SevenSome<Item> process(Item item) {
        //Check input parameters
		assert null != item : "card can't be null";
	    //get item color
		final Color itemColor = item.getColor();
        //if color not in sevenSomeMap put it in with an new sevenSome
		SevenSome<Item> sevenSome = sevenSomeMap.get(itemColor);
		if (sevenSome == null ) {
			sevenSome = new SevenSome<Item>();
			sevenSomeMap.put(itemColor, sevenSome);
		}//if
        //add item and return sevenSome if this is full
		return (sevenSome.addElement(item)) ? sevenSomeMap.remove(itemColor) : null;
	}//method
	
	/**
     * The method reset() clears the ItemProcessor
     */
	public void reset() {
		sevenSomeMap.clear();
	}//method
    
    
}//class