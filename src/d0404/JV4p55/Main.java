package d0404.JV4p55;

public class Main {

	public static void main(String[] args) {
		// �ڵ� Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		// ���� �� �ڵ� Unboxing
		int value = obj;
		System.out.println("value : " + value);

		// ���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
