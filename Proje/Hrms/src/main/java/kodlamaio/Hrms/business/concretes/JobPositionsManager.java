package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobPositionsService;
import kodlamaio.Hrms.dateAccess.abstracts.JobPositionsDao;
import kodlamaio.Hrms.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService {
	private JobPositionsDao jobPositionsDao;

	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}

	@Override
	public List<JobPositions> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionsDao.findAll();
	}

	

	
	
}
