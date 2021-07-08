package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobPosition;

public interface JobPositionService {
	JobPosition findByJobName(String jobName);
    Result add(JobPosition jobPosition);
    DataResult<List<JobPosition>> getall();

}
