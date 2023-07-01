package Appointment;
import java.util.Scanner;

/**
 * This class tests the AppointmentCalendar Class.
 */
public class Tester
{
	public static void main(String[] args)
	{
		Appointment myAppt = new Appointment(new Date(1,4,2021),
				new Time(10,15), new Time(10,30), "CS CLASS");
		Appointment myApptTwo = new Appointment(new Date(1,4,2021),
				new Time(10,15), new Time(10,30), "DS CLASS");
		AppointmentCalendar myCalendar = new AppointmentCalendar();
		myCalendar.addAppointment(myAppt);
		myCalendar.addAppointment(myApptTwo);
		Scanner in = new Scanner(System.in);
		String inputAsText;
		do
		{
			do
			{
				System.out.print("(A) - to add appointment\r(D) - to delete appointment\r(N) - to see appointments\r(X) - to exit program\rEnter Selection: ");
				inputAsText = in.nextLine();
			}while(!inputAsText.toUpperCase().trim().equals("A") && !inputAsText.toUpperCase().trim().equals("D") && !inputAsText.toUpperCase().trim().equals("N") && !inputAsText.toUpperCase().trim().equals("X"));
			
			if(inputAsText.toUpperCase().trim().equals("A"))
			{
				System.out.print("Please enter the appointment description: ");
				String description = in.nextLine();
				System.out.print("Please enter day of appointment: ");
				int day = in.nextInt();
				System.out.print("Please enter month of appointment: ");
				int month = in.nextInt();
				System.out.print("Please enter year of appointment: ");
				int year = in.nextInt();
				System.out.print("Please enter start hour: ");
				int shour = in.nextInt();
				System.out.print("Please enter start min: ");
				int smin = in.nextInt();
				System.out.print("Please enter end hour: ");
				int ehour = in.nextInt();
				System.out.print("Please enter end min: ");
				int emin = in.nextInt();
				if(myCalendar.addAppointment(new Appointment(new Date(day,month,year),
				new Time(shour,smin), new Time(ehour,emin), description)))
				{
					System.out.println("Appointment added!");
				}
				else System.out.println("There was a problem adding your appointment!");
			}
			else if(inputAsText.toUpperCase().trim().equals("D"))
			{
				System.out.println("Which index would you like to remove? ");
				int index = in.nextInt();
				myCalendar.removeAppointment(index);
				System.out.println("Appointment removed!");
			}
			else if(inputAsText.toUpperCase().trim().equals("N"))
			{
				System.out.println(myCalendar.toString());
			}
				
			System.out.print("Would you like to go again? (Y/N): ");
			do
			{
				inputAsText = in.nextLine();
				if(inputAsText.toUpperCase().trim().equals("N")) 
					{
						inputAsText = "X";
						break;
					}
			}while(!inputAsText.toUpperCase().trim().equals("Y") && !inputAsText.toUpperCase().trim().equals("N"));

			
		} while(!inputAsText.toUpperCase().trim().equals("X"));
	}
}
