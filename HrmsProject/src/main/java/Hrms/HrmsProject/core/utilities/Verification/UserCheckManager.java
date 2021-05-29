package Hrms.HrmsProject.core.utilities.Verification;

import java.time.LocalDate;

import org.springframework.stereotype.Service;


@Service
public class UserCheckManager implements UserCheckService {

	@Override
	public boolean isVerified(String nationaltyId, String name, String lastName, LocalDate dateOfBirth) {
		// TODO Auto-generated method stub
		return true;
	}

	

	

}
