package d0402.JV3p74;

public class Anonymous {
	// ������� field�� �� new Person()���� �ʱ�ȭ //�ʱ�ȭ�ϸ鼭 �ٷ� ����
	Person field = new Person() {
		void work() { // �ʱ�ȭ�ϸ鼭 �ٷ� ����
			System.out.println("����մϴ�.");
		}

		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
		}
	};

	void method1() {
		// �������� lovarVar
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};

		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
