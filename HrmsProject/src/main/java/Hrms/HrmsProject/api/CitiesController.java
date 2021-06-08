package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.CitiesService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.dataAcces.abstracts.CitiesDao;
import Hrms.HrmsProject.entities.concretes.Cities;
import lombok.Data;


@RestController
@RequestMapping("/api/citiescontroller")
public class CitiesController {
	private CitiesService citiesService;

	public CitiesController(CitiesService citiesService) {
		super();
		this.citiesService = citiesService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<Cities>> getall(){
		return this.citiesService.getall();
	}
	

}
