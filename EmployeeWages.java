public class EmployeeWages
{
 public static void main(String[] args)
	{
		int IS_PRESENT_FULL_TIME = 1;
		int IS_PRESENT_PART_TIME = 2;
		int EMP_RATE_PER_HR = 20;
		int salary = 0;
		
		
		int empcheck = (int)Math.floor(Math.random() * 10) % 3;
		
		switch(empcheck)
		{
			case 1:
				int empHrs = 8;
				salary = empHrs * EMP_RATE_PER_HR ;
				System.out.println("Full time employee Salary: " +salary);
				break ;
			
			case 2:
				empHrs = 4;
				salary = empHrs * EMP_RATE_PER_HR ;
				System.out.println("Part time employee Salary: " +salary);
				break;
			
			default:
				salary=0;
				System.out.println("no Salary: " +salary);
				break;
		}
	}
}


