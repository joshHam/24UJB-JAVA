package d0401JV3p47;

public class Main {

	public static void main(String[] args) {
//		Phone phone = new Phone("ȫ�浿");

		Phone phone2 = new SmartPhone("�Ӳ���");
		phone2.turnOn();
		phone2.turnOff();

		SmartPhone phone3 = new SmartPhone("ȫ�浿");
		phone3.turnOn();
		phone3.internetSearch();
		phone3.turnOff();
	}
}
