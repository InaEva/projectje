/**
 * 
 */
package abstractFactory;

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


public interface BurgerIngredientFactory {

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createRegularBun();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createSesameBun();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createWholeWheatBun();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Patties createBeefPatty();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Patties createChickenPatty();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Patties createVeggiePatty();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Sauces createMayonaise();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Sauces createMustard();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Sauces createKetchup();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Toppings createLettuce();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Toppings createTomato();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Toppings createPickles();

}
