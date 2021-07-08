package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobExperiment;


public interface JobExperimentService {
    Result  add(JobExperiment jobExperiment);
    DataResult<List<JobExperiment>> getall();
    DataResult<List<JobExperiment>> getallSorted();
}
