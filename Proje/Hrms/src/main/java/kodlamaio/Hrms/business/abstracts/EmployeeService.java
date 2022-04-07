package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}
