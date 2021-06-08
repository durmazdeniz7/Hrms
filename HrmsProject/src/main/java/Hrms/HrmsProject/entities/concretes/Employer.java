package Hrms.HrmsProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User {
	
	
	
	@Column(name = "company_name",nullable = false)
	@NotBlank
	private String companyName;
	
	@Column(name = "web_site",nullable = false)
	@NotBlank
	private String webSite;
	
	@Column(name = "phone_number",nullable = false)
	@NotBlank
	private String phoneNumber;

	
	 @ManyToOne()
	 @JoinColumn(name  = "jobPosition_id")
	private  JobPosition jobPosition;
	

	@OneToMany(mappedBy = "employer")
	private List<JobPosting> jobPostings;
	  
	@ManyToOne()
	@JoinColumn(name = "cities_id")
	private Cities cities;
	
	
	
	
	 

}
