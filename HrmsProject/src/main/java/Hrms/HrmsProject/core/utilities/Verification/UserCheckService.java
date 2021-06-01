package Hrms.HrmsProject.core.utilities.Verification;

import java.util.Date;


public interface UserCheckService {
	boolean isVerified(String nationaltyId,String name,String lastName,Date dateOfBirth);

}
