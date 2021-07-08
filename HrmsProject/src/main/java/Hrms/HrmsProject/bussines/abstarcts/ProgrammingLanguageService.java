package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	
Result add(ProgrammingLanguage programmingLanguage);
DataResult<List<ProgrammingLanguage>>getall();
}
