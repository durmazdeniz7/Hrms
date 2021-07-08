package Hrms.HrmsProject.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.JobExperimentService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobExperiment;


@RestController
@RequestMapping("/api/jobexperiment")
public class JobExperimentControllers {
    private JobExperimentService jobExperimentService;

    @Autowired
    public JobExperimentControllers(JobExperimentService jobExperimentService) {
        this.jobExperimentService = jobExperimentService;
    }
    @PostMapping("/add")
    public Result add(JobExperiment jobExperiment){
        return this.jobExperimentService.add(jobExperiment);
    }
    @RequestMapping("/getall")
    public DataResult<List<JobExperiment>>getall(){
        return this.jobExperimentService.getall();
    }

    @RequestMapping("/getallsorted")
    public DataResult<List<JobExperiment>> getallSorted(){
        return this.jobExperimentService.getallSorted();
    }
}