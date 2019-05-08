package fileSystem;

import java.io.*;
import java.util.*;

public class FileSystem {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception{
		String fileName1;
		String fileName2;
		// Print user prompt and request option	
		String opt = welcomePrompt();
		// Logic gate for system options, 'q' will terminate program
		while (!"q".equals(opt)) {	
			// Print file options, specifics handled by internal method
			if (opt.equals("va") || opt.equals("vb")) {
				System.out.print("Enter file name: ");
				fileName1 = getFile();
								
				opt = printFile(opt, fileName1);				
			}
			// Copy content option, from one file to another
			else if (opt.equals("c")) {
				System.out.print("Enter file name you wish to copy: ");
				fileName1 = getFile();				
				System.out.print("Enter file name to copy to: ");
				fileName2 = getFile();
								
				opt = copyFile(fileName1, fileName2);
			}
			// Append option, copying line by line until 'quit' entered
			else if (opt.equals("a")) {
				System.out.print("Enter file name to append: ");
				fileName1 = getFile();
				System.out.println("Enter changes, to exit enter 'quit'");
				
				opt = appendFile(fileName1);				
			}
			// New file option, line by line until 'quit' entered
			else if (opt.equals("n")) {
				System.out.print("Enter new file name: ");
				fileName1 = getFile();
				System.out.println("Enter contents, to exit enter 'quit'");
				
				opt = newFile(fileName1);
			}
			// Searches specific file for pattern, returns a count
			else if (opt.equals("s")) {
				System.out.print("Enter the file you'd like to search: ");
				fileName1 = getFile();
				
				opt = searchFile(fileName1);
			}
			// Re-prints prompt for any invalid input
			else {				
				opt = welcomePrompt();
			}
						
		}
		in.close();
	}
	
	public static String welcomePrompt() {
		System.out.println("**********************************************");
		System.out.println("Welcome to my File System");
		System.out.println("Options - Enter:");
		System.out.println("va - view a file from top to bottom");
		System.out.println("vb - view a file from bottom to top");
		System.out.println("c  - copy a file from one source to another");
		System.out.println("a  - append new info to a file");
		System.out.println("n  - create a new file with info");
		System.out.println("s  - search the file for a pattern");
		System.out.println("q  - quit the system");
		System.out.println("any other input - refresh the options menu");
		System.out.println("**********************************************");
		return optRequest();
	}
	
	public static String optRequest() {		
		System.out.print("Enter option: ");
		String o = in.nextLine();
		
		return o;
	}
	
	public static String getFile() {		
		String name = in.nextLine();
		
		return name;
	}
	
	public static String printFile(String o, String file) throws FileNotFoundException {
		FileReader n = new FileReader(file);
		Scanner fileIn = new Scanner(n);
		ArrayList<String> f = new ArrayList<String>();
		
		while (fileIn.hasNextLine()) {
			f.add(fileIn.nextLine());
		}
		fileIn.close();
		if (o.equals("va")){
			for (String x : f) {
				System.out.println(x);
			}
		}
		else if (o.equals("vb")) {
			for (int i = f.size() - 1; i >= 0; i--) {
				System.out.println(f.get(i));
			}
		}
		return optRequest();
	}
	
	public static String copyFile(String f1, String f2) throws Exception {
		File fileIn = new File(f1);
		Scanner s = new Scanner(fileIn);
	   	FileWriter outFile = new FileWriter(f2, true);
	   	PrintWriter out = new PrintWriter(outFile);
	   	String line;
	   	 
	   	while (s.hasNextLine()) {
	   		line = s.nextLine();
	   		out.println(line);
	   	}
	   	 
	   	s.close();
	   	out.close();
	   	return optRequest();
	}
	
	public static String appendFile(String f) throws Exception {
		FileWriter outFile = new FileWriter(f, true);
	   	PrintWriter out = new PrintWriter(outFile);
	   	String line = in.nextLine();
	   	 
	   	while (!"quit".equals(line)) {
	   		out.println(line);
	   		line = in.nextLine();
	   	}
	   	out.close();
	   	
	   	return optRequest();
	}
	
	public static String newFile(String f) throws Exception {
		FileWriter outFile = new FileWriter(f, false);
	   	PrintWriter out = new PrintWriter(outFile);
	   	String line = in.nextLine();
	   	 
	   	while (!"quit".equals(line)) {
	   		out.println(line);
	   		line = in.nextLine();
	   	}
	   	out.close();
	   	
	   	return optRequest();
	}

	public static String searchFile(String f) throws Exception {
		FileReader n = new FileReader(f);
		Scanner s = new Scanner(n);
		int lineCount = 1;
		int patternCount = 0;
		ArrayList<Integer> lines = new ArrayList<Integer>();
		System.out.print("Enter what you are looking for: ");
		String pattern = in.nextLine();
		
		while (s.hasNextLine()) {
	   		if(pattern.equals(s.nextLine())) {
	   			patternCount++;
	   			lines.add(lineCount);
	   		}
	   		lineCount++;
	   	}
		
		if (patternCount == 0) 
			System.out.println("Pattern not found in file");
		else {
			System.out.printf("'%s' is found on %d lines, specifically ", pattern, patternCount);
			for (int i = 0; i < lines.size(); i++) {
				if (i == lines.size() - 1)
					System.out.println("and " + lines.get(i) + ".");
				else
					System.out.print(lines.get(i) + ", ");
			}
		}
		
		s.close();
		return optRequest();
	}
}
