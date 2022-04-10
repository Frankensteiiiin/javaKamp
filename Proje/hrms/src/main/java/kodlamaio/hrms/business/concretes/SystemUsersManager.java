package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.dateAccess.abstracts.SystemUsersDao;
import kodlamaio.hrms.entities.concretes.SystemUsers;

@Service
public class SystemUsersManager implements SystemUserService{

	private SystemUsersDao systemUsersDao;

	@Autowired
	public SystemUsersManager(SystemUsersDao systemUsersDao) {
		super();
		this.systemUsersDao = systemUsersDao;
	}
	@Override
	public List<SystemUsers> getAll() {
		return systemUsersDao.findAll();
	}

}
