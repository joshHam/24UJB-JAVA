package d0404.JV4p64;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;		//»¹Áþ//»¹Áþ//»¹Áþ//»¹Áþ//»¹Áþ//»¹Áþ//»¹Áþ//»¹Áþ					//»¹Áþ

public class BaseballGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] selectNumber = new int[3];

		// ³­¼ö»ý¼º
		Random random = new Random();
		int[] winningNumber = new int[3];
		random = new Random(3);
		for (int i = 0; i < 3; i++) {
			winningNumber[i] = random.nextInt(9) + 1;
		}
		Arrays.sort(winningNumber);

		// Arrays.sort(winningNumber);

//	      
//	      print
		for (int i = 0; i < winningNumber.length; i++) {
	         System.out.print(winningNumber[i] + " ");

		}

		System.out.println("Input number¡¦");

		while (true) { // Áßº¹µÇÁö ¾Ê´Â ³­¼ö¹ß»ý
			for (int i = 0; i < selectNumber.length; i++) {
				selectNumber[i] = sc.nextInt();
			}

			if (selectNumber[0] == winningNumber[0]) {
				if (selectNumber[1] == winningNumber[1]) {
					if (selectNumber[2] == winningNumber[2]) {
						System.out.println("strike : 3, ball : 0");
						System.out.println("Game Over!!");
						break;
					} else {
						System.out.println("strike : 2, ball : 0");
						System.out.println("Input number¡¦");
					}
				} else if (selectNumber[1] == winningNumber[0]) {
					if (selectNumber[0] == winningNumber[2]) {
						System.out.println("strike : 1, ball : 2");
						System.out.println("Input number¡¦");
					} else {
						System.out.println("strike : 1, ball : 1");
						System.out.println("Input number¡¦");
					}
				} else if (selectNumber[1] == winningNumber[2]) {
					if (selectNumber[0] == winningNumber[2]) {
						System.out.println("strike : 1, ball : 2");
						System.out.println("Input number¡¦");
					} else {
						System.out.println("strike : 1, ball : 1");
						System.out.println("Input number¡¦");
					}
				} else {
					if (selectNumber[0] == winningNumber[2]) {
						System.out.println("strike : 1, ball : 1");
						System.out.println("Input number¡¦");
					} else {
						System.out.println("strike : 1, ball : 0");
						System.out.println("Input number¡¦");
					}
				}
			} else if (selectNumber[1] == winningNumber[1]) {
				if (selectNumber[2] == winningNumber[2]) {
					System.out.println("strike : 2, ball : 0");
					System.out.println("Input number¡¦");
				} else if (selectNumber[2] == winningNumber[0]) {
					System.out.println("strike : 1, ball : 1");
					System.out.println("Input number¡¦");
				} else {
					System.out.println("strike : 1, ball : 0");
					System.out.println("Input number¡¦");
				}
			} else if (selectNumber[2] == winningNumber[2]) {
				if (selectNumber[1] == winningNumber[0]) {
					System.out.println("strike : 1, ball : 1");
					System.out.println("Input number¡¦");
				} else {
					System.out.println("strike : 1, ball : 0");
					System.out.println("Input number¡¦");
				}
			} else if (selectNumber[0] == winningNumber[1]) {
				if (selectNumber[1] == winningNumber[2]) {
					if(selectNumber[2] == winningNumber[0]) {
						System.out.println("strike : 0 , ball : 3");
						System.out.println("Input number¡¦");
					}else {
					System.out.println("strike : 0 , ball : 2");
					System.out.println("Input number¡¦");
					}
				} else {
					System.out.println("strike : 0 , ball : 1");
					System.out.println("Input number¡¦");
				}
			} else if (selectNumber[0] == winningNumber[2]) {
				if (selectNumber[1] == winningNumber[0]) {
					if(selectNumber[2] == winningNumber[1]) {
						System.out.println("strike : 0 , ball : 3");
						System.out.println("Input number¡¦");
					}else {
					System.out.println("strike : 0 , ball : 2");
					System.out.println("Input number¡¦");
					}
				} else {
					System.out.println("strike : 0 , ball : 1");
					System.out.println("Input number¡¦");
				}

			} else {
				System.out.println("strike : 0 , ball : 0");
				System.out.println("Input number¡¦");
			}

//			
//			

////			boolean result = Arrays.equals(selectNumber, winningNumber);
//			if (result) {
//				System.out.println("strike : 3, ball : 0");
//				System.out.println("Game Over!!");
//				break;
//			} else(selectNumber[0]) {
//				System.out.println("´çÃ· µÇÁö ¾Ê¾Ò½À´Ï´Ù.");
//			}

		}			sc.close();

//	          boolean eq = false;
//	          for (int i = 0; i < selectNumber.length - 1; i++) {
//	             if (selectNumber[i] == selectNumber[i + 1]) {
//	                eq = true;
//	                break;
//	             } else {
//	                eq = false;
//	             }
//	          }
//	          if (eq == false) {
//	             break;
//	          }
//	       }
//
//	      
//	      
//	      
//	      
//	      Arrays.sort(selectNumber);
//	      Arrays.sort(winningNumber);
//	      boolean result = Arrays.equals(selectNumber, winningNumber);
//	      System.out.println("´çÃ· ¿©ºÎ : ");
//	      if (result) {
//	         System.out.println("ÃàÇÏÇÕ´Ï´Ù.! ´çÃ· µÇ¼Ì½À´Ï´Ù.");
//	      } else {
//	         System.out.println("´çÃ· µÇÁö ¾Ê¾Ò½À´Ï´Ù.");
//	      }
//	      
//	      

	}

}