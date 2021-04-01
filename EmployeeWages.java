public class EmployeeWages
{
 public static void main(String[] args)
	public static void main(String[] args)
	{
		int IS_PRESENT_FULL_TIME = 1;
		int IS_PRESENT_PART_TIME = 2;
		int EMP_RATE_PER_HR = 20;
		int MAX_WORKING_DAYS=20;
		int MAX_WORKING_HOUR=100;
		
		int totalworkingHours=0 ;
		int totalworkingDays=0 ;
 		int salary = 0;
		int empHrs;
		
		
		while((totalworkingDays < MAX_WORKING_DAYS ) && ( totalworkingHours < MAX_WORKING_HOUR))
		{
		
			int empcheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empcheck)
			{
				case 1:
					empHrs = 8;
					totalworkingHours= totalworkingHours + empHrs ;
					totalworkingDays++;
					break ;
			
				case 2:
					empHrs = 4;
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
		salary = totalworkingHours * EMP_RATE_PER_HR; 
		System.out.println("salary :"+salary);
	}
}


