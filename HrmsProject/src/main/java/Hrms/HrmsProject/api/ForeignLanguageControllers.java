package Hrms.HrmsProject.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.ForeignLanguageService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignlangugaecontrolles")
public class ForeignLanguageControllers {
    private ForeignLanguageService foreignLanguageService;

    @Autowired
    public ForeignLanguageControllers(ForeignLanguageService foreignLanguageService) {
        this.foreignLanguageService = foreignLanguageService;
    }

    @PostMapping("/add")
    public Result add(ForeignLanguage foreignLanguage){
        return this.foreignLanguageService.add(foreignLanguage);
    }
    @RequestMapping("/getall")
    public DataResult<List<ForeignLanguage>> getall(){
        return this.foreignLanguageService.getall();
    }
}