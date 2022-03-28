package inheritance;

public class Main {

	public static void main(String[] args) {
		Custemer custemer=new Custemer();
		custemer.firstName="custemer";
		Employee employee=new Employee();
		employee.firstName="employee";
		CustemerManager custemerManager=new CustemerManager();
		custemerManager.add(custemer);
		EmployeeManager employeeManager=new EmployeeManager();
		employeeManager.add(employee);
		employeeManager.BestEmloyee();
	}

}
