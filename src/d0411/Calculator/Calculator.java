package d0411.Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
	private Frame f;
	private TextField tfMsg;
	private Panel p;
	private Button b[];
	private String[] btnText = { " 7 ", " 8 ", "9 ", " + ", " 4 ", " 5 ", " 6 ", " - ", " 1 ", " 2 ", " 3 ", " * ",
			" 0 ", " . ", " = ", " / " };
//	private Font font1;

	public Calculator() { // 함수메소드 생성자?
		f = new Frame("Calculator");
		tfMsg = new TextField("0");
		p = new Panel();
		b = new Button[16];
//		font1 = new Font("Showcard Gothic",Font.BOLD,15);
		for (int i = 0; i < 16; i++) {
			b[i] = new Button(btnText[i]);
//			btnText[i].formatted(font1);
		}

		for (int i = 0; i < 16; i++) {
			b[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String m = tfMsg.getText();
					
					
//					System.out.println(inpId + " / " + inpPwd);
//					
//					if(inpId.equals(LOGIN_ID) && inpPwd.equals(LOGIN_PWD)) {
//						tfMsg.setText("로그인이 성공 했습니다. 추카추카");
//					}else {
//						tfMsg.setText("로그인이 실패 했습니다.");
//					}
				}
			});
		}

	}

	public void startFrame() {

		f.add(tfMsg, BorderLayout.NORTH);
		f.add(p, BorderLayout.CENTER);

		p.setLayout(new GridLayout(4, 4));

		for (int i = 0; i < 16; i++) {

			p.add(b[i]);
		}

		p.setBackground(Color.green);
		f.setSize(400, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.startFrame();

	}

}
