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
	 * The method addElement() adds an element to the SevenSome.
	 * 
	 * @param	T	element to add
	 * @return	true if sevenSome if full, else false
	 */
	public boolean addElement( T element) {
		//check parameters
		assert listOfSeven.size() < 7 : "sevenSome is already full";
		assert element != null : "element cant be null";
//		//check if SevenSOme contains element already
//		for (T elementOfSeven : listOfSeven) {
//			if (elementOfSeven.equals(element)) {return false;}
//		}//for
		//add element
		listOfSeven.add(element);
		return (listOfSeven.size() >= 7) ? true : false;
	}//method

	
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
	
	
}//class