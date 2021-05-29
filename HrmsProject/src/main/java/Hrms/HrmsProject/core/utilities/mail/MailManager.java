package Hrms.HrmsProject.core.utilities.mail;

import org.springframework.stereotype.Service;

@Service
public class MailManager implements EmailSender {

	@Override
	public boolean sendMailVerified(String to, String email) {
		
		return true;
	}

	

}
