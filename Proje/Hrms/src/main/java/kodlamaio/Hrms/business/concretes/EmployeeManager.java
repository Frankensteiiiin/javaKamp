package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.dateAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	private EmployeeDao employeDao;

	@Autowired
	public EmployeeManager(EmployeeDao employeDao) {
		super();
		this.employeDao = employeDao;
	}

	@Override
	public List<Employee> getAll() {
		return this.employeDao.findAll();
	}

}
