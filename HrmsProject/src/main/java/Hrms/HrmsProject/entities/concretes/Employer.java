package Hrms.HrmsProject.entities.concretes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
public class Employer extends User{
    @Column(name = "company_name",nullable = false)
    @NotBlank
    private String companyName;

    @Column(name = "web_site",nullable = false)
    @NotBlank
    private String website;

    @Column(name = "phone_number",nullable = false)
    @NotBlank
    @Size(min = 10)
    private String phoneNumber;

    @OneToMany(mappedBy = "employer")
    private List<JobPosting> jobPostings;

    @OneToOne(mappedBy = "employer")
    private Cities cities;
}