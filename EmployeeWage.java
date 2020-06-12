import java.util.Random;
public class EmployeeWage{
	public static void main(String arg[]){
		int empCheck,workingHr=0;
		int ratePerHr=20;
		int salary=0;
		Random random=new Random();
		empCheck=random.nextInt(3);
			if (empCheck == 0){
      		System.out.println("The Employee is Absent.");}
	    	else if (empCheck == 1){
			System.out.println("The Employee has Full-time.");
			workingHr=16;}
			else{
			System.out.println("The Employee has Part-time");
			workingHr=8;}
			
			salary=ratePerHr*workingHr;
			System.out.println("EmployeeWage:"+salary);
		}
}
