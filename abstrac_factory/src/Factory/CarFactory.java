package Factory;

import Engine.CarEngine;
import Engine.Engine;
import Vehicle.Car;
import Vehicle.Vehicle;

public class CarFactory extends AbstractFactory{

	public CarFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new CarEngine();
	}

}
