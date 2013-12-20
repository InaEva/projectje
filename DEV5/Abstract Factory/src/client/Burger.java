/**
 * 
 */
package client;

import abstractFactory.BurgerIngredientFactory;
import abstractProduct.buns.Buns;
import abstractProduct.patties.Patties;
import abstractProduct.sauces.Sauces;
import abstractProduct.toppings.Toppings;
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


public class Burger {

	/** holds the factory instance */
	private final BurgerIngredientFactory fFactory;

	
	public Burger(BurgerIngredientFactory factory) {
		super();
		fFactory = factory;
		
		
	}

	
	public void useRegularBun() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createRegularBun();
		product.createBun();
	}

	
	public void useSesameBun() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createSesameBun();
		product.createBun();
	}

	
	public void useWholeWheatBun() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createWholeWheatBun();
		product.createBun();
	}

	
	public void useBeefPatty() {
		// TODO: Customize this method based on your application needs.
		final Patties product = fFactory.createBeefPatty();
		product.createPatty();
	}

	
	public void useChickenPatty() {
		// TODO: Customize this method based on your application needs.
		final Patties product = fFactory.createChickenPatty();
		product.createPatty();
	}

	
	public void useVeggiePatty() {
		// TODO: Customize this method based on your application needs.
		final Patties product = fFactory.createVeggiePatty();
		product.createPatty();
	}

	
	public void useMayonaise() {
		// TODO: Customize this method based on your application needs.
		final Sauces product = fFactory.createMayonaise();
		product.createSauce();
	}

	
	public void useMustard() {
		// TODO: Customize this method based on your application needs.
		final Sauces product = fFactory.createMustard();
		product.createSauce();
	}

	
	public void useKetchup() {
		// TODO: Customize this method based on your application needs.
		final Sauces product = fFactory.createKetchup();
		product.createSauce();
	}

	public void useLettuce() {
		// TODO: Customize this method based on your application needs.
		final Toppings product = fFactory.createLettuce();
		product.createTopping();
	}

	
	public void useTomato() {
		// TODO: Customize this method based on your application needs.
		final Toppings product = fFactory.createTomato();
		product.createTopping();
	}

	 
	 
	public void usePickles() {
		// TODO: Customize this method based on your application needs.
		final Toppings product = fFactory.createPickles();
		product.createTopping();
	}

}
