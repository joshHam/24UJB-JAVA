package SedanFactory;

import Component.Tire;

public class Sedan {
	public static void main(String[] args) {
		Tire compoTire = new Tire(); // 메소드1 ,인스턴스 생성. 생성자호출
		compoTire.setSize(19); 			// setsize메소드 호출

		System.out.println(compoTire.getSize()); // getsize메소드 호출xc 
	}
}
