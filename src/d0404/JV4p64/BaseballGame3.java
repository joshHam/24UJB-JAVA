package d0404.JV4p64;

import java.util.Random;

import java.util.Scanner;				//안상환풀이

public class BaseballGame3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] RN = new int[3]; // RN 랜덤 숫자
      Random random = new Random();
      System.out.println("타석에는 Mookie Betts 가 서있습니다.");
      for (int i = 0; i < RN.length; i++) {
         RN[i] = random.nextInt(9) + 1;
         for (int o = 0; o < i; o++) {
            if (RN[i] == RN[o]) {
               i--;
            }
         }
      }
      System.out.println("\n 1 : 투심   2 : 포심   3 : 슬라이더 \n 4 : 커브   5 : 싱커   6 : 커터 \n "
               + "7 : 스위퍼  8 : 체인지업 9 : 스플리터");

      //System.out.println(RN[0]+""+RN[1]+""+RN[2]); //난 수 확인용

      while (true) {
         int Scount = 0;
         int Bcount = 0;
         System.out.println("세 자리 숫자를 입력하여 아웃 카운트를 잡으세요.");
               
         String input = sc.next();
         if (input.length() != 3) {
            System.out.println("Balk!!! 미쳐버린 끝내기 보크");
            break;
         }
         char[] pitching = new char[3];
         for (int i = 0; i < 3; i++) {
            pitching[i] = input.charAt(i);
         }
         if(pitching[0]==pitching[1]||pitching[1]==pitching[2]||pitching[0]==pitching[2]) {
            System.out.println("Luis Campusano 가 타임을 요청했습니다. 구종을 겹치지 말라는군요.");
         }else {
            for (int i = 0; i < RN.length; i++) {
               for (int o = 0; o < pitching.length; o++) {
                  if (RN[i] == (pitching[o] - '0')) {
                     if (i == o) {
                        Scount++;
                     } else {
                        Bcount++;
                     }
                  }
               }
            }
         }
         System.out.println("볼 카운트 : " + Bcount + " 스트라이크 카운트 : " + Scount);
         if (Scount == 3) {
            System.out.println("3 스트라이크 삼진 아웃. San Diego Padres 의 승리입니다.");
            break;
         }
      }
      sc.close();
      
   }
}