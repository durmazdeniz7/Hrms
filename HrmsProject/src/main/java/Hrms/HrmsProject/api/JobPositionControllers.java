package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.JobPositionService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositionControllers")
public class JobPositionControllers {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionControllers(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }
    @PostMapping("/add")
    public Result add(JobPosition jobPosition){
        return this.jobPositionService.add(jobPosition);
    }
    @RequestMapping("/getall")
    public DataResult<List<JobPosition>> getall(){
        return this.jobPositionService.getall();
    }
}
