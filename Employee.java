public class Employee {

	private String name;
	private String employeeNumber;
	private String hireDate;
	
	public Employee(String n, String num, String date)
	{
		name = n;
		employeeNumber = num;
		hireDate = date;
	}
	
	public Employee()
	{
		
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setEmployeeNumber(String e)
	{
		employeeNumber = e;
	}
	
	public void setHireDate(String h)
	{
		hireDate = h;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmployeeNumber()
	{
		return employeeNumber;
	}
	
	public String getHireDate()
	{
		return hireDate;
	}
	
	public String toString()
	{
		return "Name of Employee: " + name + "\nEmployee #: " + employeeNumber + "\n" +
			   "Hire Date: " + hireDate; 
	}
}
