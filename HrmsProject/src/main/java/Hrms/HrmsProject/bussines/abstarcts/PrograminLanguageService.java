package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ProgramingLanguage;

public interface PrograminLanguageService {

	
DataResult<List<ProgramingLanguage>> getAll();
	
	Result add(ProgramingLanguage programingLanguage);
}
