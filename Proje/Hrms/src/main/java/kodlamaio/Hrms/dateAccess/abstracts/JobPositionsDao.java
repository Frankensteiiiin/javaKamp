package kodlamaio.Hrms.dateAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer>{

}
