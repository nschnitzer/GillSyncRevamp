import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class GillSync {
	

	public static void main(String[] args) {
		List<String> pics = Arrays.asList("Gill0.jpg","Gill1.jpg","Gill2.jpg","Gill3.jpg","Gill4.jpg","Gill5.jpg","Gill6.jpg","Gill7.png","Gill8.png","Gill9.png","Gill10.png","Gill11.jpg","Gill12.jpg","Gill13.jpg","Gill14.jpg","Gill15.jpg","Gill16.jpg","Gill17.png","Gill18.jpg","Gill19.jpg","Gill20.jpg");
		Random random = new Random();
		
		while(true) {
			new Gill(pics.get(random.nextInt(pics.size())));
		}

	}
	

}

class Gill {
	JFrame frame;
	
	Gill(String str) {
		Random random = new Random();
		frame = new JFrame();
		frame.add(new JLabel(new ImageIcon(str)));
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setLocation(random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width /4 * 3), random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width)/2);
		frame.pack();
		frame.setVisible(true);
	}
}
