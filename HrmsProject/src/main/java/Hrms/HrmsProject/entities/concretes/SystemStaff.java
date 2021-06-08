package Hrms.HrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "system_staf")
@PrimaryKeyJoinColumn(name = "user_id")
public class SystemStaff extends User {
	
	@Column(name = "first_name",nullable = false)
	@NotBlank()
	private String firstName;
	
	@Column(name = "last_name",nullable = false)
	private String lastName;
	
	
	
	
	

}
