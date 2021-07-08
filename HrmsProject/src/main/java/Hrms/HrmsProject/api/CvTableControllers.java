package Hrms.HrmsProject.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.CvTableServices;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.CvTable;
import Hrms.HrmsProject.entities.concretes.dtos.CandidateWithCvTable;

@RestController
@RequestMapping(name = "/api/cv_table")
public class CvTableControllers {
    private CvTableServices cvTableService;

    @Autowired
    public CvTableControllers(CvTableServices cvTableService) {
        this.cvTableService = cvTableService;
    }

    @PostMapping("/add")
    public Result add(CvTable cvTable) {
        return this.cvTableService.add(cvTable);

    }

    @RequestMapping("/getall")
    public DataResult<List<CvTable>> getall() {
        return this.cvTableService.getall();
    }


    @RequestMapping("/getByCandidateWithCvTable")
    public DataResult<List<CandidateWithCvTable>> getByCandidateWithCvTable(int id) {
        return this.cvTableService.getByCandidateWithCvTable(id);
    }


}
