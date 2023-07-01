package Appointment;

public class Appointment
{
	private Date appointmentDate;
	private Time startTime;
	private Time endTime;
	private String description;
	
	public Appointment()
	{
		this.appointmentDate = new Date();
		this.startTime = new Time();
		this.endTime = new Time();
		this.description = "Defualt Appointment";
	}
	
	public Appointment(Date appointmentDate, Time startTime, Time endTime, String description)
	{
		this.appointmentDate = appointmentDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
	}
	
	public String toString()
	{
		return this.description + " " + this.appointmentDate
				+ " " + this.startTime + " " + this.endTime;
	}
	
	public Time getStartTime()
	{
		return this.startTime;
	}
	
	public Time getEndTime()
	{
		return this.endTime;
	}
	
	public String getAppointmentDate()
	{
		return this.appointmentDate.toString();
	}
	
	public int getDay()
	{
		return this.appointmentDate.getDay();
	}

}
