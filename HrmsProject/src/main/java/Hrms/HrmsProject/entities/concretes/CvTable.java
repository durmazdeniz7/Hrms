package Hrms.HrmsProject.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cv_table")
@Inheritance(strategy = InheritanceType.JOINED)
public class CvTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "photo_link")
	private String photoLink;
	
	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@Column(name = "github_link")
	private String githubLink;
	
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;


public CvTable() {
	// TODO Auto-generated constructor stub
}
	
	public CvTable(int id, String photoLink, String linkedinLink, String githubLink, Date createDate, boolean isActive,
			Candidate candidate) {
		super();
		this.id = id;
		this.photoLink = photoLink;
		this.linkedinLink = linkedinLink;
		this.githubLink = githubLink;
		this.createDate = createDate;
		this.isActive = isActive;
		this.candidate = candidate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPhotoLink() {
		return photoLink;
	}



	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}



	public String getLinkedinLink() {
		return linkedinLink;
	}



	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}



	public String getGithubLink() {
		return githubLink;
	}



	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public Candidate getCandidate() {
		return candidate;
	}



	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	

}
