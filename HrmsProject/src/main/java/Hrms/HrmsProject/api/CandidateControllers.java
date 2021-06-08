package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.CandidateService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.Candidate;

@RestController
@RequestMapping("api/candidatecontrollers")
public class CandidateControllers {
	private CandidateService candidateService;

	@Autowired
	public CandidateControllers(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@PostMapping("/add")
	Result add(Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	@RequestMapping("/getall")
	public DataResult<List<Candidate>> getall(){
		return this.candidateService.getall();
	}

}
