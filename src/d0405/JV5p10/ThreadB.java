package d0405.JV5p10;

public class ThreadB extends ThreadExample {
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}

}
