package Hrms.HrmsProject.core.utilities.Verification;

import java.util.Date;

import org.springframework.stereotype.Service;


@Service
public class UserCheckManager implements UserCheckService {

	@Override
	public boolean isVerified(String nationaltyId, String name, String lastName, Date dateOfBirth) {
		// TODO Auto-generated method stub
		return true;
	}

	

	

}
