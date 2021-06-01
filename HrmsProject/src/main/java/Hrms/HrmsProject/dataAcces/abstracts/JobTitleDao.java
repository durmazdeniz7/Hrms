package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
	JobTitle getByJobName(String jobNeme);

	
	
	Job getByIsActive(boolean isActive);
}
