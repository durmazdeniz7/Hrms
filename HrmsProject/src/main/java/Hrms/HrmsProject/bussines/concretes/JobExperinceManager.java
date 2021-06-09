package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.JobExperinceService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.JobExperinceDao;
import Hrms.HrmsProject.entities.concretes.JobExperience;

@Service
public class JobExperinceManager implements JobExperinceService {
	private JobExperinceDao jobExperinceDao;

	@Autowired
	public JobExperinceManager(JobExperinceDao jobExperinceDao) {
		super();
		this.jobExperinceDao = jobExperinceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperinceDao.save(jobExperience);
		return new SuccesResult("EKLENDİ");
	}

	@Override
	public DataResult<List<JobExperience>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<JobExperience>>(this.jobExperinceDao.findAll(), "Listeledni");
	}

}
