package d0328p13;

public class Main {   

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();//매소드 재정의
		System.out.println("원면적 : " + computer.areaCircle(r));

	}

}
