package Factory;

import Engine.Engine;
import Vehicle.Vehicle;

public abstract class AbstractFactory {
	public abstract Vehicle createVehicle();
	public abstract Engine createEngine();
	
	public AbstractFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static AbstractFactory createFactory(String factoryType) {
		if(factoryType == "car") {
			return new CarFactory();
		} else if(factoryType == "truck") {
			return new TruckFactory();
		} else {
			return new BikeFactory();
		}
	}
}
