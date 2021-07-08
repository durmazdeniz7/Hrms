package Hrms.HrmsProject.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cv_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "photo_link")
    private String photoLink;

    @Column(name = "github_link")
    private String githubLink;

    @Column(name = "linedin_link")
    private String linkedinLink;

    @Column(name = "description", nullable = false)
    private String description;


    @Column(name = "create_date", nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date createDate;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @OneToMany(mappedBy = "cvTable")
    private List<School> schools;

    @OneToMany(mappedBy = "cvTable")
    private List<JobExperiment> jobExperiments;

    @OneToMany(mappedBy = "cvTable")
    private List<ForeignLanguage> foreignLanguages;

    @OneToMany(mappedBy = "cvTable")
    private List<ProgrammingLanguage> programmingLanguages;

}