package Hrms.HrmsProject.dataAcces.abstracts;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Hrms.HrmsProject.entities.concretes.JobTitle;
import Hrms.HrmsProject.entities.concretes.Dtos.JobTitleWithEmployer;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
	JobTitle getByJobName(String jobNeme);

	
	

	
	
}
