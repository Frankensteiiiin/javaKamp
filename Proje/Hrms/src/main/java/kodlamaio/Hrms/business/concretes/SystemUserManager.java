package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.SystemUserService;
import kodlamaio.Hrms.dateAccess.abstracts.SystemUsersDao;
import kodlamaio.Hrms.entities.concretes.SystemUsers;

@Service
public class SystemUserManager implements SystemUserService {
	private SystemUsersDao systemUserDao;

	@Autowired
	public SystemUserManager(SystemUsersDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	public List<SystemUsers> getAll() {
		return this.systemUserDao.findAll();
	}
}
