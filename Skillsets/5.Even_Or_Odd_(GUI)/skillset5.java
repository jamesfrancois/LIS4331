import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class skillset5 extends JFrame {

    private JTextField one;
    private JTextField two;
    int number;
    String text;

    public skillset5() {
        super("Even or Odd (GUI)");
        setLayout(new FlowLayout());
        one = new JTextField(10);
        add(one);
        two = new JTextField("Enter a number: ");
        two.setEditable(false);
        add(two);

        hand handler = new hand();
        one.addActionListener(handler);
        two.addActionListener(handler);
    }

    private static boolean isNumber(String n) {
    		try {
    			Integer.parseInt(n);
    			return true;
    		} catch (NumberFormatException nfe) {
    			return false;
    		}
    	}

    public class hand implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String msg = "";

            if (event.getSource() == one) {
                text = one.getText();
                if (!isNumber(text)) {
                  msg = msg.format("Please enter a valid integer", text);
                  }
                  else {
                number = Integer.parseInt(text);
                if (number % 2 == 0) {
                    msg = msg.format("%s is even!", text);
                } else {
                    msg = msg.format("%s is not even!", text);

                }
              }
                JOptionPane.showMessageDialog(null, msg);
            }

        }
    }

    public static void main(String[] args) {
        new skillset5().setVisible(true);
    }
}