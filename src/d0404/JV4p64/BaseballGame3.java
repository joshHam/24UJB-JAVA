package d0404.JV4p64;

import java.util.Random;

import java.util.Scanner;				//�Ȼ�ȯǮ��

public class BaseballGame3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] RN = new int[3]; // RN ���� ����
      Random random = new Random();
      System.out.println("Ÿ������ Mookie Betts �� ���ֽ��ϴ�.");
      for (int i = 0; i < RN.length; i++) {
         RN[i] = random.nextInt(9) + 1;
         for (int o = 0; o < i; o++) {
            if (RN[i] == RN[o]) {
               i--;
            }
         }
      }
      System.out.println("\n 1 : ����   2 : ����   3 : �����̴� \n 4 : Ŀ��   5 : ��Ŀ   6 : Ŀ�� \n "
               + "7 : ������  8 : ü������ 9 : ���ø���");

      //System.out.println(RN[0]+""+RN[1]+""+RN[2]); //�� �� Ȯ�ο�

      while (true) {
         int Scount = 0;
         int Bcount = 0;
         System.out.println("�� �ڸ� ���ڸ� �Է��Ͽ� �ƿ� ī��Ʈ�� ��������.");
               
         String input = sc.next();
         if (input.length() != 3) {
            System.out.println("Balk!!! ���Ĺ��� ������ ��ũ");
            break;
         }
         char[] pitching = new char[3];
         for (int i = 0; i < 3; i++) {
            pitching[i] = input.charAt(i);
         }
         if(pitching[0]==pitching[1]||pitching[1]==pitching[2]||pitching[0]==pitching[2]) {
            System.out.println("Luis Campusano �� Ÿ���� ��û�߽��ϴ�. ������ ��ġ�� ����±���.");
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
         System.out.println("�� ī��Ʈ : " + Bcount + " ��Ʈ����ũ ī��Ʈ : " + Scount);
         if (Scount == 3) {
            System.out.println("3 ��Ʈ����ũ ���� �ƿ�. San Diego Padres �� �¸��Դϴ�.");
            break;
         }
      }
      sc.close();
      
   }
}