package d0404.JV4p42;

public class Main {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-Simon";
		
		String[]names = text.split("&|,|-");
		for(String name : names) {		//����for�� Ư¡���ڿ� ó������ ������ ��ȸ�Ҷ�.
			System.out.println(name);
		}

	}

}
