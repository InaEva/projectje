/**
 * 
 */
package Composite.leafs;

import Composite.Components.Component;

/**
 * PatternBox: "Leaf" implementation.
 * <ul>
 *   <li>represents leaf objects in the composition. A leaf has no children.</li>
 *   <li>defines behavior for primitive objects in the composition.</li>
 * </ul>
 */
public class Leaf extends Component {

	/** Error message constant */
	private static final String ERROR_MSG = "This method should never be called.";

	/** 
	 * This method is the implementation of Leaf specific operation.
	 */
	public void operation() {
		// TODO Write your specific operation code here ...
	}

	/** 
	 * This method should never be called, otherwise an AbstractMethodError
	 * will be thrown.
	 */
	public void add(Component child) throws AbstractMethodError {
		throw new AbstractMethodError(ERROR_MSG);
	}

	/** 
	 * This method should never be called, otherwise an AbstractMethodError
	 * will be thrown.
	 */
	public void remove(Component child) throws AbstractMethodError {
		throw new AbstractMethodError(ERROR_MSG);
	}

	/** 
	 * This method should never be called, otherwise an AbstractMethodError
	 * will be thrown.
	 */
	public Component getChild(int index) throws AbstractMethodError {
		throw new AbstractMethodError(ERROR_MSG);
	}

}
