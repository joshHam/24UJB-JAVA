package d0411.JV6p30;

import java.awt.Button;
import java.awt.Frame;
public class ButtonTest {
	
	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);
		Button b = new Button("확인");
		
		b.setSize(100,50);
//		b.setLocation(100,75);
		b.setLocation(5,5);
		
		f.add(b);
		f.setVisible(true);
		

		
		
	}

}
