package d0328p25;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-20);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(40);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("����ӵ� : " + myCar.getSpeed());
	}

}
