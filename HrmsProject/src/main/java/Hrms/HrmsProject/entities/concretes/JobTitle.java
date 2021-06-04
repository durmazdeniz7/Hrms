package Hrms.HrmsProject.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "job_title")
public class JobTitle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "job_name")
	private String jobName;

	@Column(name = "job_details")
	private String jobDetails;

	@Column(name = "is_active", columnDefinition = "boolean Default false")
	private boolean isActive;

	@Column(name = "min_salary")
	private int minSalary;

	@Column(name = "max_salary")
	private int maxSalary;

	@Column(name = "last_date")
	private Date lastDate;

	@Column(name = "open_position")
	private int openPosition;

	@Column(name = "open_date")
	private Date openDate;

	@OneToMany(mappedBy = "id")
	List<Employer> employers;

	public JobTitle() {
		// TODO Auto-generated constructor stub
	}

	public JobTitle(int id, String jobName, String jobDetails, boolean isActive, int minSalary, int maxSalary,
			List<Employer> employers, Date lastDate, int openPosition, Date openDate) {
		super();
		this.id = id;
		this.jobName = jobName;
		this.jobDetails = jobDetails;
		this.isActive = isActive;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.employers = employers;
		this.lastDate = lastDate;
		this.openPosition = openPosition;
		this.openDate = openDate;
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

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public List<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public int getOpenPosition() {
		return openPosition;
	}

	public void setOpenPosition(int openPosition) {
		this.openPosition = openPosition;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
}
