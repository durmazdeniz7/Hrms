package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.Candidate;

public interface CandidateDao  extends JpaRepository<Candidate, Integer>{
	Candidate getByNationaltyId(String nationaltyId);
	Candidate getByEmail(String email);

}
