package d0404.JV4p33;

public class Main {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println("location : "+ location);
		
		if(subject.indexOf("�ڹ�")!=-1) {     		//���ڿ��� �˻��ؼ� ã����������:-1�� �����Ѵ�.
			System.out.println("�ڹٿ� ������ �ֽ��ϴ�.");
		}else {
			System.out.println("�ڹٿ� ������ �����ϴ�.");
		}

	}

}
