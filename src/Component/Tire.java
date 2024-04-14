package Component;

public class Tire {
	private int size;
	
	public Tire() {                            //생성자(constructor)라인 , 클래스 이름과 동일,//메소드2
		System.out.println("Tire Constructor");// Method의 return형(ex-void,int..)을 기술하지 않음
		size = 0;								//인스턴스 생성시 자동으로 호출되는 메소드, 주로 멤버변수를 초기화 하는데 사용됨
	}
	
	public int getSize() {               //메소드4
		return size;
	}
	
	public void setSize(int size) {       //메소드3 
		this.size = size;
	}

}
