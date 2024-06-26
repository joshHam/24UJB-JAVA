package d0401JV3p32;

public class Tire {
	
	//맴버변수
	public int maxRotation; // 최대 회전수(타이어수명)
	public int accumulatedRotation;// 누적 회전수
	public String location; // 타이어의 위치

	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire");
			return false;
		}
	}
}
