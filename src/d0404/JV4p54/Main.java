package d0404.JV4p54;

public class Main {

	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer.valueOf("300");
		Integer obj4 = 100;   //기본자료형을 넣는것이 가능하다
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2= obj2.intValue();
		int value3 = obj3.intValue();
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
