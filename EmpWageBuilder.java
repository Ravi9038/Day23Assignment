public interface IComputeEmpWage{

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}

public class CompanyEmpWage{

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth, int totalEmpWage){

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.totalEmpEage = totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage){

		this.totalEmpWage = totalEmpWage;
	}

	public String toString(){

		return "Total Emp Wage For Company : "+company + " is : "+totalEmpWage;
	}
}


public class EmpWageBuilder implements IComputeEmpWage {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;


	private int numOfCompany = 0;

	private LinkedList<CompanyWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilder(){

		companyEmpWageList.add = new LinkedList();
		companyTiEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPErMonth){

		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWage.put(company, CompanyEmpWage);
	}

	public void computeEmpWage(){

		for (int i= 0; i < companyEmpWageList.size(); i++){

			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			CompanyEmpWage.setTotalEmpWage(this.computeEmpWage(compaanyEmpWage));
			System.out.println(companyEmpWage);

		}
	}

	public int getTotalWage(String company){

		return companyToEmpWageMap.get(company).totalEmpWage;

	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage){

	}

	public static void main(String [] args){

		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage(company:"Dmart", empRatePerHour:20, numOfWorkingDays:2, maxHoursPerMonth:10);

		empWageBuilder.computeEmpWage();

		System.out.println("Total wage for dmart Company : "+empWageBuilder.getTotalWage(compant:"Dmart"));
	}

}
