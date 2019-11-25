package csce247.assignments.state;
//noah snell
public class OrderedState implements State {
	private Package pkg;
	/**
	 * sets this classes pkg to the incoming package
	 * @param pkg package being ordered
	 */
	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * displays status as shown when ordered
	 */
	public void displayStatus() {
		System.out.println(pkg.getName()+" was ordered.");		
	}
	/**
	 * displays eta as shown when ordered
	 */
	public void displayETA() {
		System.out.println(pkg.getName()+" should arrive in 5 to 7 business days.");			
	}

}
