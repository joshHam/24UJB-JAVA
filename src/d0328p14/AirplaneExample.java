package d0328p14;

public class AirplaneExample {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPER;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
		

	}

}
