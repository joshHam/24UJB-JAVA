package d0325;

public class AdvForExample {

	public static void main(String[] args) {
		int/*[]여기와도됨*/ scores[] = {9, 7, 8, 9, 8};
		
		int sum = 0;
//		for(int s : scores) {                   /*향상된 For문*/
//			sum += s;                          /*약간 간소화되는 장점*/
//		}
		
		
		
		for(int s = 0 ; s<5 ; s++) {             /*일반 For문*/
			sum += scores[s];     //scores[] 뺴먹었었음
		}							// 짝수를 더하는 값 이면 증감식을 s+2로 해줄 수 있음
		
		
		System.out.println("sum : " + sum);
	

		
		
	}
}
