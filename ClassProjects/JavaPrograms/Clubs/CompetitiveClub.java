
public class CompetitiveClub extends FunClub
{

	private int numberWins = 0; 
	private String leagueName;
	private boolean hasPlayoff;

	public CompetitiveClub (int number, String name, double b, String d, int n, String l, boolean p)
	{
		super(number, name, b, d, n);
		leagueName = l;
		hasPlayoff = p;
	
	}


	public int getNumberWins()
	{
		return numberWins;
	}
	
	public void increaseNumberWins()
	{
		numberWins++;
	}
	
	public String getLeagueName()
	{
		return leagueName;
	}
	
	public void setLeagueName(String league)
	{
		leagueName = league;
	}
	
	public boolean getHasPlayoff()
	{
		return hasPlayoff;
	}
	


}