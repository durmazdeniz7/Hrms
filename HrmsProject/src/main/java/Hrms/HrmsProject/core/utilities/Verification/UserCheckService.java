package Hrms.HrmsProject.core.utilities.Verification;

import java.time.LocalDate;


public interface UserCheckService {
	boolean isVerified(String nationaltyId,String name,String lastName,LocalDate dateOfBirth);

}
