package d0411.Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calculator {
	private Frame f;
	private TextField tfMsg;
	private Panel p;
	private Button b[];
	private String[] btnText = { " 7 ", " 8 ", "9 ", " + ", " 4 ", " 5 ", " 6 ", " - ", " 1 ", " 2 ", " 3 ", " * ",
			" . ", " 0 ", " = ", " / " };

	public Calculator() { // 함수메소드 생성자?
		f = new Frame("Calculator");
		tfMsg = new TextField("0");
		p = new Panel();
		b = new Button[16];

		for (int i = 0; i < 16; i++) {
			b[i] = new Button(btnText[i]);
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
		f.pack();
		f.setVisible(true);

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.startFrame();

	}

}
