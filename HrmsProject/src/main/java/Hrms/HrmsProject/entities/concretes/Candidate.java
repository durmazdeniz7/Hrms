package Hrms.HrmsProject.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "candidates")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Candidate extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "nationalty_id")
	private String nationaltyId;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	
	@OneToMany(mappedBy = "id")
	List<CvTable> cvtables;

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(int id, String firstName, String lastName, String nationaltyId, Date dateOfBirth,
			List<CvTable> cvtable) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.dateOfBirth = dateOfBirth;
		this.cvtables = cvtable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<CvTable> getCvtables() {
		return cvtables;
	}

	public void setCvtables(List<CvTable> cvtables) {
		this.cvtables = cvtables;
	}

}
