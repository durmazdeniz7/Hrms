package Hrms.HrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Job")
public class JobTitle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "jobName")
	private String jobName;
	
	@Column(name = "jobDetails")
	private String jobDetails;
	
	@Column(name = "isActive",columnDefinition = "boolean Default false")
	private boolean isActive;

	public JobTitle() {
		// TODO Auto-generated constructor stub
	}
	public JobTitle(int id, String jobName, String jobDetails, boolean isActive) {
		super();
		this.id = id;
		this.jobName = jobName;
		this.jobDetails = jobDetails;
		this.isActive = isActive;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobDetails() {
		return jobDetails;
	}
	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	

}
