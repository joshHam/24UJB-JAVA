package d0325;

public class ArrayExample {

	public static void main(String[] args) {
		int[] scores = {83, 90,87};

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);


		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum +=scores[i];
		}


		System.out.println("sum : " + sum);
		double avg = (double) sum / 3;
//		double avg =  sum / 3;  //타입캐스팅 중요
		System.out.println("avg : " + avg);

		System.out.printf("avg : %.3f", avg);

	}

}
