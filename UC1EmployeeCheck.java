
class EmployeeCheck{

	public static void main(String [] args){

		int empCheck = (int) (Math.floor(Math.random()*2+1));
		
		if (empCheck == 1){

			System.out.println("Employee is present");
		}else{

			System.out.println("Employee is Absent");
		}
	}
}
