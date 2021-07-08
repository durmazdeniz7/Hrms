package Hrms.HrmsProject.bussines.concretes;

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

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }


    @Override
    public Employer findByEmail(String email) {
        return this.employerDao.findByEmail(email);
    }

    @Override
    public Result add(Employer employer) {
        if (this.findByEmail(employer.getEmail()) !=null) {
            return new ErrorResult("Daha önce kayıtlı email var");
        }
        this.employerDao.save(employer);
        return new SuccesResult("Eklendi");
    }

    @Override
    public DataResult<List<Employer>> getall() {
        return new SuccesDataResult<List<Employer>>(this.employerDao.findAll(),"Listelendi");
    }
}
