package csce247.assignments.state;
//noah snell
public class DeliveredState implements State {
	private Package pkg;
	/**
	 * sets this classes pkg to the incoming package
	 * @param pkg package being ordered
	 */
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * displays status as shown when delivered
	 */
	public void displayStatus() {
		System.out.println(pkg.getName()+" is here for you.");		
	}
	/**
	 * displays eta as shown when delivered
	 */
	public void displayETA() {
		System.out.println(pkg.getName()+" is here.");			
	}

}
