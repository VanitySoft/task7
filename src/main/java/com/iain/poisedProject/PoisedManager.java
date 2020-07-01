package com.iain.poisedProject;

import java.util.Scanner;

public class PoisedManager {
	private static Project newProject = null;
	public static void main(String[] args) {
		
		// Printing out message to User
		System.out.println("************Welcome to poised your Project Management Software*************");
					
		while(true) {
			
			// Displaying menu to user
			System.out.println("Please make a selection from the menu:" +
							   "\n1. Create a new project:" +
							   "\n2. Change the due date of the project:" +
							   "\n3. Change the total number of the fee paid:" +
							   "\n4. Update contractors contact details" +
							   "\n5. Finalise Project:" +
							   "\n6. Exit Program");
		
			// Initiate scanner object
			Scanner input = new Scanner(System.in);
			String userChoice = input.nextLine();
			
			if(userChoice == ("1")) {
				
				// Enter new project number
				System.out.println("Enter Project Number:");
				int typedProjectNumber = input.nextInt();
				input.hasNextLine();
				
				// Enter new project name
				System.out.println("Enter Project Name: ");
				String typedProjectName = input.nextLine();
				
				// Enter building type
				System.out.println("Enter building type: ");
				String typedBuildingType = input.nextLine();
				
				// Enter physical address
				System.out.println("Enter project physical address: ");
				String typedProjectAddress = input.nextLine();
				
				// Enter Erf number
				System.out.println("Enter Erf Number: ");
				int typedErfNumber = input.nextInt();
				input.hasNextLine();
				
				// Enter total fee
				System.out.println("Enter project total fee (numbers only): ");
				double typedTotalFee = input.nextDouble();
				
				// Enter amount paid by customer
				System.out.println("Enter amount paid by customer (number only): ");
				double typedTotalPaid = input.nextDouble();
				
				// Enter project deadline
				System.out.println("Enter due date for example 12 July 2019: ");
				String typedProjectDeadline = input.nextLine();
				
				// Set project completed to no
				String projectCompleted = ("No");
				
				// Get architect inputs
				System.out.println("Enter Architect name:");
				String architectName = input.nextLine();
				
				System.out.println("Enter Architect phone number");
				int architectPhoneNumber = input.nextInt();
				input.hasNextLine();
				
				System.out.println("Enter Architect email address:");
				String architectEmail = input.nextLine();
				
				System.out.println("Enter Architect address:");
				String architectAddress = input.nextLine();
				
				// Get Customer inputs
				System.out.println("Enter Customer name:");
				String customerName = input.nextLine();
				
				System.out.println("Enter Customer number:");
				int customerPhoneNumber = input.nextInt();
				input.hasNextLine();
				
				System.out.println("Enter Customer email address");
				String customerEmail = input.nextLine();
				
				System.out.println("Enter Customer address");
				String customerAddress = input.nextLine();
				
				// Get Contractor inputs
				System.out.println("Enter Contractor name");
				String contractorName = input.nextLine();
				
				System.out.println("Enter Contractor number:");
				int contractorNumber = input.nextInt();
				input.hasNextLine();
				
				System.out.println("Enter Contrator email address:");
				String contractorEmail = input.nextLine();
				
				System.out.println("Enter Contractor address:");
				String contractorAddress = input.nextLine();
				
				// Create Architect
				Person Architect = new Person(architectName, architectPhoneNumber, architectEmail, architectAddress );
				
				// Create Customer
				Person Customer = new Person(customerName, customerPhoneNumber, customerEmail, customerAddress );
				
				// Create Contractor
				Person Contractor = new Person(contractorName, contractorNumber, contractorEmail, contractorAddress);
				
				// Create Project
				newProject = new Project(typedProjectNumber, typedProjectName, typedBuildingType, typedProjectAddress, typedErfNumber, typedTotalFee,
												 typedTotalPaid, typedProjectDeadline, projectCompleted, Architect, Customer, Contractor);
				
				// Printing message to customer and displaying the project
				System.out.println("\nNew project has been created!");
				System.out.println(newProject.toString());
				
			}
			
			else if(userChoice == ("2")) {
				
				// Change due date of the project
				System.out.println("Enter new project deadline date for example 15 July 2020:");
				String newDeadline = input.nextLine();
				
				newProject.setDeadline(newDeadline);
				
			 
				
				
			}
			
		
		
		
		
	
	
	
	
	

		}
}
}

