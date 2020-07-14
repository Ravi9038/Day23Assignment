

class EmpCalDailyWagePartTime{

	public static void main(String [] args){

		int isPartTime = 2;
		int empRatePerHr = 20;
		int empHrsFullTime = 8;
		int empHrsPartTime = 4;
		int salary = 0;

		int randVal = (int) (Math.floor(Math.random()* 2)+1);


		if (randVal == isPartTime){

			salary = empHrsPartTime * empRatePerHr;
			System.out.println("Salary Part Time = "+salary);	
		}else{

			System.out.println("Employee Is Full Time");	
		}
	}
}
