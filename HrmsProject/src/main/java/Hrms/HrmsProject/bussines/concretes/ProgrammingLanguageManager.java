package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.ProgrammingLanguageService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.ProgramingLanguageDao;
import Hrms.HrmsProject.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgramingLanguageDao programmingLanguageDao;
    @Autowired
    public ProgrammingLanguageManager(ProgramingLanguageDao programmingLanguageDao) {
        this.programmingLanguageDao = programmingLanguageDao;
    }

    @Override
    public Result add(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguageDao.save(programmingLanguage);
        return new SuccesResult("Eklendi");
    }

    @Override
    public DataResult<List<ProgrammingLanguage>> getall() {
        return new SuccesDataResult<List<ProgrammingLanguage>>(programmingLanguageDao.findAll(), "Listelendi");
    }
}
