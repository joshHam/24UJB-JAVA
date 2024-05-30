package d0523Test;
//1. “이름“, ”학교명“, ”학년“을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.
//조건. 위의 데이터를 관리하는 class를 설계하시오.
//
//입력 :　Songjunghyuk Beolmal 6
//
//출력 : Name : Songjunghyuk
//   School : Beolmal
//   Grade :　6
//2. 위의 7번 문제에서 구현한 클래스를 사용하기 위한 Main 클래스를 작성하시오. 
//위에서 정의한 클래스의 instance를 생성하고 프로그램 실행 결과가 나타나도록 프로그램 코드를 작성하시오.

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
//		System.out.println("Name : "+ name);
		s1.print();

	}

}
class Student{
	private Scanner sc = new Scanner(System.in);
	private String name = sc.next();
	private String school = sc.next();
	private int grade = sc.nextInt();
	
//	public Student() {
//		this.name = name;
//		this.school = school;
//		this.grade = grade;
//	}
	
//	public Student() {
//		// TODO Auto-generated constructor stub
//		this.name = name;
//		this.school = school;
//		this.grade = grade;
//	}

	public void print() {
		System.out.println("Name : "+ name);
		System.out.println("School : "+ school);
		System.out.println("Grade : "+ grade);
	}
	
}