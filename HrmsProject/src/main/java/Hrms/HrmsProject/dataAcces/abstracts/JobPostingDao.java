package Hrms.HrmsProject.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Hrms.HrmsProject.entities.concretes.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {
	@Query("From JobPosting where isOpen = true")
	List<JobPosting> getAllOpenJobAdvertList();
	
	@Query("From JobPosting where isOpen = true Order By publishedAt Desc")
	List<JobPosting> findAllByOrderByPublishedAtDesc();
	
	@Query("From JobPosting where isOpen = true and employer_id =:id")
	List<JobPosting> getAllOpenJobPostingByEmployer(int id);

}
