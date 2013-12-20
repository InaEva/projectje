/**
 * 
 */
package client;

import Composite.Components.Component;
import Composite.Composites.Composite;
import Composite.leafs.Leaf;

/**
 * PatternBox: "Client" implementation.
 * <ul>
 *   <li>manipulates objects in the composition through the Component interface.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author Home
 */
public class ClientCompositeBurger {

	/** stores the Command instance of the Invoker */
	private Component fComponent = null;

	/** 
	 * Default construtor
	 */
	public ClientCompositeBurger() {
		super();
	}

	/** 
	 * This construtor overloads the default constructor. An instance
	 * of Component is delivered as parameter.
	 */
	public ClientCompositeBurger(Component component) {
		super();
		fComponent = component;
	}

	/** 
	 * This method shows an example how to create a simple composite hierarchy.
	 */
	public void createComposite() {
		fComponent = new Composite();

		Composite composite = new Composite();
		composite.add(new Leaf());
		composite.add(new Leaf());

		fComponent.add(composite);
		fComponent.add(new Leaf());
	}

	/** 
	 * This method invokes the specific Component operation.
	 */
	public void useComposite() {
		fComponent.operation();
	}

}
