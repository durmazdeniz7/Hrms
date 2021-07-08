package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.Candidate;

public interface CandidateService {
	Candidate findByEmail(String email);

    Candidate findByIdentityNumber(String identityNumber);

    Result add(Candidate candidate);

    DataResult<List<Candidate>> getall();
    DataResult<List<Candidate>> getByCandidateName(String firstName);
}
