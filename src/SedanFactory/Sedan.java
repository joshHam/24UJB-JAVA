package SedanFactory;

import Component.Tire;

public class Sedan {
	public static void main(String[] args) {
		Tire compoTire = new Tire(); // �޼ҵ�1 ,�ν��Ͻ� ����. ������ȣ��
		compoTire.setSize(19); 			// setsize�޼ҵ� ȣ��

		System.out.println(compoTire.getSize()); // getsize�޼ҵ� ȣ��xc 
	}
}
