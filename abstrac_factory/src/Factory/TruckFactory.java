package Factory;

import Engine.Engine;
import Engine.TruckEngine;
import Vehicle.Truck;
import Vehicle.Vehicle;

public class TruckFactory extends AbstractFactory{

	public TruckFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Truck();
	}

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new TruckEngine();
	}

}
