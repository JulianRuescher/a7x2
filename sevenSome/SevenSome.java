package sevenSome;

import java.util.List;
import java.util.ArrayList;

/**
 * Item Processor - see task
 * 
 * Process Items
 */
public class SevenSome<T> {
	final List<T> setOfSeven;
	
    public SevenSome(){
    	setOfSeven = new ArrayList<T>();
    }//constructor
	
    
    
	public boolean add( T element) {
		return setOfSeven.add(element);
	}//method
    
	public T get( int positon) {
		return setOfSeven.get(positon);
	}//method
    
}//class
