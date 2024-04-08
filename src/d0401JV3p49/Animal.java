package d0401JV3p49;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	//자식클래스에 sound메소드구현을 "강제"
	public abstract void sound();
}
