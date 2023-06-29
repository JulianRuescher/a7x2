package itemProcessor;

import sevenSome.*;
import thingy.*;



/**
 * A ItemProcessor processes Items.
 * 
 * @author		Julian Rüscher
 * @version		28.06.2023
 */
public interface ItemProcessor_I{
    /**
     * process Item and return SevenSome if present
     * 
     * @param	Item	item to Process
     * @return	SevenSome if present, else null
     */
    SevenSome<Item> process( Item item );
    
    /**
     * reset the Item Processor
     */
    void reset();
}//interface