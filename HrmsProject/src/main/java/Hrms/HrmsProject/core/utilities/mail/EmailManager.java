package Hrms.HrmsProject.core.utilities.mail;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;

@Service

public class EmailManager implements EmailService{
    @Override
    public boolean sendMailVerified(String to, String message) {
        return true;
    }


}
