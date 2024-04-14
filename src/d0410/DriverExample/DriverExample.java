package d0410.DriverExample;

public class DriverExample {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();

		// 매개값으로 (클래스 타입의)Bus 객체를 제공하고 driver()메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);// (10-11) driver.drive(new Bus());와 동일

		driver.drive(new Taxi()); // (15-17)와 동일  

//매개값으로 (클래스 타입의)Taxi 객체를 제공하고 driver()메소드 호출 
//		Taxi taxi = new Taxi();
//		driver.drive(taxi);
	}

}
