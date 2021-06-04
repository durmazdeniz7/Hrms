package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.JobTitleService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobTitle;
import Hrms.HrmsProject.entities.concretes.Dtos.JobTitleWithEmployer;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitleControllers {
	private JobTitleService jobTitleService;

	@Autowired
	public JobTitleControllers(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<JobTitle>> getall(){
		return this.jobTitleService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
	
}
