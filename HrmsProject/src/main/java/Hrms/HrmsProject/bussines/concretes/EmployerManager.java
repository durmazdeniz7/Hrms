package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.EmployerService;
import Hrms.HrmsProject.core.utilities.mail.EmailSender;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.ErrorResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.EmployerDao;
import Hrms.HrmsProject.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	private EmailSender emailSender;

	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailSender emailSender) {
		super();
		this.employerDao = employerDao;
		this.emailSender = emailSender;
	}

	@Override
	public Employer getByEmail(String email) {
		// TODO Auto-generated method stub
		return this.employerDao.getByEmail(email);
	}

	@Override
	public DataResult<List<Employer>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if (this.getByEmail(employer.getEmail()) != null) {
			return new ErrorResult("DAHA ÖNCE KAYITLI EPOSTA ADRESİ VAR");
		}
		this.emailSender.sendMailVerified(employer.getEmail(), "kod");
		this.employerDao.save(employer);
		return new SuccesResult("İş veren eklendi...");
	}

}
