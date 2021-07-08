package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.CandidateService;
import Hrms.HrmsProject.core.utilities.Verification.UserCheckService;
import Hrms.HrmsProject.core.utilities.mail.EmailService;
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
	   private EmailService emailService;


	    @Autowired
	    public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService, EmailService emailService) {
	        this.candidateDao = candidateDao;
	        this.userCheckService = userCheckService;
	        this.emailService = emailService;
	    }


	    @Override
	    public Candidate findByEmail(String email) {
	        return this.candidateDao.findByEmail(email);
	    }

	    @Override
	    public Candidate findByIdentityNumber(String identityNumber) {
	        return this.candidateDao.findByIdentityNumber(identityNumber);
	    }

	    @Override
	    public Result add(Candidate candidate) {
	        if (this.findByEmail(candidate.getEmail()) != null) {
	            return new ErrorResult("Daha önce kayıtlı email var");
	        }
	        if (this.findByIdentityNumber(candidate.getIdentityNumber())!=null){
	            return new ErrorResult("Aynı TC KİMLİK NUMARASI VAR");
	        }
	        if(!userCheckService.isVerified(candidate)){
	            return new ErrorResult("Kullanıcı Doğrulanamadı");
	        }
	        this.emailService.sendMailVerified(candidate.getEmail(),"123456");
	        this.candidateDao.save(candidate);
	        return new SuccesResult("Eklendi");
	    }

	    @Override
	    public DataResult<List<Candidate>> getall() {
	        return new SuccesDataResult<List<Candidate>>(this.candidateDao.findAll(),"Listelendi");
	    }

	    @Override
	    public DataResult<List<Candidate>> getByCandidateName(String firstName) {

	        return new SuccesDataResult<>(this.candidateDao.getByCandidateName(firstName));
	    }
}
