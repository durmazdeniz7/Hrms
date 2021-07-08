package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.JobPositionService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.ErrorResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.JobPositionDao;
import Hrms.HrmsProject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
private JobPositionDao jobPositionDao;

@Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }


    @Override
    public JobPosition findByJobName(String jobName) {
        return this.jobPositionDao.findByJobName(jobName);
    }

    @Override
    public Result add(JobPosition jobPosition) {
    if (this.findByJobName(jobPosition.getJobName())!=null){

        return  new ErrorResult("Aynı isimde iş Pozisyonu var");
    }
    this.jobPositionDao.save(jobPosition);
        return new SuccesResult("İş pozisyonu Eklendi");
    }

    @Override
    public DataResult<List<JobPosition>> getall() {
        return new SuccesDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları listelendi");
    }
}