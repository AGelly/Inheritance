
public class TeamLeader extends Employee
{
	private double bonus;
	private int reqTraining;
	private int attended;
	
	public TeamLeader(String n, String num, String date, double b, int req, int attend)
	{
		super(n, num, date);
		bonus = b;
		reqTraining = req;
		attended = attend;
	}
	
	public TeamLeader()
	{
		
	}
	
	public void setBonus(double b)
	{
		bonus = b;
	}
	
	public void setReqTraining(int req)
	{
		reqTraining = req;
	}
	
	public void setAttended(int a)
	{
		attended = a;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	public int getReqTraining()
	{
		return reqTraining;
	}
	
	public int getAttended(int a)
	{
		return attended;
	}
	
	public String toString()
	{
		return  super.toString() + "\nBonus: " + bonus + "\nRequired # of training hours: " + reqTraining + "\nHours Attended: " + attended; 
	}
}
