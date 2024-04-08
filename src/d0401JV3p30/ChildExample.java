package d0401JV3p30;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();

//			child.finalize(); //Deprecated Method Example
		parent.method1();
		parent.method2();
//		parent.method3(); //(부모클에서 자식메소드)호출 불가능

		child.method1(); // (자식클에서 부모메소드)호출 가능
		child.method2(); // 메소드 오버라이딩
		child.method3();
		
		System.out.println("---------------------------------------");
		
		
		parent = child;  //오버라이딩
		parent.method1();
		parent.method2();
		
		
		
		
		
		
		
		
		
		
		
	}

}
