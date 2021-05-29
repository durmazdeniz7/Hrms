package Hrms.HrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employers")
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "website")
	private String website;

	@Column(name = "email")
	private String email;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "password")
	private String password;

	@Column(name = "passwordAgain")
	private String passwordAgain;

	public Employer() {
		// TODO Auto-generated constructor stub
	}

	public Employer(int id, String companyName, String website, String email, String phoneNumber, String password,
			String passwordAgain) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.website = website;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.passwordAgain = passwordAgain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

}
