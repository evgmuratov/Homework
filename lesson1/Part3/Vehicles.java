abstract class Vehicles {
    int wheels;
	String color;
	int speed; //top speed
	
    void driveStright(int newSpeed) 
					{speed=newSpeed}
	void paint(String newColor)
					{color=newColor}
				
    abstract void fix();
    abstract void startcheck(); //check readines
}

abstract class EngineVehicles extends Vehicles {
    String ftype; //fuel type
	int fcapasity; //fuel capasity
	int fconsumption; //fuel consumption
	
	void filltank() {} //fill fuel tank
		
	abstract void fix();
    abstract void startcheck();
}


abstract class Cars extends EngineVehicles {
    String interior;
	int doors;
	String hoodm; //hood material
	String trunko; //trunk opening mechanism
	
	void park() {}
	void opendoor() {}
	void fillt() {} //storage in trunk
		
	abstract void fix();
    abstract void startcheck();
}


class ManualTransmissionCars extends Cars {
    String ttype; //transmission type
	int qgears; //gears quantity
	String leversit; //gear lever situation
		
	void drift() {}
	void pushclutch() {} //use clutch
	void switchgearm() {} //on moving gear switch
	void fix();
    void startcheck();		
}