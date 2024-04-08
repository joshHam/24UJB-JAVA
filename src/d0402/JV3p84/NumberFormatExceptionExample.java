package d0402.JV3p84;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);// 인티저타입캐스팅 알파벳a때문에 안됨
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
