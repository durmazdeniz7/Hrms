package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.JobExperinceService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobExperice")
public class JobExperinceControllers {
	private JobExperinceService jobExperinceService;

	@Autowired
	public JobExperinceControllers(JobExperinceService jobExperinceService) {
		super();
		this.jobExperinceService = jobExperinceService;
	}

	@RequestMapping("/getall")

	public DataResult<List<JobExperience>> getall() {
		return this.jobExperinceService.getall();
	}
	
	@PostMapping("/add")
	public Result add(JobExperience jobExperience) {
		return this.jobExperinceService.add(jobExperience);
	}

}
