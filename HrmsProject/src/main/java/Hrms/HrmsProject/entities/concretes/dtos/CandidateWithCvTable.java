package Hrms.HrmsProject.entities.concretes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateWithCvTable {

    private int id;
    private String firstName;
    private String lastName;
    private  String photoLink;
    private String githubLink;
    private String linkedinLink;
    private String description;
    private Date createDate;
    private String schoolName;
    private String department;
    private Date startDate;
    private Date endDate;
    private String languageName;
    private int level;
    private String workplaceName;
    private String position;
    private Date startedDate;
    private Date finishDate;
    private String programingName;



}