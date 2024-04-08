package d0322;

public class OperatorExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y; //오버플로우발생
		long lz1 = (long)x * (long)y; //롱타입으로 type casting
		long lz2 = (long)(x * y); // 곱하기가 연산우선순위
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);

	}

}
