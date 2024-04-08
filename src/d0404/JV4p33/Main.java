package d0404.JV4p33;

public class Main {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println("location : "+ location);
		
		if(subject.indexOf("자바")!=-1) {     		//문자열을 검색해서 찾지못했을때:-1을 리턴한다.
			System.out.println("자바와 관련이 있습니다.");
		}else {
			System.out.println("자바와 관련이 없습니다.");
		}

	}

}
