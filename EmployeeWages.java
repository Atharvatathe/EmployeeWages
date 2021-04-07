import java.util.*;

public class EmployeeWages implements IcomputeEmpWage 
{
	
	public static final int IS_PRESENT_PART_TIME = 1;
	public static final int IS_PRESENT_FULL_TIME = 2;
	public int dailyWage = 0;
	
	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	
	public EmployeeWages()
	{
		companyEmpWageList = new LinkedList<>();;
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth)
    {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour,numOfworkingDays,maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
	}
	
	
	public void computeEmpWage()
	{
		for(int i = 0; i < companyEmpWageList.size(); i++)
		{
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
		
	}
	
	
	public int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		int empHrs=0, totalEmpHrs=0, totalworkingDays=0;
		while((totalEmpHrs < companyEmpWage.maxHoursPerMonth ) && ( totalworkingDays < companyEmpWage.numOfworkingDays))
		{
			totalworkingDays++;
			int empcheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empcheck)
			{
				case IS_PRESENT_PART_TIME:
					empHrs = 4;
					break ;
			
				case IS_PRESENT_FULL_TIME:
					empHrs = 8;
					break;
			
				default:
					empHrs=0;
					break;
			}
			
		
			totalEmpHrs += empHrs;
			dailyWage = empHrs * companyEmpWage.empRatePerHour ;
			System.out.println("TotalWrking Days: " +totalworkingDays  + "Emp Hr: " +empHrs);
			System.out.println("Daily wages: " +dailyWage); 
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
		
	}
	
	
	public static void main(String[] args)
	{

		IcomputeEmpWage empWageBuilder = new EmployeeWages();
		empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Relince",30,4,20);
		
		empWageBuilder.computeEmpWage();
	}
}


