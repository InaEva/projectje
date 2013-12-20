/**
 * 
 */
package Composite.Components;


public abstract class Component {

	/** 
	 * This method is the implementation of Component specific operation.
	 */
	public abstract void operation();

	/** 
	 * This method adds a new child (either Leaf or Composite) to the other children.
	 */
	public abstract void add(Component child) throws AbstractMethodError;

	/** 
	 * This method removes a child (either Leaf or Composite) from the children.
	 */
	public abstract void remove(Component child) throws AbstractMethodError;

	/** 
	 * This method returns a child (either Leaf or Composite) at a certain index.
	 */
	public abstract Component getChild(int index) throws AbstractMethodError;

}
