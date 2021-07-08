package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.SchoolService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.School;

@RestController
@RequestMapping("/api/schoolControllers")

public class SchoolControllers {
    private SchoolService schoolService;

    @Autowired
    public SchoolControllers(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @RequestMapping("/getall")
    public DataResult<List<School>> getall(){
        return this.schoolService.getall();
    }
    @PostMapping("/Add")
    public Result add(School school){
        return this.schoolService.add(school);
    }

    @RequestMapping("/getallSorted")
    public DataResult<List<School>> getallSorted(){
        return this.schoolService.getallSorted(); }

}