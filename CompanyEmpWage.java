interface IcomputeEmpWage
{
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
	
}



public class CompanyEmpWage
{
	public final String company;
	public final int empRatePerHour;
	public final int numOfworkingDays;
	public final int maxHoursPerMonth; 
	public int totalEmpWage;
	
	
	public CompanyEmpWage(String company,int empRatePerHour,int numOfworkingDays,int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfworkingDays = numOfworkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		totalEmpWage = 0;
	
	}
	
	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
		
	}
	
	public String toString()
	{
		return "Total Emp Wage for Company: "+company+" is: " +
				totalEmpWage;
	}
}