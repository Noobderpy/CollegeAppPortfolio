
public class ServiceClub extends Club
{

	private String serviceTargetGroup;
	private int totalNumberServiceHours = 0; // intialized to zero at the beginning, no need to do this in the constructor

	public ServiceClub(int number, String name, double b, String target)
	{
		super(number,name, b); // call the parent class constructor
		serviceTargetGroup = target;

	}

	public String getServiceTargetGroup()
	{
		return serviceTargetGroup;
	}

	public void setServiceTargetGroup(String newTargetGroup)
	{
		serviceTargetGroup = newTargetGroup;
	}

	public int getTotalNumberServiceHours()
	{
		return totalNumberServiceHours;
	}

	public void setTotalNumberServiceHours(int n)
	{
		totalNumberServiceHours = n;
	}


}
