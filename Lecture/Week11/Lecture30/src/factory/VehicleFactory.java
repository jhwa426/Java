package factory;

public class VehicleFactory {
	public static Vehicle createVehicle(int option) {
		Vehicle vehicle = null;
		switch(option) {
		case 1:
			vehicle = new Car();
			break;
		case 2:
			vehicle = new Bus();
			break;
		}
		return vehicle;
	}
}
