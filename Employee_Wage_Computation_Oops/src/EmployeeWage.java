
public class EmployeeWage {
	
	static final int IS_FULL_TIME =1;
	static final int IS_PART_TIME =2;
	static final int EMP_RATE_PER_HRS=20;
	static final int NUM_OF_WORKING_DAYS=20;
	static final int MAX_HRS=100;

	
	
	public static int caliculateEmployWage() {
	int empHrs = 0;
	 int empWage = 0;
	 int totalEmpWage=0;
	 int totalEmpHrs=0;
	 int count=0;
	 while (totalEmpHrs <= MAX_HRS &&
	         count < NUM_OF_WORKING_DAYS) {
	     count++;
     int empCheck =(int) Math.floor(Math.random()* 10) % 3;
	 switch (empCheck){
	    case IS_PART_TIME:
	    empHrs=4;
	    break;
	    case IS_FULL_TIME:
	    empHrs=8;
	    break;
	    default:
	    empHrs=0;
	    }
	 totalEmpHrs += empHrs;
	 
//EMPLOYE WAGE
	 empWage=empHrs * EMP_RATE_PER_HRS;
	 System.out.println("Day#: "  + count + " Emp Hr: " +empHrs );
	 
	 System.out.println("  Emp Wage: " + empWage );
	 totalEmpWage += empWage;
// Total Employee Hours
	 System.out.println(totalEmpHrs );
	 
	 }
	
//PRINT EMPLOYEWAGE
	 System.out.println(" Total Emp Wage: " + totalEmpWage );
	 
	return totalEmpWage;
	
	
			
	}
	
	
	public static void main(String[]args){
//calling the Employe Wage
		caliculateEmployWage();
}
}
