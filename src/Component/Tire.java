package Component;

public class Tire {
	private int size;
	
	public Tire() {                            //������(constructor)���� , Ŭ���� �̸��� ����,//�޼ҵ�2
		System.out.println("Tire Constructor");// Method�� return��(ex-void,int..)�� ������� ����
		size = 0;								//�ν��Ͻ� ������ �ڵ����� ȣ��Ǵ� �޼ҵ�, �ַ� ��������� �ʱ�ȭ �ϴµ� ����
	}
	
	public int getSize() {               //�޼ҵ�4
		return size;
	}
	
	public void setSize(int size) {       //�޼ҵ�3 
		this.size = size;
	}

}
