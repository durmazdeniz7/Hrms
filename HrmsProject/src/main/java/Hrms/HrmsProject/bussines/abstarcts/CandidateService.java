package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.Candidate;

public interface CandidateService {
	Result add(Candidate candidate);

	DataResult<List<Candidate>> getall();

	Candidate getByNationaltyId(String nationaltyId);

	Candidate getByEmail(String email);

}
