package factory;

public class Main {

	public Main() {
		VehicleFactory carFactory = VehicleFactory.createVehicleFactory("car");
		Vehicle car = carFactory.createVehicle();
		car.drive();
		
		VehicleFactory truckFactory = VehicleFactory.createVehicleFactory("truck");
		Vehicle truck = truckFactory.createVehicle();
		truck.drive();
		
		VehicleFactory bikeFactory = VehicleFactory.createVehicleFactory("bike");
		Vehicle bike = bikeFactory.createVehicle();
		bike.drive();
	}

	public static void main(String[] args) {
		new Main();
	}

}
