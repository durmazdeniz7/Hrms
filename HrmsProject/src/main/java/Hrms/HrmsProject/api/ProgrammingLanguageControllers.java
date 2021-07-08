package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.ProgrammingLanguageService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminlanguage")
public class ProgrammingLanguageControllers {
    private ProgrammingLanguageService programmingLanguageService;
    @Autowired
    public ProgrammingLanguageControllers(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;

    }
    @PostMapping("/add")
    public Result add(@RequestParam ProgrammingLanguage programmingLanguage){
      return this.programmingLanguageService.add(programmingLanguage);
    }
    @RequestMapping("/getall")
    public DataResult<List<ProgrammingLanguage>>getall(){
       return this.programmingLanguageService.getall();
    }
}