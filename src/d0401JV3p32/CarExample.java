package d0401JV3p32;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
//				car.frontLeftTire = new HankookTire("�տ���", 15);
				car.tires[0] = new HankookTire("�տ���", 15);  	//CarŬ���� tire������ �迭Ÿ������ �ٲ�������
				break;											//���⼭�� �迭Ÿ������ �������־���
			case 2:
				System.out.println("�տ����� HankookTire�� ��ü");
//				car.frontRightTire = new HankookTire("�տ�����", 13);
				car.tires[1] = new HankookTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
//				car.backLeftTire = new HankookTire("�ڿ���", 14);
				car.tires[2] = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� HankookTire�� ��ü");
//				car.backRightTire = new HankookTire("�ڿ�����", 17);
				car.tires[3] = new HankookTire("�ڿ�����", 17);    //���Ŀ� switch-case���� �����ϰ� 
				break;											//�ݺ������� �ٲٱ⵵ �����Ұ�
			}
			System.out.println("--------------------------------");
		}

	}

}
