package factory;

public class CarFactory implements VehicleFactory {

	public CarFactory() {
	}

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

}
