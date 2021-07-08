package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.JobExperiment;
import Hrms.HrmsProject.entities.concretes.JobPosition;

public interface JobExperimentDao extends JpaRepository<JobExperiment, Integer>{
	JobPosition findByJobName(String jobName);


}
