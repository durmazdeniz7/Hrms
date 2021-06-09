package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.PrograminLanguageService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.ProgramingLanguageDao;
import Hrms.HrmsProject.entities.concretes.ProgramingLanguage;

@Service
public class ProgramingLanguageManager implements PrograminLanguageService {
	private ProgramingLanguageDao programingLanguagaeDao;

	@Autowired
	public ProgramingLanguageManager(ProgramingLanguageDao programingLanguagaeDao) {
		super();
		this.programingLanguagaeDao = programingLanguagaeDao;
	}

	@Override
	public DataResult<List<ProgramingLanguage>> getAll() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<ProgramingLanguage>>(this.programingLanguagaeDao.findAll(), "Listelendi");
	}

	@Override
	public Result add(ProgramingLanguage programingLanguage) {
		this.programingLanguagaeDao.save(programingLanguage);
		return new SuccesResult("eklendi");
	}

}
