package d0411.JV6p24;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FlowTest2 implements WindowListener {
   private JFrame jf;
   private Button b1, b2, b3;

   public FlowTest() {
      jf = new JFrame("adapter example");
      b1 = new Button("Ok");
      b2 = new Button("Open");
      b3 = new Button("Close");

      b1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JOptionPane.showMessageDialog(b1, "Ok"); ///////////
         }
      });

      b2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JOptionPane.showMessageDialog(b2, "Open");
         }
      });

      b3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            jf.dispose();
         }
      });
   }

   @Override
   public void windowClosing(WindowEvent e) {
      // TODO Auto-generated method stub
      System.exit(0);
   }

   @Override
   public void windowOpened(WindowEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void windowClosed(WindowEvent e) {
      // TODO Auto-generated method stub

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

   public void StartFrame() {
      jf.addWindowListener(this);
      jf.setLayout(new FlowLayout());

      jf.add(b1);
      jf.add(b2);
      jf.add(b3);
      jf.setSize(300, 300);
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      FlowTest f = new FlowTest();
      f.StartFrame();
   }

}
