package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.entities.concretes.SystemUsers;

public interface SystemUserService {
	List<SystemUsers> getAll();
}
