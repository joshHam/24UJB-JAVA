package d0322;

public class OperatorExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y; //�����÷ο�߻�
		long lz1 = (long)x * (long)y; //��Ÿ������ type casting
		long lz2 = (long)(x * y); // ���ϱⰡ ����켱����
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);

	}

}
