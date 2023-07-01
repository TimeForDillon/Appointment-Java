package Appointment;
/**
 * This class represents the date class.
 */
public class Date
{
	private int day;
	private int month;
	private int year;
	
	/**
	 * This constructs a defualt date.
	 */
	public Date()
	{
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	
	/**
	 * This constructs a date with the given information
	 * @param day day
	 * @param month month
	 * @param year year
	 */
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Retrieves the object data in string form.
	 */
	public String toString()
	{
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	/**
	 * Sets the day
	 * @param day day
	 */
	public void setDay(int day)
	{
		this.day = day;
	}
	
	/**
	 * Gets the day
	 * @return day
	 */
	public int getDay()
	{
		return this.day;
	}
	
	/**
	 * Sets the month
	 * @param month month
	 */
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	/**
	 * Gets the month
	 * @return month
	 */
	public int getMonth()
	{
		return this.month;
	}
	
	/**
	 * Sets the year
	 * @param year year
	 */
	public void setYear(int year)
	{
		this.year = year;
	}
	
	/**
	 * Gets the year
	 * @return year
	 */
	public int getYear()
	{
		return this.year;
	}
}
