package d0402.JV3p84;

public class TryCatchFinallyExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];

			System.out.println(data1);
			System.out.println(data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRunTimeExceptionExample num1 num2");
		}

	}

}