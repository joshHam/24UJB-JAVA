package d0411.Calculator;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;


public class Calculator {
	private Frame f;
	private TextField tfMsg;
	private Panel p;

	private Button b7;
	private Button b8;
	private Button b9;
	private Button bP;
	private Button b4;
	private Button b5;
	private Button b6;
	private Button bM;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button bT;
	private Button bC;
	private Button bD;
	
	
	
	
	
	
	public Calculator() {						//함수메소드 생성자?
		f = new Frame("Calculator");
		f.setSize(500, 500);
		f.setLayout(null);
		tfMsg = new TextField(50);
		p = new Panel();


		
		
		
		bC = new Button(".");
		bC.setSize(50,50);
		bC.setLocation(10,200);
		b7 = new Button("7");
		b7.setSize(50,50);
		b7.setLocation(60,200);
		b8 = new Button("8");
		b8.setSize(50,50);
		b8.setLocation(110,200);
		b9 = new Button("9");
		b9.setSize(50,50);
		b9.setLocation(160,200);
		bP = new Button("+");
		bP.setSize(50,50);
		bP.setLocation(210,200);
		
		b4 = new Button("4");
		b4.setSize(50,50);
		b4.setLocation(10,250);
		b5 = new Button("5");
		b4.setSize(50,50);
		b4.setLocation(60,250);
		
		
		

		f.add(p);
		f.add(bC);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bP);
		
		f.add(b4);
		f.add(b5);
		
		f.add(tfMsg);
		f.setVisible(true);
		
		
	}	
		
		
		
		
	public static void main(String[] args) {
		new Calculator();

	}

}
