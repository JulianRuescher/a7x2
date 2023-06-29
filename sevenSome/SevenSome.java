package sevenSome;

import java.util.List;
import java.util.ArrayList;



/**
 * A SevenSome holds seven Elements of Type T.
 * 
 * @author		Julian Rüscher
 * @version		28.06.2023
 */
public class SevenSome<T> {
	final List<T> listOfSeven;
	
	
	/**
	 * The constructor SevenSome() initializes a new SevenSome.
	 */
    public SevenSome(){
    	listOfSeven = new ArrayList<T>();
    }//constructor
	
    
    
	/**
	 * The method add() adds an element to the SevenSome.
	 * 
	 * @param	T	element to add
	 * @return	true if added, false if SevenSome is full or SevenSome contains this element
	 */
	public boolean add( T element) {
		//check if SevenSOme is full
		if (isFull()) {return false;}
		//check if SevenSOme contains element already
		for (T elementOfSeven : listOfSeven) {
			if (elementOfSeven.equals(element)) {return false;}
		}//for
		//add element
		return listOfSeven.add(element);
	}//method
	
	
	//TODO Add an is full in One return true when full

	
	
	
	/**
	 * The method get() returns the element at given position.
	 * @param	position	position in SevenSome
	 * @return	element if position in range and element is present, else null
	 */
	public T get( int position) {
		//return null if position is out of range
		if (position >= listOfSeven.size() || position < 0) {return null;}
		//get and return element
		return listOfSeven.get(position);
	}//method
	
	/**
	 * The method isFull() checks if the SevenSome contains seven or more Elements.
	 * @return	true if full, else false
	 */
	public boolean isFull() {
		return (listOfSeven.size() >= 7) ? true : false;
	}//method
    
	
}//class
