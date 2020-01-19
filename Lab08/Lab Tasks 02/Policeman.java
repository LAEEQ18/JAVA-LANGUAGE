import java.text.*;
public abstract class Policeman
{
	private String firstName;
	private String lastName;
	private int yearsOfService;
	DecimalFormat dos = new DecimalFormat("0.00");
	public Policeman(String first, String last,int y)
	{
		firstName = first;
		lastName = last;
		yearsOfService = y;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getYearsOfService()
	{
		return yearsOfService;
	}
	public String toString()
	{
		return firstName +" " + lastName + "\n" +"years of service = " +yearsOfService;
	}
	public abstract double earnings();
	public abstract int benefitLevel();
	public abstract String getRank();
	public abstract double getBasePay();
	}// end class Policeman