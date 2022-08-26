package javaProject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileCreation {

	
	
	public FileCreation() {
		// TODO Auto-generated constructor stub
	}
	
	public File file1 = new File("First_File.txt");
	public File file2 = new File("Second_File.txt");
	public File file3 = new File("Third_File.txt");
	public File file4 = new File("Fourth_File.txt");
	String text1;
	String text2;
	String text3;
	Scanner sc = new Scanner(System.in);
	
	public File fileCreation()
	{
		try {
		if(file1.createNewFile()==true)
		{
			System.out.println("New file " + file1 + " created");
			System.out.println("Enter text to write in the file");
		     text1 = sc.nextLine();	     
		     FileOutputStream fileOut1 = new FileOutputStream(file1);
		     fileOut1.write(text1.getBytes());
		     fileOut1.flush();
		     fileOut1.close();
		     System.out.println("File " + file1 + " saved.");
		}
		else
		{
			System.out.println("File already exists");
		}
		//String text1;
	     
	     
		file2 = new File("Second_File.txt");
		if(file2.createNewFile()==true)
		{
			System.out.println("New file " + file2 + " created");
			System.out.println("Enter text to write in the file");
		     text2 = sc.nextLine();	     
		     FileOutputStream fileOut2 = new FileOutputStream(file2);
		     fileOut2.write(text2.getBytes());
		     fileOut2.flush();
		     fileOut2.close();
		     System.out.println("File "+file2+" saved.");
		}
		else
		{
			System.out.println("File already exists");
		}
		
	     //Scanner sc = new Scanner(System.in);
		     
		      
		file3 = new File("Third_File.txt");
		if(file3.createNewFile()==true)
		{
			System.out.println("New file " + file3 + " created");
			String text3;
			System.out.println("Enter text to write in the file");
		    text3 = sc.nextLine();	     
		    FileOutputStream fileOut3 = new FileOutputStream(file3);
		    fileOut3.write(text3.getBytes());
		    fileOut3.flush();
		    fileOut3.close();
		    System.out.println("File " + file3 + " saved.");
		}
		else
		{
			System.out.println("File already exists");
		}
		
	     System.out.println("File saved.");
		file4 = new File("Fourth_File.txt");
		
			if(file4.createNewFile()==true)
			{
				System.out.println("New file " + file4 + " created");
				String text4;
				System.out.println("Enter text to write in the file");
			    text4 = sc.nextLine();	     
			    FileOutputStream fileOut4 = new FileOutputStream(file3);
			    fileOut4.write(text4.getBytes());
			    fileOut4.flush();
			    fileOut4.close();
			    System.out.println("File " + file4 + " saved.");
			}
			else
			{
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}
