package d0402.JV3p72;

public class E {
	void method() {
		class F {
			F(){}
			int field1;			//�ν��Ͻ� �ʵ�
//			static int field2;	//���� �ʵ�x
			void method1() {	//�ν��Ͻ� �޼ҵ�
				System.out.println("class E - method() - class F - method()");
			}
			//static void method2(){}	//���� �޼ҵ�x
		}
		
		F f = new F();
		f.field1 = 7;
		System.out.println("f.field1 : " + f.field1);
		f.method1();
	}

}
