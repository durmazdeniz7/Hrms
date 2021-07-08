package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {
	  Result add(ForeignLanguage foreignLanguage);
	    DataResult<List<ForeignLanguage>> getall();
}
