package d0325;

public class ForSumExample {

	public static void main(String[] args) {
		int s = 0;                         //s = sum의변수명 이름바꿔도 상관없다
		for(int i=1;i<=100;i++) {
			s += i;                        //   A+=B     B의합계를 A에 대입한다
			
		}
		
		System.out.println("sum = " + s);

	}

}
