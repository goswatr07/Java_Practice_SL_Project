package javaProject;

import java.util.Scanner;

public  class WelcomeScreen {

	//String applicationName =""
	public String welcomeScreen(String applicationName, String developerName)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the application Name: ");
		//applicationName=" ";
		
		applicationName = sc.nextLine();
		System.out.println("Application Name: " + applicationName);
		
		System.out.println("Enter the developer's name: ");
		developerName = sc.nextLine();
		System.out.println("Developer Name: " + developerName);
//		/return applicationName;
		return developerName;
		
	}
	
	
	 
}
