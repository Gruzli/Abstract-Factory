package Main;

import Engine.Engine;
import Factory.AbstractFactory;
//import Factory.Factory;
import Vehicle.Vehicle;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		AbstractFactory factory = AbstractFactory.createFactory("truck");
		Vehicle vehicle = factory.createVehicle();
		Engine engine = factory.createEngine();
		
		vehicle.drive();
		engine.rev();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
