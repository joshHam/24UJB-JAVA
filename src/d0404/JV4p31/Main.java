package d0404.JV4p31;

public class Main {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 111, 32, 74, 97, 118, 97 };//�ƽ�Ű�ڵ�

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 5, 4);//5��°index�������� 4���ǰ�
		System.out.println(str2);

		System.out.printf("%c", 65);
		System.out.printf("%c", 97);

	}

}
