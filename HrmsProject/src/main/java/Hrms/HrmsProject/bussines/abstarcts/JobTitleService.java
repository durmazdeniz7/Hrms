package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<List<JobTitle>> getall();
	Result add(JobTitle jobTitle);

}
