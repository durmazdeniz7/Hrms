package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobPosting;
import Hrms.HrmsProject.entities.concretes.dtos.JobRequirement;

public interface JobPostingService {
	 Result add(JobPosting jobPosting);
	    DataResult<List<JobPosting>> getall();
	    DataResult<List<JobRequirement>> getAllActiveJob();
	    DataResult<List<JobRequirement>> getListJobByDate();
	    DataResult<List<JobRequirement>> getJobByCompanyName(String companyName);
	
}
