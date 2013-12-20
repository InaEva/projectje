/**
 * 
 */
package abstractProduct.toppings;

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
public class Lettuce implements Buns {

	/** 
	 * This construtor creates a ConcreteProduct instance.
	 */
	public Lettuce() {
		super();
	}

	/** 
	 * This is just a dummy method that can be called by the client. Replace
	 * this method by another one which you really need.
	 */
	public void doSomething() {
	}

}
