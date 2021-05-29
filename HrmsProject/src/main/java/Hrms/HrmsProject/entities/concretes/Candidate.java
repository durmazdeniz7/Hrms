package Hrms.HrmsProject.entities.concretes;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidates")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "nationaltyId")
	private String nationaltyId;

	@Column(name = "dateOfBirth", columnDefinition = "Default LocalDate CURRENT_STATE ")
	private LocalDate dateOfBirth=LocalDate.now();

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "passwordAgain")
	private String passWordAgain;

	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	public Candidate(int id, String firstName, String lastName, String nationaltyId, LocalDate dateOfBirth, String email,
			String password, String passWordAgain) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.passWordAgain = passWordAgain;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassWordAgain() {
		return passWordAgain;
	}
	public void setPassWordAgain(String passWordAgain) {
		this.passWordAgain = passWordAgain;
	}

}
