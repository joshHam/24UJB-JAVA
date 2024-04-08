package d0404.JV4p42;

public class Main {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-Simon";
		
		String[]names = text.split("&|,|-");
		for(String name : names) {		//향상된for문 특징문자열 처음부터 끝까지 순회할때.
			System.out.println(name);
		}

	}

}
