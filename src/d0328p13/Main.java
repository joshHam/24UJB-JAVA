package d0328p13;

public class Main {   

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();//�żҵ� ������
		System.out.println("������ : " + computer.areaCircle(r));

	}

}
