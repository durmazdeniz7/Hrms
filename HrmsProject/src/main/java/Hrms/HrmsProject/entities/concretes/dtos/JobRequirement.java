package Hrms.HrmsProject.entities.concretes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobRequirement {
    private int id;
    private boolean isActive;
    private String companyName;
    private String jobName;
    private int openPosition;
    private Date publishingDate;
    private Date endApplyDate;
}