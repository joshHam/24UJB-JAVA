package d0325;

public class AdvForExample {

	public static void main(String[] args) {
		int/*[]����͵���*/ scores[] = {9, 7, 8, 9, 8};
		
		int sum = 0;
//		for(int s : scores) {                   /*���� For��*/
//			sum += s;                          /*�ణ ����ȭ�Ǵ� ����*/
//		}
		
		
		
		for(int s = 0 ; s<5 ; s++) {             /*�Ϲ� For��*/
			sum += scores[s];     //scores[] ���Ծ�����
		}							// ¦���� ���ϴ� �� �̸� �������� s+2�� ���� �� ����
		
		
		System.out.println("sum : " + sum);
	

		
		
	}
}
