package Hrms.HrmsProject.bussines.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.UserService;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.UserDao;
import Hrms.HrmsProject.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccesResult("Eklendi");
	}
	
	

}
