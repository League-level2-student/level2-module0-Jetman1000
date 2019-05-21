/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	

	// -----------------------------------//

	JButton[] buttons;
	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
		_02_FindTheHiddenButton FTHB = new _02_FindTheHiddenButton();

	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// 3. Ask the user to enter a positive number and convert it to an int
		// in question 1
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		String number = JOptionPane.showInputDialog("enter a positive number");
	    int answer = Integer.parseInt(number);
	    buttons=new JButton[answer];
	    
		// in question 1
		// 5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < buttons.length; i++) {

			buttons[i] = new JButton();
			panel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		// 6. initialize each JButton in the array
		// In the for loop for question 5*

		// 7. add the ActionListener to each JButton
		// In the for loop for question 5*

		// 8. add each JButton to the panel
		// In the for loop for question 5*

		// 9 add the panel to the window
		// finished

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		// finished

		// 11. set the JFrame to visible.
		window.setVisible(true);

		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "click on the correct button");

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random rnumber = new Random();
		hiddenButton = rnumber.nextInt(answer);

		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		buttons[hiddenButton].setText("ME");

		// 15. Use to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttons[hiddenButton] == buttonClicked) {
			JOptionPane.showMessageDialog(null, "You won!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, try again");

		}
		// 18. else tell them to try again
		// In the for loop**
	}
}
