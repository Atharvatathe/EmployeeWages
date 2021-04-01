public class EmployeeWages
{
   public static void main(String[] args)
	{
		int IS_PRESENT=1;
		int EMP_RATE_PER_HR=20;
		int empHrs=8;
		int salary;
		double empcheck = Math.floor(Math.random() * 10) % 2;

		if(IS_PRESENT == empcheck)
		{
			salary = empHrs * EMP_RATE_PER_HR ;
		}
		else
			salary=0;

		System.out.println("Salary: " +salary);
}


