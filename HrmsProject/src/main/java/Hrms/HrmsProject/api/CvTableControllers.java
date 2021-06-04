package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.CvTableService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.CvTable;

@RestController
@RequestMapping("/api/cvtable")
public class CvTableControllers {
	private CvTableService cvTableService;

	@Autowired
	public CvTableControllers(CvTableService cvTableService) {
		this.cvTableService = cvTableService;
	}

	@RequestMapping("/getall")
	public DataResult<List<CvTable>> gettall() {
		return this.cvTableService.gettall();
	}

	@PostMapping("/add")
	public Result add(CvTable cvtable) {
		return this.cvTableService.add(cvtable);
	}

}
