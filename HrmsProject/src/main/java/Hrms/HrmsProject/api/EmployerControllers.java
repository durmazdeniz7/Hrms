package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.CitiesService;
import Hrms.HrmsProject.bussines.abstarcts.EmployerService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.Employer;

@RestController
@RequestMapping("/api/EmployerControllers")
public class EmployerControllers {
    private EmployerService employerService;
    private CitiesService citiesService;

@Autowired
    public EmployerControllers(EmployerService employerService, CitiesService citiesService) {
        this.employerService = employerService;
    this.citiesService = citiesService;
}
    @PostMapping("/Add")
    public Result add(@RequestBody Employer employer){
    return this.employerService.add(employer);
    }
    @RequestMapping("/getall")
    public DataResult<List<Employer>> getall(){
    return this.employerService.getall();
    }

}
