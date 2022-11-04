/**Student Name: Elisha Garcia
*Date Completed: 02/18/2022
*Project: Chapter 1-4
*Extra Credit: yes
*Project Description: Ask the user for their information and then collect their walking data for the last week. Return the data back to user and ask if they
*					  wish to enter a new user.
**/

package Chapter1to4PPElishaGarcia;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter1To4PPElishaGarcia {
	
	public static void main (String[] args) {
		
		//Declare variables
		final double DAYS_IN_WEEK = 7, STEPS_IN_MILE = 5280, MINIMUN_MILES_THRESHOLD = 2;
		
		double mondaySteps=0, tuesdaySteps=0, wednesdaySteps=0, thursdaySteps=0, fridaySteps=0, saturdaySteps=0, sundaySteps=0, avgMilesWalked; 
		
		String firstName, lastName, fullName, collegeName, userAge;
		int goAgain;

		//put the code in a do/while loop so user may start again or add another new user.
		do 
		{
			Scanner scan = new Scanner(System.in);
			
			    // ask for users basic info
				System.out.print("What is your first name? ");
				firstName = scan.nextLine();
				
				System.out.print("What is your last name? ");
				lastName = scan.nextLine();
				
				fullName = (firstName + " " + lastName);
				
				System.out.print("What college are you attending? ");
				collegeName = scan.nextLine();
				
				System.out.print("What is your age? ");
				userAge = scan.nextLine();
			
				//loop 7 times (DAYS_IN_WEEK) so you may get a count from the user of number of step each unique day of the week
				for (int x = 0; x < DAYS_IN_WEEK; x++) {
					
					//use a switch to take x from the for loop so the day it is asking for is accurate
					switch (x)
					{
					case 0:
						System.out.print("How many steps did you walk Monday? ");
						mondaySteps = scan.nextDouble();
						break;
					case 1:
						System.out.print("How many steps did you walk Tuesday? ");
						tuesdaySteps = scan.nextDouble();
						break;
					case 2:
						System.out.print("How many steps did you walk Wednesday? ");
						wednesdaySteps = scan.nextDouble();
						break;
					case 3:
						System.out.print("How many steps did you walk Thursday? ");
						thursdaySteps = scan.nextDouble();
						break;
					case 4:
						System.out.print("How many steps did you walk friday? ");
						fridaySteps = scan.nextDouble();
						break;
					case 5:
						System.out.print("How many steps did you walk Saturday? ");
						saturdaySteps = scan.nextDouble();
						break;
					case 6:
						System.out.print("How many steps did you walk Sunday? ");
						sundaySteps = scan.nextDouble();
						break;
					}
				}
					
				//find out the average miles walked a day for that week
				avgMilesWalked = ((mondaySteps + tuesdaySteps + wednesdaySteps + thursdaySteps + fridaySteps + saturdaySteps + sundaySteps)/ DAYS_IN_WEEK)/ STEPS_IN_MILE;

				//feed the information back to the user
				System.out.println();
				System.out.println("User Information");
				System.out.println("Name: " + fullName);
				System.out.println("College Attended: " + collegeName);
				System.out.println("Age: " + userAge);
				
				//formating so the distance walked is shown in two decimal places
				DecimalFormat fmt = new DecimalFormat("0.##");
				System.out.println("Daily distance walked: " + fmt.format(avgMilesWalked) + "miles");
				System.out.println();
			
				//depending if the user reached the MINIMUN_MILES_THRESHOUL the output will change.
				if (avgMilesWalked >= MINIMUN_MILES_THRESHOLD) {
					System.out.println("You walked an average of more than two miles a day this week! Good job!");
				} else {
					System.out.println("You walked an average of less than two miles this week. Try to walk more next week! You can do it!");
				}

				//asks the user if they would like to run the program again
				System.out.println();
				System.out.print("Would you like to enter a new user? type 1 for yes, anything else for no: ");
				goAgain = scan.nextInt();
				
		}
		while (goAgain == 1);
		
		System.out.println("Program terminated. Have a good day!");
				
				
				
	}

}
