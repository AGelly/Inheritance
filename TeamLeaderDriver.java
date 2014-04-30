
public class TeamLeaderDriver
{

	public static void main(String[] args)
	{
		
		TeamLeader Fisher = new TeamLeader("John Fisher", "887645", "10/05/1985", 25.00, 50, 10);
		Employee Andrew = new Employee("Andrew Gelstein", "88372", "10/11/1867");
		
		System.out.println(Andrew.toString());
		System.out.println(" ");
		System.out.println(Fisher.toString());
	}

}
