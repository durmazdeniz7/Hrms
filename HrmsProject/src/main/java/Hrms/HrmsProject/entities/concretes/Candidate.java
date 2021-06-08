package Hrms.HrmsProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{

	
	@Column(name = "first_name",nullable = false)
	@NotBlank
	private String firstName;
	
	@Column(name = "last_name",nullable = false)
	@NotBlank
	private String lastName;
	
	@Column(name = "nationalty_id",nullable = false)
	@NotBlank
	private String nationaltyId;
	
	
	@Column(name = "date_of_birth",nullable = false)
	@NotBlank
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	

}
