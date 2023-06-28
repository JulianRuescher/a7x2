package itemProcessor;

import sevenSome.*;
import thingy.*;


/**
 * Item Processor - see task
 * 
 * Process Items
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