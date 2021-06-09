package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ForeginLanguage;

public interface ForeignLanguageService {
	Result add(ForeginLanguage foreginLanguage);
	DataResult<List<ForeginLanguage>> getall();
}
