public class EmployeeWages
{
	
	public static final int IS_PRESENT_PART_TIME = 1;
	public static final int IS_PRESENT_FULL_TIME = 2;
	public	int totalworkingHours=0 ;
	public	int totalworkingDays=0 ;
 	public	int salary = 0;
	public	int empHrs=0;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfworkingDays;
	private final int maxHoursPerMonth;
    
	
	public EmployeeWages(String company,int empRatePerHour,int numOfworkingDays,int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfworkingDays = numOfworkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	
	}
	
	public void companyDetails(EmployeeWages obj)
	{
		
		while((totalworkingDays < obj.numOfworkingDays ) && ( totalworkingHours < obj.maxHoursPerMonth))
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
		salary = totalworkingHours * obj.empRatePerHour; 
		System.out.println("Employee salary of Company " + obj.company + " is " +salary);
		
	}
	
	
	public static void main(String[] args)
	{

		EmployeeWages dMart = new EmployeeWages("Dmart",20,20,100);
		EmployeeWages relince = new EmployeeWages("Relince",30,20,100);
		EmployeeWages tata = new EmployeeWages("TATA",40,25,125);
		
		dMart.companyDetails(dMart);
		tata.companyDetails(tata);
		relince.companyDetails(relince);
		
	}
}


