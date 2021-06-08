package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.CandidateService;
import Hrms.HrmsProject.core.utilities.Verification.UserCheckService;
import Hrms.HrmsProject.core.utilities.mail.EmailSender;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.ErrorResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.CandidateDao;
import Hrms.HrmsProject.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	private UserCheckService userCheckService;
	private EmailSender emailSender;
	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(UserCheckService userCheckService, EmailSender emailSender, CandidateDao candidateDao) {
		super();
		this.userCheckService = userCheckService;
		this.emailSender = emailSender;
		this.candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate candidate) {
		if (!this.userCheckService.isVerified(candidate.getNationaltyId(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getDateOfBirth())) {
			return new ErrorResult("Kullanıcı Doğrulanamadı");

		}
		if (this.getByEmail(candidate.getEmail())!=null) {
			return new ErrorResult("Email zaten kayıtlı");
		}
		if (this.getByNationaltyId(candidate.getNationaltyId())!=null) {
			return new ErrorResult("Tc zaten kayıtlı");
		}
		this.emailSender.sendMailVerified(candidate.getEmail(), "kod");
		this.candidateDao.save(candidate);
		return new SuccesResult("Kullanıcı Eklendi");
	}

	@Override
	public Candidate getByNationaltyId(String nationaltyId) {
		// TODO Auto-generated method stub
		return this.candidateDao.getByNationaltyId(nationaltyId);
	}

	@Override
	public Candidate getByEmail(String email) {
		// TODO Auto-generated method stub
		return this.getByNationaltyId(email);
	}

	@Override
	public DataResult<List<Candidate>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

}
