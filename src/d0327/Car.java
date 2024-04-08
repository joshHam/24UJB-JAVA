package d0327;

public class Car {
	
	String model;    //멤버변수1
	int speed;			//멤버변수2
	
	Car(String model) {        //  생성자   &  메소드1
		this.model = model;
	}
	
	void setSpeed(int speed) {    // 메소드2
		this.speed = speed;
	}
	
	void run() {                     //메소드3
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		}
	}


	public static void main(String[] args) {        //메소드4-메인
		Car car1 = new Car("Hyundai");
		Car car2 = new Car("BMW");
		
		
		car1.run();
		car2.run();
	}

}
