

public class ClubDriver
{

	public static void main(String[] args)
	{

		Club myClub = new Club(10, "Cool Club", 200);
		System.out.println("Name: " + myClub.getNameOfClub());
		System.out.println("Memebers in club: " + myClub.getNumberMembers());
		System.out.println("Club budget: " + myClub.getBudgetAmount());

//******************************************************************************

		Club myClub2 = new Club(5, "Nerds");
		System.out.println("Name: " + myClub2.getNameOfClub());
		System.out.println("Memebers in club: " + myClub2.getNumberMembers());
		System.out.println("Club budget: " + myClub2.getBudgetAmount());

//******************************************************************************

		ServiceClub myServiceClub = new ServiceClub(10, "Crisis Nursery", 200, "young children from broken homes");
		System.out.println("Name: " + myServiceClub.getNameOfClub());
		System.out.println("Memebers in club: " + myServiceClub.getNumberMembers());
		System.out.println("Club budget: " + myServiceClub.getBudgetAmount());
		System.out.println("Current target group: " + myServiceClub.getServiceTargetGroup());
		myServiceClub.setServiceTargetGroup();
		System.out.println("New target group: " + myServiceClub.getServiceTargetGroup());
		System.out.println("Current total service hours: " + myServiceClub.getTotalNumberServiceHours());
		myServiceClub.setTotalNumberServiceHours();
		System.out.println("New total service hours: " + myServiceClub.getTotalNumberServiceHours());

//******************************************************************************

		FunClub myFunClub = new FunClub(10, "Goofballs", 200, "Doing random things and enjoying doing it", 5);
		System.out.println("Name: " + myFunClub.getNameOfClub());
		System.out.println("Memebers in club: " + myFunClub.getNumberMembers());
		System.out.println("Club budget: " + myFunClub.getBudgetAmount());
		System.out.println("Club description: " + myFunClub.getDescription());
		System.out.println("Number of fun events planned: " + myFunClub.getNumberFunEventsPlanned());

//******************************************************************************

		CompetitiveClub myCompetitiveClub = new CompetitiveClub(10, "MTG Club", 200, "Bullying small children", 10, "M30", false);
		System.out.println("Name: " + myCompetitiveClub.getNameOfClub());
		System.out.println("Memebers in club: " + myCompetitiveClub.getNumberMembers());
		System.out.println("Club budget: " + myCompetitiveClub.getBudgetAmount());
		System.out.println("Club description: " + myCompetitiveClub.getDescription());
		System.out.println("Number of fun events planned: " + myCompetitiveClub.getNumberFunEventsPlanned());
		System.out.println("Current number of wins: " + myCompetitiveClub.getNumberWins());
		myCompetitiveClub.increaseNumberWins();
		System.out.println("New number of wins: " + myCompetitiveClub.getNumberWins());
		System.out.println("Current league name: " + myCompetitiveClub.getLeagueName());
		myCompetitiveClub.setLeagueName("Destory WoTC");
		System.out.println("New league name: " + myCompetitiveClub.getLeagueName());
		System.out.println("Currently in playoffs: " + myCompetitiveClub.getHasPlayoff());


	}
}
