package d0401JV3p32;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				car.tires[0] = new HankookTire("앞왼쪽", 15);  	//Car클래스 tire변수를 배열타입으로 바꿔줬으니
				break;											//여기서도 배열타입으로 변경해주었다
			case 2:
				System.out.println("앞오른쪽 HankookTire로 교체");
//				car.frontRightTire = new HankookTire("앞오른쪽", 13);
				car.tires[1] = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
//				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				car.tires[2] = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankookTire로 교체");
//				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				car.tires[3] = new HankookTire("뒤오른쪽", 17);    //이후에 switch-case문을 제거하고 
				break;											//반복문으로 바꾸기도 가능할것
			}
			System.out.println("--------------------------------");
		}

	}

}
