

public class Club
{

	private int numberMembers;
	private String nameOfClub;
	private double budgetAmount;
	
	
	public Club(int number, String name, double b)
	{
		numberMembers = number;
		nameOfClub = name;
		budgetAmount = b;
	}
	
	public Club(int number, String name) // overloaded constructor
	{
		this(number, name, 100); // default $100 budget
	}

	public String getNameOfClub()
	{
		return nameOfClub;
	}
	
	public int getNumberMembers()
	{
		return numberMembers;
	}
	
	public double getBudgetAmount()
	{
		return budgetAmount;
	}


}