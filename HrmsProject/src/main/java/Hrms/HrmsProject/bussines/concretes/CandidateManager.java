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

	private CandidateDao candidateDao;
	private UserCheckService userCheckService;
	private EmailSender emailSender;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService, EmailSender emailSender) {
		// TODO Auto-generated constructor stub
		this.candidateDao = candidateDao;
		this.userCheckService = userCheckService;
		this.emailSender = emailSender;
	}

	@Override
	public DataResult<List<Candidate>> getall() {

		return new SuccesDataResult<List<Candidate>>(this.candidateDao.findAll(), "İş arayanlar listelendi...");
	}

	@Override
	public Result add(Candidate candidate) {
		if (!this.userCheckService.isVerified(candidate.getNationaltyId(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getDateOfBirth())) {
			return new ErrorResult("Kullanıcı Doğrulanamadı");
		}
		if (this.candidateDao.getByEmail(candidate.getEmail()) != null) {
			return new ErrorResult("Daha önce bu mail ile kayıt olundu");
		}
		if (this.candidateDao.getByNationaltyId(candidate.getNationaltyId()) != null) {
			return  new ErrorResult("Tc kimlik Numarası Zaten kayıtlı");

		}
		this.emailSender.sendMailVerified(candidate.getEmail(), "DOğrulama kodu");
		this.candidateDao.save(candidate);
		return new SuccesResult("İş arayan kaydedildi");
	}

}
