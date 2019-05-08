package gooey;

/** ****************************************************************
This class is the stand-alone class  .it does all the work
N. Gattuso -- 01/13/2014
****************************************************************** */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWindowFrame extends JFrame {

	private Container pane;
	private JTextField textField;

  //The constructor
	public MyWindowFrame() {

		//create a pane to work in..
		pane=getContentPane();
	    //set the layout of the pane to null
     	pane.setLayout(null);

       JMenuBar menuBar = new JMenuBar();
       JMenu menuFile = new JMenu();
       JMenuItem menuFileExit = new JMenuItem();

       menuFile.setText("File");
       menuFileExit.setText("Exit");

       // Add action listener.for the menu button
       menuFileExit.addActionListener
       (
           new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   MyWindowFrame.this.windowClosed();
               }
           }
       );
       menuFile.add(menuFileExit);
       menuBar.add(menuFile);

       setTitle("Echo Back...");
       setJMenuBar(menuBar);
       setSize(new Dimension(250, 200));

       //add our label...
       JLabel label = new JLabel("Enter Info:");
		label.setFont(new Font("Serif", Font.PLAIN, 18));
		pane.add(label);
		label.setLocation(0, 10);
     	label.setSize(100, 30);

     	textField = new JTextField(20);
		pane.add(textField);
		textField.setSize(100, 30);
		textField.setLocation(120, 10);

     	JButton button1 = new JButton("Echo");
		pane.add(button1);
		button1.setLocation(30, 70);
       button1.setSize(150, 50);
     	button1.addActionListener
       (
           new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   JOptionPane.showMessageDialog( null,"You pressed: " + e.getActionCommand() );

                   String text = textField.getText();

                   JOptionPane.showMessageDialog( null,"You entered: " + text );
               }
           }
       );


       // Add window listener. to window
       this.addWindowListener
       (
           new WindowAdapter() {
               public void windowClosing(WindowEvent e) {
                   MyWindowFrame.this.windowClosed();
               }
           }
       );


   }


   /**
    * Shutdown procedure when run as an application.
    */
   protected void windowClosed() {

   	// TODO: Check if it is safe to close the application

       // Exit application.
       System.exit(0);
   }
}



