package textEdit;

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

	private JTextArea fileText;
	private JTextArea textArea;
	private JButton saveB;
	private JButton openB;
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



		Container pane = getContentPane();

		pane.setBackground(Color.BLACK); //set pane color...

		fileText = new JTextArea();
		textArea = new JTextArea();
		scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


		saveB = new JButton("Save Text");
		openB = new JButton("Open File");


		//set the layout of the pane to null
		pane.setLayout(null);

		JLabel label1 = new JLabel("Enter File Name:");
		label1.setFont(new Font("Arial", Font.BOLD, 18));
		pane.add(label1);
		label1.setLocation(10, 10);
		label1.setSize(200, 30);
		label1.setForeground(Color.WHITE);
		//add our label...
		JLabel label2 = new JLabel("Enter Text:");
		label2.setFont(new Font("Arial", Font.BOLD, 18));
		pane.add(label2);
		label2.setLocation(10, 80);
		label2.setSize(100, 30);
		label2.setForeground(Color.WHITE);


		//set the locations of the GUI components
		fileText.setLocation(10, 40);
		textArea.setLocation(10, 110);
		openB.setLocation(200, 40);
		saveB.setLocation(325, 340);


		//set the sizes of the GUI components
		fileText.setSize(175, 25);
		textArea.setSize(725, 200);
		saveB.setSize(100, 30);
		openB.setSize(100, 30);

     

		//add components to the pane
		pane.add(fileText);
		pane.add(scroll);
		pane.add(saveB);
		pane.add(openB);

		scroll.setBounds(10,110,720,200);
		scroll.setVisible(true);

     
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
     
		setDefaultCloseOperation(EXIT_ON_CLOSE);
     
		saveB.addActionListener
		(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                   
					String text = textArea.getText();

					JOptionPane.showMessageDialog( null,"You entered: " + text );
				}
			}
		);

		openB.addActionListener
		(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					String fileName = fileText.getText();
					
						try {
							openFile(fileName);
						} 
						catch(Exception nf) {
							JOptionPane.showMessageDialog( null, "File Not Found, Try Again",
									"Error!", JOptionPane.ERROR_MESSAGE);
						}
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
   
   public void openFile(String file) throws FileNotFoundException {
		FileReader n = new FileReader(file);
		Scanner fileIn = new Scanner(n);
		ArrayList<String> f = new ArrayList<String>();
		
		while (fileIn.hasNextLine()) {
			f.add(fileIn.nextLine());
		}
		fileIn.close();
		
		for (String x : f) {
			textArea.append(x + "\n");
		}
				
	}
}
