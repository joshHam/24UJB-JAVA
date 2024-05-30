package d0523Test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {// 메인클래스

		Student s1 = new Student(); //입출력클래스 인스턴스생성
		s1.print();

	}
}

class Student { // 이름 학교명 학년 입출력 클래스
	private Scanner sc = new Scanner(System.in);
	private String name = sc.next();
	private String school = sc.next();
	private int grade = sc.nextInt();

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}