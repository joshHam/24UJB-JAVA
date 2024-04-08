package d0402.JV3p72;

public class E {
	void method() {
		class F {
			F(){}
			int field1;			//인스턴스 필드
//			static int field2;	//정적 필드x
			void method1() {	//인스턴스 메소드
				System.out.println("class E - method() - class F - method()");
			}
			//static void method2(){}	//정적 메소드x
		}
		
		F f = new F();
		f.field1 = 7;
		System.out.println("f.field1 : " + f.field1);
		f.method1();
	}

}
