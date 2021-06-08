package Hrms.HrmsProject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.HrmsProject.bussines.abstarcts.UserService;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.User;

@RestController
@RequestMapping("/api/usercontroller")
public class UsersConroler {
	private UserService userService;

	@Autowired
	public UsersConroler(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@PostMapping("/add")
	public Result add(User user) {
		return this.userService.add(user);
	}
	

}
