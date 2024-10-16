package factory;

public interface VehicleFactory {
	public static VehicleFactory createVehicleFactory(String vehicleType) {
		if (vehicleType == null | vehicleType == "") {
			return null;
		}
		switch (vehicleType.toLowerCase()) {
		case "car":
			return new CarFactory();
		case "bike":
			return new BikeFactory();
		case "truck":
			return new TruckFactory();
		default: 
			throw new IllegalArgumentException("unknown Vehicle Type: " + vehicleType);
		}
	}
	
	public Vehicle createVehicle();
}
