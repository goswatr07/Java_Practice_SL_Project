package javaProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static WelcomeScreen welcome = new WelcomeScreen();
	static FileOperations fileOptn = new FileOperations();
	
	public static void main(String[] args) throws IOException {

		// creating an instance of the class- WelcomeScreen
		
		welcome.welcomeScreen(null, null); 
			  
		 
		//fileOptn.createFileFileOutputStream();
		//fileOptn.addFiles();
		//fileOptn.deleteFiles();
		optionsAvailable();
	}

	
	public static File optionsAvailable() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any options below: ");
		int options = sc.nextInt();
		
		switch(options)
		{
		case 1:
			fileOptn.listFiles();
			break;
		case 2:
			System.out.println("Please enter the sub-options below: ");
			int suboptions = sc.nextInt();
			switch(suboptions)
			{
			case 1:
				fileOptn.addFiles();
				break;
			case 2:
				fileOptn.deleteFiles();
				break;
			case 3:
				fileOptn.searchFiles();
				break;
			case 'D':
				break;
			}
			break;
		case 3:
			System.out.println("Closing the program ");
			System.exit(0);
			break;	
			}
		return null;
		
	}
}
