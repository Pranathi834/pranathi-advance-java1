/* 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
package program4C;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class ImageButtonEvent
 {

	    JLabel messageLabel;

	    program4C() {
	        // Create the main window
	        JFrame frame = new JFrame("Clock & Hourglass Button Example");

	        // Create a label to show the message
	        messageLabel = new JLabel();
	        messageLabel.setBounds(50, 30, 500, 50);
	        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));

	        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\Lenovo\\Downloads\\cc.jpg");
	        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\Lenovo\\Downloads\\hg.jpg"); // Ensure this path and file exist

	        // Create button with digital clock image
	        JButton digitalClockButton = new JButton(digitalClockIcon);
	        digitalClockButton.setBounds(100, 100, 120, 120);
	        digitalClockButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });

	        // Create button with hourglass image
	        JButton hourGlassButton = new JButton(hourGlassIcon);
	        hourGlassButton.setBounds(300, 100, 120, 120);
	        hourGlassButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });

	        // Add components to the frame
	        frame.add(messageLabel);
	        frame.add(digitalClockButton);
	        frame.add(hourGlassButton);

	        // Configure the frame
	        frame.setSize(550, 300);
	        frame.setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {
	        new  program4C();
	    }
	}




