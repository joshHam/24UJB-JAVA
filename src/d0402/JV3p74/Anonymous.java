package d0402.JV3p74;

public class Anonymous {
	// 멤버변수 field에 값 new Person()으로 초기화 //초기화하면서 바로 정의
	Person field = new Person() {
		void work() { // 초기화하면서 바로 정의
			System.out.println("출근합니다.");
		}

		void wake() {
			System.out.println("6시에 일어납니다.");
		}
	};

	void method1() {
		// 지역변수 lovarVar
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};

		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
