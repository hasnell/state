package csce247.assignments.state;
//noah snell
public class Package {
	private State orderedState, inTransitState, deliveredState, state;
	private String name;
	/**
	 * sets the name and all of the state variables
	 * @param name is the name of the product being ordered
	 */
	public Package(String name) {
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
		this.name = name;
		setState(orderedState);
	}
	/**
	 * sets the state to ordered and displays status and eta
	 */
	public void order() {
		setState(orderedState);
		state.displayStatus();
		state.displayETA();
	}
	/**
	 * sets the state to in transit and displays status and eta
	 */
	public void mail() {
		setState(inTransitState);
		state.displayStatus();
		state.displayETA();
	}
	/**
	 * sets the state to delivered and displays status
	 */
	public void received() {
		setState(deliveredState);
		state.displayStatus();
	}
	/**
	 * setter for state
	 * @param state the state of the package
	 */
	public void setState(State state) {
		this.state = state;
	}
	/**
	 * getter for name
	 * @return returns the name of the package
	 */
	public String getName() {
		return name;
	}
}
