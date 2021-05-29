package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.EmployerService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.ErrorResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.EmployerDao;
import Hrms.HrmsProject.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {

		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Employer>>(this.employerDao.findAll(),"İş verenler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if (this.employerDao.findByEmail(employer.getEmail())!=null) {
			return new ErrorResult("Email adresi zaten zayıtlı");
		}
		this.employerDao.save(employer);
		return new SuccesResult("İş veren eklendi");
	}

}
