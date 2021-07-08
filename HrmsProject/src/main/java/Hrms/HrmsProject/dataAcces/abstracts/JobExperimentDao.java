package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.JobExperiment;

public interface JobExperimentDao extends JpaRepository<JobExperiment, Integer>{
	


}
