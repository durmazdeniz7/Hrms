package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.SchoolService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.SchoolDao;
import Hrms.HrmsProject.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {
	private SchoolDao schoolDao;

	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccesResult("Okul eklendi");
	}

	@Override
	public DataResult<List<School>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<School>>(this.schoolDao.findAll(), "Okullar listelendi");
	}

}
