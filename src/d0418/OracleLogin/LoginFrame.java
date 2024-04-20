package d0418.OracleLogin;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



	public class LoginFrame{
		private Frame f;
		private TextField id,pwd,tfMsg;
		private Button b;
		private Label lid, lpwd;
		private InfoDAO dao;
		ArrayList<InfoVo>list;
		
		
		
		
		public LoginFrame() {
			dao=new InfoDAO();
		
		
		f = new Frame("Login");
		f.setSize(400,180);
		f.setLayout(null);
		
		lid = new Label("ID : ", Label.RIGHT);
		lid.setSize(50,50);
		lid.setLocation(50,40);
		lpwd = new Label("Password : ", Label.RIGHT);
		lpwd.setSize(70,50);
		lpwd.setLocation(50,70);
		
		id = new TextField(20);
		id.setSize(200,30);
		id.setLocation(130,50);
		pwd = new TextField(20);
		pwd.setSize(200,30);
		pwd.setLocation(130,80);
		tfMsg = new TextField(35);
		tfMsg.setSize(280,30);
		tfMsg.setLocation(50,120);
		pwd.setEchoChar('*');
		
		b = new Button("Login");
		b.setSize(50,100);
		b.setLocation(330,50);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(id.getText()+" : "+pwd.getText());
				String pid = id.getText();
				
				list=dao.list(pid);
				
				if(list.size()!=0) {
					for(int i=0;i<list.size();i++) {
						InfoVo data = (InfoVo)list.get(i);
						String gid = data.getId();
						String gpwd = data.getPwd();
						
						System.out.println(gid +"::"+gpwd);
						
						if(id.getText().equals(gid)&&pwd.getText().equals(gpwd)) {
							tfMsg.setText("로그인이 성공했습니다.");
						}else {
							tfMsg.setText("로그인이 실패했습니다.");
						}
						}
					}else {
						tfMsg.setText("로그인이 실패했습니다.");
					}
				
						for(int i = 0; i<list.size();i++) {
							InfoVo data = (InfoVo)list.get(i);
							String gid = data.getId();
							String gpwd = data.getPwd();
							
							System.out.println(gid+"::"+gpwd);
						}
					}
		
		});

//		Canvas c = new Canvas();
//		c.setBackground(Color.red);
//		c.setBounds(50,50,150,100);
		
//		Panel p = new Panel();
		

		
//		f.add(c);
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		
		f.add(b);
		f.add(tfMsg);
		
		f.setVisible(true);
		
		}
	
		public static void main(String[] args) {
			new LoginFrame();
		
	}
	}

