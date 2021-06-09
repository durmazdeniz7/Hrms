package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.ForeignLanguageService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ForeginLanguage;

@RestController
@RequestMapping("/api/foreignlanguage")
public class ForeignLanguageControllers {
	private ForeignLanguageService foreignLanguageService;

	@Autowired
	public ForeignLanguageControllers(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}

	@RequestMapping("/getall")
	public DataResult<List<ForeginLanguage>> getall() {
		return this.foreignLanguageService.getall();
	}

	@PostMapping("/add")
	public Result add(ForeginLanguage foreginLanguage) {
		return this.foreignLanguageService.add(foreginLanguage);
	}
}
