package d0322;

public class StringConcatExample {
//Concat : 문자열을 붙이는 함수명
	public static void main(String[] args) {
		String str1 =  "Java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		String str5 = "JDK" + 3 + 3.0; // 연산자 우선순위
		String str6 = 3 + 3.0 + "JDK";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);

	}

}
