package gooey;

/** ****************************************************************
This class is the stand-alone class  .it does all the work
editor -- textarea w/ scroll bars
N. Gattuso -- 02/3/2014
****************************************************************** */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.border.*;

public class EditorFrame extends JFrame {

	private final int WIDTH = 750;
	private final int HEIGHT = 410;
   
   private JTextArea textArea;
   private JButton exitB;
   private JScrollPane scroll;

  //The constructor
	public  EditorFrame() {

	  setTitle("Text Editor");
     setSize(WIDTH,HEIGHT);
     
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
                   EditorFrame.this.windowClosed();
               }
           }
       );
       menuFile.add(menuFileExit);
       menuBar.add(menuFile);



    Container pane=getContentPane();

    pane.setBackground(Color.BLACK); //set pane color...

    textArea=new JTextArea();
    scroll = new JScrollPane(textArea);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


    exitB=new JButton("Save Text");


     //set the layout of the pane to null
     pane.setLayout(null);

      //add our label...
       JLabel label = new JLabel("Enter Text:");
		label.setFont(new Font("Arial", Font.BOLD, 18));
		pane.add(label);
		label.setLocation(0, 10);
     	label.setSize(100, 30);
     	label.setForeground(Color.WHITE);


     //set the locations of the GUI components
     textArea.setLocation(10, 100);
     exitB.setLocation(240, 320);


     //set the sizes of the GUI components
     textArea.setSize(725, 200);
     exitB.setSize(200, 30);

     

     //add components to the pane
     pane.add(scroll);
     pane.add(exitB);

     scroll.setBounds(10,100,720,200);
     scroll.setVisible(true);

     
     textArea.setLineWrap(true);
     textArea.setWrapStyleWord(true);
     
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    exitB.addActionListener
       (
           new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                   
                   String text = textArea.getText();

                   JOptionPane.showMessageDialog( null,"You entered: " + text );
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


