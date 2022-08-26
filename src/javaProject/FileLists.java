package javaProject;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

public class FileLists extends FileCreation{

	///Use of priority Queue for ascending order of files to display
	///Use of file handling
	/*
	 * public File file1; public File file2; public File file3; public File file4;
	 * 
	 * public void fileCreation() { file1 = new File("First_File.txt"); file2 = new
	 * File("Second_File.txt"); file3 = new File("Third_File.txt"); file4 = new
	 * File("Fourth_File.txt"); }
	 */
	
	PriorityQueue<File> queue = new PriorityQueue<>();
	public PriorityQueue<File> listFiles()
	{
		 
		
		fileCreation();
		
		/*
		 * file1 = new File("C://Users/First_File.txt"); file2 = new
		 * File("C://Users/Second_File.txt"); file3 = new
		 * File("C://Users/Third_File.txt"); file4 = new
		 * File("C://Users/Fourth_File.txt");
		 */
	       
        queue.add(file1);
        queue.add(file2);
        queue.add(file3);
        queue.add(file4);
        Iterator itr=queue.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        
		return queue;
				
	}
	
	
	
	
	
}
