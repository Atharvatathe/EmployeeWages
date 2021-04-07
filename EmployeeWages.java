public class EmployeeWages
{
	
	public static final int IS_PRESENT_PART_TIME = 1;
	public static final int IS_PRESENT_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeeWages()
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth)
    {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfworkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	
	
	private void companyDetails()
	{
		for(int i = 0; i < numOfCompany; i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.companyDetails(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
		
	}
	
	
	private int companyDetails(CompanyEmpWage companyEmpWage)
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
			System.out.println("TotalWrking Days: " +totalworkingDays  + "Emp Hr: " +empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
		
	}
	
	
	public static void main(String[] args)
	{

		EmployeeWages empWageBuilder = new EmployeeWages();
		empWageBuilder.addCompanyEmpWage("Dmart",20,20,100);
		empWageBuilder.addCompanyEmpWage("Relince",30,20,100);
		
		empWageBuilder.companyDetails();
	}
}


