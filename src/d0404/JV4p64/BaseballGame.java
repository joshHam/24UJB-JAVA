package d0404.JV4p64;

import java.util.Random;
import java.util.Scanner;				//�����Ǯ��

public class BaseballGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] rnd = new int[3];
		
		//3.��ġ�¼��� ���Բ� ���ѷ����� üũ
		boolean b = false;
		do{
			b = false;
			for(int i =0;i<rnd.length;i++) {
				rnd[i]=random.nextInt(9)+1;
			}
			if(rnd[0]==rnd[1]||rnd[1]==rnd[2]||rnd[2]==rnd[0]) {
				b=true;
			}
		}while(b);
		
		
		
		
		//1.��������
		for(int i =0;i<rnd.length;i++) {
			rnd[i]=random.nextInt(8)+1;
		}
		//2.print
		for(int i =0;i<rnd.length;i++) {
			System.out.print(rnd[i]+" ");
		}
		
		
		//4.������Է�
		int[]inp = new int[3];
		boolean bGO = false;
		int stk;	int ball;//6.�ʱ�ȭ
		do {
			stk=0; ball=0; //6.�ʱ�ȭ
			bGO=true;//10.true����
			System.out.print("Input number... ");
			for(int i =0;i<inp.length;i++) {
				inp[i]=sc.nextInt();
			}
			//5.print
				for(int i =0;i<inp.length;i++) {
					System.out.print(inp[i]+" ");
				}
			//7.calc Strike
				for(int i =0;i<inp.length;i++) {
					if(rnd[i]==inp[i]) {
						stk++;
					}
				}
				//8.calc ball
				for(int i=0;i<rnd.length;i++) {
					for(int j =0;j<rnd.length;j++) {
						if(i!=j&&rnd[i]==inp[j]) {
							ball++;
						}
					}
				}
				
				
				//9.test print
				System.out.println("strike : "+stk+", ball : "+ball);
				
				
				//10.
				if(stk==3) {
					bGO = false;
				}
				
		}while(bGO);
		System.out.println("Winner Winner Chicken Dinner!");
		
	
		
		
		
		
	}

}

