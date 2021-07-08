package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.JobPostingService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.JobPostingDao;
import Hrms.HrmsProject.entities.concretes.JobPosting;
import Hrms.HrmsProject.entities.concretes.dtos.JobRequirement;

@Service
public class JobPostingManager implements JobPostingService {
    private JobPostingDao jobPostingDao;

    @Autowired
    public JobPostingManager(JobPostingDao jobPostingDao) {
        this.jobPostingDao = jobPostingDao;
    }


    @Override
    public Result add(JobPosting jobPosting) {
       this.jobPostingDao.save(jobPosting);
        return new SuccesResult("İş eklendi");
    }

    @Override
    public DataResult<List<JobPosting>> getall() {
        return new SuccesDataResult<List<JobPosting>>(this.jobPostingDao.findAll(),"Listelendi");
    }

    @Override
    public DataResult<List<JobRequirement>> getAllActiveJob() {
        return new SuccesDataResult<List<JobRequirement>>(this.jobPostingDao.getAllActiveJob(),"Listelendi");
    }

    @Override
    public DataResult<List<JobRequirement>> getListJobByDate() {
        return new SuccesDataResult<List<JobRequirement>>(this.jobPostingDao.getListJobByDate());
    }

    @Override
    public DataResult<List<JobRequirement>> getJobByCompanyName(String companyName) {
        return new SuccesDataResult<List<JobRequirement>>(this.jobPostingDao.getJobByCompanyName(companyName));
    }

    /*
    @Override
    public DataResult<List<CandidateWithCvTable>> getByEmployerWithJobPosting() {
        return new SuccesDataResult<List<CandidateWithCvTable>>(this.jobPostingDao.getByEmployerWithJobPosting());
    }
    @Override
    public DataResult<List<JobPosting>> getByActiveJobWithCompanyName(String companyName) {
        return new SuccesDataResult<List<JobPosting>>(this.jobPostingDao.getByActiveJobWithCompanyName(companyName));
    }
    @Override
    public DataResult<List<JobRequriment>> getAllActiveJob() {
        return new SuccesDataResult<List<JobRequriment>>(this.jobPostingDao.getAllActiveJob());
    }
    @Override
    public DataResult<List<JobRequriment>> getJobListByDate() {
        return new SuccesDataResult<List<JobRequriment>>(this.jobPostingDao.getJobListByDate());
    }
     */


}