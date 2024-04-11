package d0411.JV6p24;

//Quiz. OK 버튼 클릭 시, 
//OK라고 출력, Open 버튼 클릭 시, 
//Open이라고 출력, 
//Close 버튼 클릭 시 프로그램 종료 기능 구현

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
								//두개의 인터페이스
public class FlowTest implements WindowListener, ActionListener {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowTest() {
		frame = new Frame("adapter example");
		button1 = new Button("Ok");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	public void startFrame() {
		frame.addWindowListener(this);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		frame.setLayout(new FlowLayout());

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		FlowTest g = new FlowTest();
		g.startFrame();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ok")) {
			System.out.println("OK");
		}
		if (e.getActionCommand().equals("Open")) {
			System.out.println("Open");
		}
		if (e.getActionCommand().equals("Close")) {
			System.exit(0);
		}

//		button1.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent arg0) {
//			System.out.println("Ok");
//		}
//	});

	}

}
