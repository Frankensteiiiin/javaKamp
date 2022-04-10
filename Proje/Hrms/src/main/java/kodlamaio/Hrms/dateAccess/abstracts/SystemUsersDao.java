package kodlamaio.hrms.dateAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemUsers;

public interface SystemUsersDao extends JpaRepository<SystemUsers, Integer>{

}
