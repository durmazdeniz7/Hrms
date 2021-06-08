package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.CitiesService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.dataAcces.abstracts.CitiesDao;
import Hrms.HrmsProject.entities.concretes.Cities;

@Service
public class CitiesManager implements CitiesService{
private CitiesDao citiesDao;

@Autowired
	public CitiesManager(CitiesDao citiesDao) {
	super();
	this.citiesDao = citiesDao;
}

	@Override
	public DataResult<List<Cities>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Cities>>(this.citiesDao.findAll(),"Şehirler listelendi");
	}

}
