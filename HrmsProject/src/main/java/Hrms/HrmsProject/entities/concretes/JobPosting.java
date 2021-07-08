package Hrms.HrmsProject.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "job_posting")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "job_descriptions",nullable = false)
    @NotBlank
    private String jobDescription;


    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "open_position",nullable = false)
    private int openPosition;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "publishing_date",nullable = false)
    private Date publishingDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "end_apply_date",nullable = false)
    private Date endApplyDate;

    @Column(name = "is_active",nullable = false)
    private boolean isActive;

    @ManyToOne()
    @JoinColumn(name = "jobPosition_id")
    private JobPosition jobPosition;

    @ManyToOne()
    @JoinColumn(name = "cities_id")
    private Cities cities;

    @ManyToOne()
    @JoinColumn(name = "employer_id", nullable = false, updatable = false)
    private Employer employer;


}