package d0404.JV4p62;

import java.util.Arrays;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
      int[] selectNumber = new int[6];
      Random random = new Random(/*값을 입력하면 고정된 난수발생*/);				//시드값

      
      
      
      
      while (true) {										//중복되지 않는 난수발생
         for (int i = 0; i < selectNumber.length; i++) {	//중복되지 않는 난수발생
            selectNumber[i] = random.nextInt(45/*난수범위*/) + 1;
         }

         Arrays.sort(selectNumber);
         boolean eq = false;
         for (int i = 0; i < selectNumber.length - 1; i++) {
            if (selectNumber[i] == selectNumber[i + 1]) {
               eq = true;
               break;
            } else {
               eq = false;
            }
         }
         if (eq == false) {
            break;
         }
      }

      
      
      
      
      System.out.println("선택 번호 : ");
      for (int i = 0; i < selectNumber.length; i++) {
         System.out.print(selectNumber[i] + " ");
      }
      System.out.println();

      int[] winningNumber = new int[6];
      random = new Random(5);

      for (int i = 0; i < 6; i++) {
         winningNumber[i] = random.nextInt(45) + 1;
      }

      System.out.println("당첨 번호 : ");
      for (int i = 0; i < winningNumber.length; i++) {
         System.out.print(winningNumber[i] + " ");
      }
      System.out.println();

      Arrays.sort(selectNumber);
      Arrays.sort(winningNumber);
      boolean result = Arrays.equals(selectNumber, winningNumber);
      System.out.println("당첨 여부 : ");
      if (result) {
         System.out.println("축하합니다.! 당첨 되셨습니다.");
      } else {
         System.out.println("당첨 되지 않았습니다.");
      }
   }
}

