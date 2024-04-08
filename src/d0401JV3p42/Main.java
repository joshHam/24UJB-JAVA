package d0401JV3p42;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		if(parent instanceof Parent) { 
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(parent instanceof Child) { //인스턴스 parent가 Child타입으로
			System.out.println("true");//타입 캐스팅을 할 수 있는지 여부?
		}else {
			System.out.println("false");
		}
		
		if(child instanceof Parent) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(child instanceof Child) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
		

	}

}
