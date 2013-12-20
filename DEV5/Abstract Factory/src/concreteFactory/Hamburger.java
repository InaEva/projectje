/**
 * 
 */
package concreteFactory;

import abstractFactory.BurgerIngredientFactory;
import abstractProduct.buns.Buns;
import abstractProduct.buns.RegularBun;
import abstractProduct.buns.SesameBun;
import abstractProduct.buns.WholeWheatBun;
import abstractProduct.patties.BeefPatty;
import abstractProduct.patties.ChickenPatty;
import abstractProduct.patties.VeggiePatty;
import abstractProduct.sauces.Ketchup;
import abstractProduct.sauces.Mayonaise;
import abstractProduct.sauces.Mustard;
import abstractProduct.toppings.Lettuce;
import abstractProduct.toppings.Pickles;
import abstractProduct.toppings.Tomato;

/**
 * PatternBox: "ConcreteFactory" implementation.
 * <ul>
 *   <li>implements the operations to create concrete product objects.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author Home
 */
public class Hamburger implements BurgerIngredientFactory {

	/** 
	 * This construtor creates a ConcreteFactory instance.
	 */
	public Hamburger() {
		super();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createRegularBun() {
		return new RegularBun();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createSesameBun() {
		return new SesameBun();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createWholeWheatBun() {
		return new WholeWheatBun();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createBeefPatty() {
		return new BeefPatty();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createChickenPatty() {
		return new ChickenPatty();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createVeggiePatty() {
		return new VeggiePatty();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createMayonaise() {
		return new Mayonaise();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createMustard() {
		return new Mustard();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createKetchup() {
		return new Ketchup();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createLettuce() {
		return new Lettuce();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createTomato() {
		return new Tomato();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createPickles() {
		return new Pickles();
	}

}
