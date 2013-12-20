/**
 * 
 */
package abstractProduct.patties;

import abstractProduct.buns.Buns;

/**
 * PatternBox: "ConcreteProduct" implementation.
 * <ul>
 *   <li>defines a product object to be created by the corresponding concrete factory.</li>
 *   <li>implements the AbstractProduct interface.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author Home
 */
public class BeefPatty implements Buns, Patties {

	/** 
	 * This construtor creates a ConcreteProduct instance.
	 */
	public BeefPatty() {
		super();
	}

	@Override
	public void createBun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createPatty() {
		// TODO Auto-generated method stub
		
	}

}


