import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class centeredLabel {
  
	public static void main(String args[]) {
    JFrame f = new JFrame("Label Demo");
    f.setLayout(new FlowLayout());
    f.setSize(200, 360);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    JLabel label= new JLabel("asdf");
    Border border = BorderFactory.createLineBorder(Color.BLACK);
    label.setBorder(border);
    label.setPreferredSize(new Dimension(150, 100));
    
    label.setText("Hello World! I'm Centered!");
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);

    
    f.add(label);

    f.setVisible(true);
  }
}