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

@RestController
@RequestMapping("/api/cvtable")
public class CvTableControllers {
	private CvTableServices cvTableServices;

	@Autowired
	public CvTableControllers(CvTableServices cvTableServices) {
		super();
		this.cvTableServices = cvTableServices;
	}

	@RequestMapping("/api/getall")
	public DataResult<List<CvTable>> getall() {
		return this.cvTableServices.getall();
	}

	@PostMapping("/Add")
	public Result add(CvTable cvTable) {
		return this.cvTableServices.add(cvTable);
	}

}
