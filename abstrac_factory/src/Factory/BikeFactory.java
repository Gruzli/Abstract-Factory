package Factory;

import Engine.BikeEngine;
import Engine.Engine;
import Vehicle.Bike;
import Vehicle.Vehicle;

public class BikeFactory extends AbstractFactory{

	public BikeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Bike();
	}

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new BikeEngine();
	}

}
