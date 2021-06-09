package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.PrograminLanguageService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ProgramingLanguage;

@RestController
@RequestMapping("/api/programingcontrollers")
public class ProgramingControllers {
	private PrograminLanguageService programinLanguageService;

	@Autowired
	public ProgramingControllers(PrograminLanguageService programinLanguageService) {
		super();
		this.programinLanguageService = programinLanguageService;
	}
	
	
	@RequestMapping("/getall")
	public DataResult<List<ProgramingLanguage>> getall(){
		return this.programinLanguageService.getAll();
	}
	@PostMapping("/add")
	public Result add(ProgramingLanguage programingLanguage) {
		return this.programinLanguageService.add(programingLanguage);
	}
	

}
