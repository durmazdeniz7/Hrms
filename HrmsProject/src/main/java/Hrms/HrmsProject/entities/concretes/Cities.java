package Hrms.HrmsProject.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cities")
@AllArgsConstructor
@NoArgsConstructor
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "city_name",nullable = false)
    private String cityName;

    @OneToMany(mappedBy = "cities")
    private List<JobPosting> jobPostings;


    @OneToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;
}