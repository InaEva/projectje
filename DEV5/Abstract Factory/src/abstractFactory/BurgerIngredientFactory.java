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
import abstractProduct.patties.VeggiePatty;
import abstractProduct.sauces.Ketchup;
import abstractProduct.sauces.Mayonaise;
import abstractProduct.sauces.Mustard;
import abstractProduct.toppings.Lettuce;
import abstractProduct.toppings.Pickles;
import abstractProduct.toppings.Tomato;

/**
 * PatternBox: "AbstractFactory" implementation.
 * <ul>
 *   <li>declares an interface for operations that create abstract product objects.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author Home
 */
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
	public Buns createBeefPatty();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createChickenPatty();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createVeggiePatty();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createMayonaise();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createMustard();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createKetchup();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createLettuce();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createTomato();

	/** 
	 * This method returns an instance of a AbstractProduct implementation
	 */
	public Buns createPickles();

}
