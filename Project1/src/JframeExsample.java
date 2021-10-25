import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JframeExsample {

	public static void main(String[] args) {
		Border border = BorderFactory.createLineBorder(Color.green,3);
		JLabel label = new JLabel();	//create a label
		label.setText("The baby");	//set text of label
		label.setHorizontalTextPosition(JLabel.CENTER);	//set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP);    //set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0,255,0));	//set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN,40));	//set font of text
		label.setIconTextGap(100);	//set gap of text to image
		label.setBackground(Color.black);
		label.setOpaque(true); 	//display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);	//set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);	//set horizontal position of icon+text within label
		//label.setBounds(100, 100, 455, 455);	//sets x and y axis position within frame as well as dimensions
		
		//				**JFrame = a GUI window to add components to**
		
		JFrame frame = new JFrame();	//create a frame
		frame.setTitle("JFrame title goes here");	//sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//exit out of application, also can use HIDE_ON_CLOSE, and DO_NOTHING_ON_CLOSE
		frame.setResizable(false);	//prevents frame from being resized
		frame.setSize(500,500);	//sets the x-dimension, and y-dimension of frame
		frame.setLayout(null);
		frame.setVisible(true); //make frame visible
		
		ImageIcon image = new ImageIcon("Narutopic.jpg");	//create an image icon
		frame.setIconImage(image.getImage());	//change icon of frame
		frame.getContentPane().setBackground(new Color(0,0,0));		//change color of background, can also use color.green or hexa-decimals(0xFFFFFF)
		
		
		frame.add(label);
		//ImageIcon image1 = new ImageIcon("babyfreya.jpg");
		//label.setIcon(image1);
		//frame.pack(); 	//this will resize the frame based on all the components that you have
	}

}
