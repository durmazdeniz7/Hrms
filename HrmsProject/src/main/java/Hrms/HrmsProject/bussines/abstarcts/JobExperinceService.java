package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobExperience;

public interface JobExperinceService {
	Result add(JobExperience jobExperience);
	DataResult<List<JobExperience>> getall();
}
