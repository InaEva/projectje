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
import abstractProduct.patties.Patties;
import abstractProduct.patties.VeggiePatty;
import abstractProduct.sauces.Ketchup;
import abstractProduct.sauces.Mayonaise;
import abstractProduct.sauces.Mustard;
import abstractProduct.sauces.Sauces;
import abstractProduct.toppings.Lettuce;
import abstractProduct.toppings.Pickles;
import abstractProduct.toppings.Tomato;
import abstractProduct.toppings.Toppings;


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
	public Patties createBeefPatty() {
		return new BeefPatty();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Patties createChickenPatty() {
		return new ChickenPatty();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Patties createVeggiePatty() {
		return new VeggiePatty();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Sauces createMayonaise() {
		return new Mayonaise();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Sauces createMustard() {
		return new Mustard();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Sauces createKetchup() {
		return new Ketchup();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Toppings createLettuce() {
		return new Lettuce();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Toppings createTomato() {
		return new Tomato();
	}

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Toppings createPickles() {
		return new Pickles();
	}

}
