package Hrms.HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cv_tables")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "photo_link")
	private String photoLink;

	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "linkedin_link")
	private String linkedinLink;

	@Column(name = "description")
	private String description;

	@Column(name = "created_date", nullable = false)
	private LocalDate createdDate;

	@Column(name = "is_active", nullable = false)
	private boolean isActive;

	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
}
