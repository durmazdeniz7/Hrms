package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.User;

public interface UserService {
	   Result add(User user);
	    DataResult<List<User>> getall();
	    User findByEmail(String email);
}
