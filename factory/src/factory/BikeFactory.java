package factory;

public class BikeFactory implements VehicleFactory {

	public BikeFactory() {
	
	}

	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}

}
