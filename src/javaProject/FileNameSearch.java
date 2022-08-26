package javaProject;

import java.io.File;

public class FileNameSearch {

	public String initials;
	
	public FileNameSearch(String initials) {
		// TODO Auto-generated constructor stub
		
		 this.initials = initials;
	}
	
	 public boolean accept(File dir, String name)
	    {
	        return name.startsWith(initials);
	    }

}
