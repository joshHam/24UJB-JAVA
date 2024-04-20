package d0411.JV6p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextFieldTest implements WindowListener {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		TextField tfMsg = new TextField(36);
		pwd.setEchoChar('*');

		Button b = new Button("Login");
		b.setSize(300, 100);
		b.setLocation(100, 75);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id.getText().equals("green")) {
					if (pwd.getText().equals("ujb1234")) {
						if (e.getActionCommand().equals("Login")) {
							tfMsg.setText("로그인 성공");
						}
					} else {
						if (e.getActionCommand().equals("확인")) {
							tfMsg.setText("비밀번호를 정확히 입력해주세요.");
						}
					}
				} else {
					if (e.getActionCommand().equals("확인")) {
						tfMsg.setText("아이디를 정확히 입력해주세요.");
					}
				}
			}
		});

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);

		f.add(b);
		f.add(tfMsg);
		f.setVisible(true);

	}

	@Override
	public void windowClosing(WindowEvent e) {

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
