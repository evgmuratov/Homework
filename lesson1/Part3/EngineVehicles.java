public abstract class EngineVehicles extends Vehicles {
    String ftype; //fuel type
	int fcapasity; //fuel capasity
	int fconsumption; //fuel consumption
	
	void filltank() {} //fill fuel tank
		
	abstract void fix();
    abstract void startcheck();
}

