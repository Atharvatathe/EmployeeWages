public class EmployeeWages
{
 public static void main(String[] args)
	{
		int IS_PRESENT_FULL_TIME = 1;
		int IS_PRESENT_PART_TIME = 2;
		int EMP_RATE_PER_HR = 20;
		int salary = 0;
		
		double empcheck = Math.floor(Math.random() * 10) % 3;
		
		if(IS_PRESENT_FULL_TIME == empcheck)
		{
			int empHrs = 8;
			salary = empHrs * EMP_RATE_PER_HR ;
			System.out.println("Full time employee Salary: " +salary);
		}
		else if(IS_PRESENT_PART_TIME == empcheck)
		{
			int empHrs = 4;
			salary = empHrs * EMP_RATE_PER_HR ;
			System.out.println("Part time employee Salary: " +salary);
		}
		else
		{
			salary=0;
		    System.out.println("no Salary: " +salary);
		}	
	}
}


