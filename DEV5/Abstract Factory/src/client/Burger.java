/**
 * 
 */
package client;

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
 * PatternBox: "Client" implementation.
 * <ul>
 *   <li>uses only interfaces declared by AbstractFactory and AbstractProduct classes.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author Home
 */
public class Burger {

	/** holds the factory instance */
	private final BurgerIngredientFactory fFactory;

	/** 
	 * This construtor creates a Client instance.
	 */
	public Burger(BurgerIngredientFactory factory) {
		super();
		fFactory = factory;
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useRegularBun() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createRegularBun();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useSesameBun() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createSesameBun();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useWholeWheatBun() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createWholeWheatBun();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useBeefPatty() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createBeefPatty();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useChickenPatty() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createChickenPatty();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useVeggiePatty() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createVeggiePatty();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useMayonaise() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createMayonaise();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useMustard() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createMustard();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useKetchup() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createKetchup();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useLettuce() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createLettuce();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void useTomato() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createTomato();
		product.doSomething();
	}

	/** 
	 * This is just an example how to use the Abstract Factory pattern. This
	 * operation must be customized based on your application needs.
	 */
	public void usePickles() {
		// TODO: Customize this method based on your application needs.
		final Buns product = fFactory.createPickles();
		product.doSomething();
	}

}
