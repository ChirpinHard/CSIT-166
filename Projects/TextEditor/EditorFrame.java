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
	private String fileName;

	//The constructor
	public  EditorFrame() {

		// Window Properties
		setTitle("Text Editor");
		setSize(WIDTH, HEIGHT);

		Container pane = getContentPane();
		pane.setBackground(Color.BLACK);
		pane.setLayout(null);		
		
		//Create text areas & scrollbar
		fileText = new JTextArea();
		textArea = new JTextArea();
		scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		// Create Buttons
		saveB = new JButton("Save Text");
		openB = new JButton("Open File");
		
		// JLabel creation & properties
		JLabel label1 = new JLabel("Enter File Name:");
		label1.setFont(new Font("Arial", Font.BOLD, 18));
		pane.add(label1);
		label1.setLocation(20, 10);
		label1.setSize(200, 30);
		label1.setForeground(Color.WHITE);

		JLabel label2 = new JLabel("Enter Text:");
		label2.setFont(new Font("Arial", Font.BOLD, 18));
		pane.add(label2);
		label2.setLocation(20, 80);
		label2.setSize(100, 30);
		label2.setForeground(Color.WHITE);


		//set the locations of the GUI components
		fileText.setLocation(20, 45);
		textArea.setLocation(20, 110);
		openB.setLocation(200, 45);
		saveB.setLocation(500, 20);


		//set the sizes of the GUI components
		fileText.setSize(175, 25);
		textArea.setSize(725, 300);
		saveB.setSize(200, 70);
		openB.setSize(100, 30);

     

		//add components to the pane
		pane.add(fileText);
		pane.add(scroll);
		pane.add(saveB);
		pane.add(openB);

		scroll.setBounds(20,110,710,260);
		scroll.setVisible(true);    
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
     
		setDefaultCloseOperation(EXIT_ON_CLOSE);
     
		saveB.addActionListener
		(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						newFile(fileName);
						if (countChars(fileName) == 1) {
							JOptionPane.showMessageDialog(null, "There is " +
									countChars(fileName) + " character in this file");	
						}
						else if (countChars(fileName) == 0){
							JOptionPane.showMessageDialog(null, 
									"There are no characters in this file");
						}
						else {
							JOptionPane.showMessageDialog(null, "There are " +
									countChars(fileName) + " characters in this file");
						}
						
					}
					catch (Exception q) {
						
					}

				}
			}
		);

		openB.addActionListener
		(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					fileName = fileText.getText();
					
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
   
   public void newFile(String f) throws Exception {
		FileWriter outFile = new FileWriter(f, false);
	   	PrintWriter out = new PrintWriter(outFile);
	   	String line = textArea.getText();
	   	 
	   	out.println(line);
	   	
	   	out.close();
   }
   
   public int countChars(String file) throws FileNotFoundException {
		FileReader n = new FileReader(file);
		Scanner fileIn = new Scanner(n);
		ArrayList<String> f = new ArrayList<String>();
		int count = 0;
		
		while (fileIn.hasNextLine()) {
			f.add(fileIn.nextLine());
		}
		fileIn.close();
		
		for (String x : f) {
			count += (x.length());
		}
		
		return count;
	}
}
