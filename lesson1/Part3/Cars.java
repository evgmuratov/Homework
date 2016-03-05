
public abstract class Cars extends EngineVehicles {
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

