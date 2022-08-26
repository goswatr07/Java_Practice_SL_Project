package javaProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

///use of inheritance
public class FileOperations extends FileLists {

	
	///use of file handling
	public FileOperations() {
		// TODO Auto-generated constructor stub
	}
	
	String initials;
	public File file5 = new File("Fifth_File.txt");
	
	//file5 = 
	//Add file to file list
	public PriorityQueue<File> addFiles()
	{
		
		try {
			if(file5.createNewFile()==true)
			{
				System.out.println("New file " + file5 + " created");
				String text5;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter text to write in the file");
			     text5 = sc.nextLine();	     
			     FileOutputStream fileOut5 = new FileOutputStream(file3);
			     fileOut5.write(text5.getBytes());
			     fileOut5.flush();
			     fileOut5.close();
			}
			else
			{
				System.out.println("File already exists");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		queue.add(file5);
		Iterator itr=queue.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        return queue;
		  
        // Try-Catch Block
        
	}
	
	//Delete particular file -- User Input
	public void deleteFiles() throws IOException
	{
		
		
		if(file5.createNewFile()==true) {	
		
		if(file5.exists()==true)
		{
			if(file5.delete())
			{
				System.out.println("The File is deleted.");
			}
			else
			{
				System.out.println("File deletion failed!!!");
			}
		}
		else {
				System.out.println("File doesn't exists");
			}
		}
		
	}
	
    
    // FileNameSearch to initialize object
	FileNameSearch filter  = new FileNameSearch("file.txt");
	
	//Search for a particular file -- User input
	public File searchFiles()
	{
		 File directory = new File("C:\\Users\\hp\\Documents\\Selenium_TestNG\\Java_Project_SL");
		 String[] flist = directory.list();
		
		 if (flist == null) {
	            System.out.println("Its an empty directory or directory doesn't exist.");
	        }
		 else {
			  
	            // Print all files with same name in directory
	            // as provided in object of MyFilenameFilter
	            // class
	            for (int i = 0; i < flist.length; i++) {
	            	System.out.println(flist[i]+" found");
	            	
	            	
	            }
	        }
		return null;
		
	}
	
	

}
