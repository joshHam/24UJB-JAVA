package d0401JV3p30;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();

//			child.finalize(); //Deprecated Method Example
		parent.method1();
		parent.method2();
//		parent.method3(); //(�θ�Ŭ���� �ڽĸ޼ҵ�)ȣ�� �Ұ���

		child.method1(); // (�ڽ�Ŭ���� �θ�޼ҵ�)ȣ�� ����
		child.method2(); // �޼ҵ� �������̵�
		child.method3();
		
		System.out.println("---------------------------------------");
		
		
		parent = child;  //�������̵�
		parent.method1();
		parent.method2();
		
		
		
		
		
		
		
		
		
		
		
	}

}
