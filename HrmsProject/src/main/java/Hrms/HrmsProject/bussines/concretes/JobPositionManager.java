package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.JobPositionService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.ErrorResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.JobPositionDao;
import Hrms.HrmsProject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {

		if (this.getByJobName(jobPosition.getJobName())!=null) {
			return new ErrorResult("Aynı isimde iş pozisyonu var");
		}
		this.jobPositionDao.save(jobPosition);
		return  new SuccesResult("İş pozisyonu eklendi");
	}

	@Override
	public DataResult<List<JobPosition>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Sistemde kki genel iş pozisyonları listelendi");
	}

	@Override
	public JobPosition getByJobName(String jobName) {
		// TODO Auto-generated method stub
		return this.jobPositionDao.getByJobName(jobName);
	}

}
