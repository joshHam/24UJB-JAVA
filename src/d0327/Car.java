package d0327;

public class Car {
	
	String model;    //�������1
	int speed;			//�������2
	
	Car(String model) {        //  ������   &  �޼ҵ�1
		this.model = model;
	}
	
	void setSpeed(int speed) {    // �޼ҵ�2
		this.speed = speed;
	}
	
	void run() {                     //�޼ҵ�3
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�. (�ü� : " + this.speed + "km/h)");
		}
	}


	public static void main(String[] args) {        //�޼ҵ�4-����
		Car car1 = new Car("Hyundai");
		Car car2 = new Car("BMW");
		
		
		car1.run();
		car2.run();
	}

}
