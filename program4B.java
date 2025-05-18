package program4B;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class program4B {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country Buttons");
	        JButton indiaBtn = new JButton("India");
	        JButton srilankaBtn = new JButton("Srilanka");
	        JLabel label = new JLabel("", SwingConstants.CENTER);

	        indiaBtn.setBounds(50, 50, 100, 30);
	        srilankaBtn.setBounds(160, 50, 100, 30);
	        label.setBounds(50, 100, 300, 30);

	        indiaBtn.addActionListener(e -> label.setText("India is pressed"));
	        srilankaBtn.addActionListener(e -> label.setText("Srilanka is pressed"));

	        frame.add(indiaBtn);
	        frame.add(srilankaBtn);
	        frame.add(label);

	        frame.setLayout(null);
	        frame.setSize(350, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


