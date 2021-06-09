package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.ForeignLanguageService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.ForeignLanguageDao;
import Hrms.HrmsProject.entities.concretes.ForeginLanguage;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {
	private ForeignLanguageDao foreignLanguageDao;

	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public Result add(ForeginLanguage foreginLanguage) {
		this.foreignLanguageDao.save(foreginLanguage);
		return new SuccesResult("Yabancı Dil Eklendi");
	}

	@Override
	public DataResult<List<ForeginLanguage>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<ForeginLanguage>>(this.foreignLanguageDao.findAll(),
				"Yabancı Diller Listelendi");
	}

}
