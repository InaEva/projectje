/**
 * 
 */
package Composite.Composites;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Composite.Components.Component;


public class Composite extends Component {

	/** Collection of children in the Composite hierachy */
	private final List<Component> fChildren = new ArrayList<Component>();

	/** 
	 * This method iterates of all Component children specific operations.
	 */
	public void operation() {
		Iterator<Component> iterator = fChildren.iterator();
		while (iterator.hasNext()) {
			((Component) iterator.next()).operation();
		} // while
	}

	/** 
	 * This method adds a new child (either Leaf or Composite) to the other children.
	 */
	public void add(Component child) throws AbstractMethodError {
		fChildren.add(child);
	}

	/** 
	 * This method removes a child (either Leaf or Composite) from the children.
	 */
	public void remove(Component child) throws AbstractMethodError {
		fChildren.remove(child);
	}

	/** 
	 * This method returns a child (either Leaf or Composite) at a certain index.
	 */
	public Component getChild(int index) throws AbstractMethodError {
		return (Component) fChildren.get(index);
	}

}
