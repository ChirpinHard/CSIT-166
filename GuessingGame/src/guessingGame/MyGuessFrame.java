package guessingGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGuessFrame extends JFrame {
	
	private Container pane;
	private int guessCount;
	private int gameCount;
    private int number;
    private int guess;
    JButton button1, button2, button3, button4,
			button5, button6, playAgainB, exitB;

    //Game constructor
	public MyGuessFrame() {
		// Create pane and window settings
		pane = getContentPane();
     	pane.setLayout(null);
     	setTitle("Guessing Game");
     	setSize(new Dimension(700, 675));
     	// Set number to be guessed
     	number = ((int)(Math.random() * 6 + 1));
     	//*DEBUG* System.out.println(number);

     	// Guess buttons all have
     	// same format and actions
     	button1 = new JButton("1");
     	pane.add(button1);
     	button1.setLocation(25, 50);
     	button1.setSize(200, 200);
     	button1.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) { 
     				// Convert button text to integer,
     				// Store to guess var to check vs answer
     				guess = Integer.valueOf(button1.getText());
     				// Increment guess counter for win message
     				guessCount++;
     				// Prevent identical guesses
     				button1.setEnabled(false);
     				//  Needed for macOS color change
     				button1.setOpaque(true);
     				
     				/*  Correct guess disables all buttons,
     				 *  changes color, adds to game count,
     				 *  calls victory window. 			 */     				  
     				if (number == guess) {
     					button1.setBackground(Color.green);
     					button2.setEnabled(false);
     					button3.setEnabled(false);
     					button4.setEnabled(false);
     					button5.setEnabled(false);
     					button6.setEnabled(false);
            		    gameCount++;
            		    winPrompt(guessCount, gameCount);
     				}
     				else
     				// Incorrect guess simply changes color
     					button1.setBackground(Color.red);
     			}
     		}
     	);
     	
     	button2 = new JButton("2");
     	pane.add(button2);
     	button2.setLocation(250, 50);
     	button2.setSize(200, 200);
     	button2.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) {           	   
     				guess = Integer.valueOf(button2.getText());
     				guessCount++;
     				button2.setEnabled(false);
     				button2.setOpaque(true);
            	   
     				if (guess == number) {
     					button2.setBackground(Color.green);
     					button1.setEnabled(false);
     					button3.setEnabled(false);
     					button4.setEnabled(false);
     					button5.setEnabled(false);
     					button6.setEnabled(false);
     					gameCount++;
            		    winPrompt(guessCount, gameCount);
     				}
     				else 
     					button2.setBackground(Color.red);
     			}
     		}
     	);
        
     	button3 = new JButton("3");
     	pane.add(button3);
     	button3.setLocation(475, 50);
     	button3.setSize(200, 200);
     	button3.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) {           	   
     				guess = Integer.valueOf(button3.getText());
     				guessCount++;
     				button3.setEnabled(false);
     				button3.setOpaque(true);
            	   
     				if (guess == number) {
     					button3.setBackground(Color.green);
     					button1.setEnabled(false);
     					button2.setEnabled(false);
     					button4.setEnabled(false);
     					button5.setEnabled(false);
     					button6.setEnabled(false);
     					gameCount++;
            		    winPrompt(guessCount, gameCount);
     				}
     				else
            		   button3.setBackground(Color.red);            	   
     			}
     		}
     	);

     	button4 = new JButton("4");
     	pane.add(button4);
     	button4.setLocation(25, 275);
     	button4.setSize(200, 200);
     	button4.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) {           	   
     				guess = Integer.valueOf(button4.getText());
     				guessCount++;
     				button4.setEnabled(false);
     				button4.setOpaque(true);
            	   
     				if (guess == number) {
     					button4.setBackground(Color.green);            		   
     					button1.setEnabled(false);
     					button2.setEnabled(false);
     					button3.setEnabled(false);
     					button5.setEnabled(false);
     					button6.setEnabled(false);
     					gameCount++;
            		    winPrompt(guessCount, gameCount);
     				}
     				else 
            		   button4.setBackground(Color.red);
     			}
     		}
     	);
        
     	button5 = new JButton("5");
     	pane.add(button5);
     	button5.setLocation(250, 275);
     	button5.setSize(200, 200);
     	button5.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) {           	   
     				guess = Integer.valueOf(button5.getText());
     				guessCount++;
     				button5.setEnabled(false);
     				button5.setOpaque(true);
            	   
     				if (guess == number) {
     					button5.setBackground(Color.green);                	   
     					button1.setEnabled(false);
     					button2.setEnabled(false);
     					button3.setEnabled(false);
     					button4.setEnabled(false);
     					button6.setEnabled(false);
     					gameCount++;
            		    winPrompt(guessCount, gameCount);
     				}
     				else 
     					button5.setBackground(Color.red);
     			}
     		}
     	);
        
     	button6 = new JButton("6");
     	pane.add(button6);
     	button6.setLocation(475, 275);
     	button6.setSize(200, 200);
     	button6.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) {           	   
     				guess = Integer.valueOf(button6.getText());
     				guessCount++;
     				button6.setEnabled(false);
     				button6.setOpaque(true);
            	   
     				if (guess == number) {
     					button6.setBackground(Color.green);
     					button1.setEnabled(false);
     					button2.setEnabled(false);
     					button3.setEnabled(false);
     					button4.setEnabled(false);
     					button5.setEnabled(false);            		   
     					gameCount++;
            		    winPrompt(guessCount, gameCount);
     				}
     				else
     					button6.setBackground(Color.red);
     			}
     		}
     	);
     	
     	// Play again button re-enables all guess
     	// buttons, resets colors to default, rolls
     	// back guess count, and creates new number
     	playAgainB = new JButton("Play Again");
     	pane.add(playAgainB);
     	playAgainB.setLocation(25, 500);
     	playAgainB.setSize(300, 100);
     	playAgainB.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) {           	   
     				number = ((int)(Math.random() * 6 + 1));
     				//*DEBUG* System.out.println(number);
     				guessCount = 0;
     				
     				button1.setEnabled(true);
     				button1.setBackground(null);
 					button2.setEnabled(true);
 					button2.setBackground(null);
 					button3.setEnabled(true);
 					button3.setBackground(null);
 					button4.setEnabled(true);
 					button4.setBackground(null);
 					button5.setEnabled(true);
 					button5.setBackground(null);
 					button6.setEnabled(true);
 					button6.setBackground(null);
     			}
     		}
     	);
        
     	// Quit button exits program
     	exitB = new JButton("Quit");
     	pane.add(exitB);
     	exitB.setLocation(375, 500);
     	exitB.setSize(300, 100);
     	exitB.addActionListener
     	(
     		new ActionListener() {
     			public void actionPerformed(ActionEvent e) {           	   
     				windowClosed();
     			}
     		}
     	);
     	
     	this.addWindowListener
     	(
     		new WindowAdapter() {
     			public void windowClosing(WindowEvent e) {
     				MyGuessFrame.this.windowClosed();
     			}
     		}
     	);
	}
	
	// Method to display message on successful guess
	// Conditions for proper grammar of message
	public void winPrompt(int guessCt, int gameCt) {
		if (gameCt == 1 && guessCt == 1) {
			JOptionPane.showMessageDialog(null, "Correct! It took you " +
				guessCt + " guess.\n" + gameCt + " game played so far.",
				"Perfect!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (guessCt == 1) {
			JOptionPane.showMessageDialog(null, "Correct! It took you " +
				guessCt + " guess.\n" + gameCt + " games played so far.",
				"Perfect!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (gameCt == 1) {
			JOptionPane.showMessageDialog(null, "Correct! It took you " +
				guessCt + " guesses.\n" + gameCt + " game played so far.",
				"Congratulations!", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Correct! It took you " +
				guessCt + " guesses.\n" + gameCt + " games played so far.",
				"Congratulations!", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	protected void windowClosed() {
		System.exit(0);
	}
}