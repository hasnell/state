package csce247.assignments.state;
//noah snell
public class InTransitState implements State {
	private Package pkg;
	/**
	 * sets this classes pkg to the incoming package
	 * @param pkg package being ordered
	 */
	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * displays status as shown when in transit
	 */
	public void displayStatus() {
		System.out.println(pkg.getName()+" is out for delivery.");		
	}
	/**
	 * displays eta as shown when in transit
	 */
	public void displayETA() {
		System.out.println(pkg.getName()+" should arrive within 5 days.");			
	}

}
