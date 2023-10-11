
public class FunClub extends Club
{

	String description;
	int numberFunEventsPlanned;

	public FunClub (int number, String name, double b, String d, int n)
	{
		super(number, name, b);
		description = d;
		numberFunEventsPlanned = n;
	
	}

	public String getDescription()
	{
		return description;
	}
	
	public int getNumberFunEventsPlanned()
	{
		return numberFunEventsPlanned;
	}
	
	

}