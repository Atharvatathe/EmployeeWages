public class EmployeeWages
{
	
	public static final int IS_PRESENT_PART_TIME = 1;
	public static final int IS_PRESENT_FULL_TIME = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfworkingDays;
	private final int maxHoursPerMonth;
    
	
	public EmployeeWageObject(String company,int empRatePerHour,int numOfworkingDays,int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfworkingDays = numOfworkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	
	}
	
	public static void main(String[] args)
	{

		EmployeeWageObject dMart = new EmployeeWageObject("Dmart",20,20,100);
		
		int totalworkingHours=0 ;
		int totalworkingDays=0 ;
 		int salary = 0;
		int empHrs=0;
		
		while((totalworkingDays < dMart.numOfworkingDays ) && ( totalworkingHours < dMart.maxHoursPerMonth))
		{
		
			int empcheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empcheck)
			{
				case IS_PRESENT_PART_TIME:
					empHrs = 4;
					totalworkingHours= totalworkingHours + empHrs ;
					totalworkingDays++;
					break ;
			
				case IS_PRESENT_FULL_TIME:
					empHrs = 8;
					totalworkingHours= totalworkingHours + empHrs ;
					totalworkingDays++;
					break;
			
				default:
					empHrs=0;
					totalworkingHours= totalworkingHours + empHrs ;
					totalworkingDays++;
					break;
			}
			
		}
		salary = totalworkingHours * dMart.empRatePerHour; 
		System.out.println("Employee salary of Company " + dMart.company + " is " +salary);
	}
	

}


