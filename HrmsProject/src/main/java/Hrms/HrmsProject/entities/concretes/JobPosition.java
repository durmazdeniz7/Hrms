package Hrms.HrmsProject.entities.concretes;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_position")
public class JobPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private  int id;

    @Column(name = "job_name",nullable = false)
    private String jobName;

    @OneToMany(mappedBy = "jobPosition")
    private List<JobPosting> jobPostings;
}
