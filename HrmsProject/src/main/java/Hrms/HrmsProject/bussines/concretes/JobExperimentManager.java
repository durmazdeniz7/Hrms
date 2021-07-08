package Hrms.HrmsProject.bussines.concretes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.JobExperimentService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.JobExperimentDao;
import Hrms.HrmsProject.entities.concretes.JobExperiment;

import java.util.List;

@Service
public class JobExperimentManager implements JobExperimentService {

    private JobExperimentDao jobExperimentDao;

    @Autowired
    public JobExperimentManager(JobExperimentDao jobExperimentDao) {
        this.jobExperimentDao = jobExperimentDao;
    }

    @Override
    public Result add(JobExperiment jobExperiment) {
        this.jobExperimentDao.save(jobExperiment);
        return new SuccesResult("Eklendi");
    }

    @Override
    public DataResult<List<JobExperiment>> getall() {

        return new SuccesDataResult<List<JobExperiment>>(jobExperimentDao.findAll(), "Listelendi");
    }

    @Override
    public DataResult<List<JobExperiment>> getallSorted() {
        Sort sort=Sort.by(Sort.Direction.DESC,"finishDate");
        return new SuccesDataResult<List<JobExperiment>>(this.jobExperimentDao.findAll(sort));
    }
}