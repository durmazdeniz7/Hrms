package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.Employer;

public interface EmployerService {
	Employer getByEmail(String email);

	DataResult<List<Employer>> getall();

	Result add(Employer employer);
	
	
}
