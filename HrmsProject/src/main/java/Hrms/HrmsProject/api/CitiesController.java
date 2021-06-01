package Hrms.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.CitiesService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.Cities;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	private CitiesService citiesService;

	@Autowired
	public CitiesController(CitiesService citiesService) {
		// TODO Auto-generated constructor stub
		this.citiesService = citiesService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Cities>> getall(){
		return this.citiesService.getall();
	}
	@PostMapping("/add")
	public Result add(Cities cities) {
		return this.citiesService.add(cities);
	}
}
