package d0328p11;

public class Child extends Parent {
	public int ChildNo;
	
	Child(String name, String ssn, int childNo) {
		super(name, ssn);  //부모생성자의 명시적 호출
		this.ChildNo = childNo;
	}
}
