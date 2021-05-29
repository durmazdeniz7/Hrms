package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.EmployerService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employercontrolelr")
public class EmployerController {
	private EmployerService employerService;

	public EmployerController(EmployerService employerService) {

		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	
	public DataResult<List<Employer>> getall(){
		return this.employerService.getall();
	}

	@PostMapping("/add")
	public Result add(Employer employer) {
		return this.employerService.add(employer);
	}
}
