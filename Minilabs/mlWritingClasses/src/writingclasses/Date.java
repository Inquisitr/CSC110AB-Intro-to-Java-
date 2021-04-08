package writingclasses;//	.	........

public class Date
{
	//class data - generally private
	private int day;
	private int month;
	private int year;

	//these are the methods that operate on the data
	//note: there is no main method (other classes will run the program)
	//note: methods are usually public
	//   it is public so anyone outside the class can call it
	//   it is not static because actual instances are set (not the class)
	//   it returns void, meaning nothing is returned
	//   it is expecting to receive 3 int arguments, call them theMonth, theDay, theYear
	//   it uses this format <public or private> <static or not> <return type> <name of method> <(what it receives)>

	//default constructor - sets month/day/year to 1/1/1959
	public Date()
	{
		month = 1;
		day = 1;
		year = 1959;
	}

	public void set(int theMonth, int theDay, int theYear)
	{
		month = theMonth;
		day = theDay;
		year = theYear;
	}

	//method called print
	public void print()
	{
		System.out.println(month + "/" + day + "/" + year);
	}

	//method called isLeapYear - returns true if its a leap year
	public boolean isLeapYear()
	{
		if (year % 4 == 0)
			return true;
		else
			return false;
	}
}