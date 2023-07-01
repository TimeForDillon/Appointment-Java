package Appointment;
import java.util.ArrayList;

/**
 * This represents an appointment calendar
 */
public class AppointmentCalendar
{
	private ArrayList<Appointment> appointments;
	
	/**
	 * This constructs an AppointmentCalendar object
	 */
	public AppointmentCalendar()
	{
		this.appointments = new ArrayList<Appointment>();
	}
	
	/**
	 * This adds an appointment to the calendar.
	 * @param myAppt new appointment
	 * @return true if added
	 */
	public boolean addAppointment(Appointment myAppt)
	{
		boolean added = false;
		if(appointments.size()>0)
		{
			for(int i=0; i<appointments.size(); i++)
			{
				if(!appointments.get(i).getAppointmentDate().equals(myAppt.getAppointmentDate()))
						{
							if(!appointments.get(i).getEndTime().toString().equals(myAppt.getEndTime().toString()))
							{
								appointments.add(myAppt);
								added = true;
							}
						}
				else
					continue;
			}
		}
		else appointments.add(myAppt);
		return added;
	}
	
	/**
	 * Returns the appointments on a given day
	 * @param day day
	 * @return appointments on a given day
	 */
	public ArrayList<Appointment> appointmentsOnDay(int day)
	{
		ArrayList<Appointment> onDay = new ArrayList<Appointment>();
		for(int i=0; i<this.appointments.size(); i++)
		{
			if(this.appointments.get(i).getDay() == day)
			{
				onDay.add(this.appointments.get(i));
			}
		}
		return onDay;
	}
	
	/**
	 * Removes the selected appointment from the calendar.
	 * @param number appointment number
	 */
	public void removeAppointment(int number)
	{
		if(number <= this.appointments.size()-1)
		{
			this.appointments.remove(number);
		}
		else return;
	}
	
	/**
	 * Returns the object in string form
	 */
	public String toString()
	{
		return this.appointments.toString();
	}
}
