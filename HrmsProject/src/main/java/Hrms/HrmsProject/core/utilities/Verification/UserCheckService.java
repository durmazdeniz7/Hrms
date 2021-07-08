package Hrms.HrmsProject.core.utilities.Verification;

import java.util.Date;

import Hrms.HrmsProject.entities.concretes.User;


public interface UserCheckService {
	boolean isVerified(User user);

}
