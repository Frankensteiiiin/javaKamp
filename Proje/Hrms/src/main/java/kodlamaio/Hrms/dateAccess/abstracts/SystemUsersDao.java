package kodlamaio.Hrms.dateAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.SystemUsers;

public interface SystemUsersDao extends JpaRepository<SystemUsers, Integer>{

}
