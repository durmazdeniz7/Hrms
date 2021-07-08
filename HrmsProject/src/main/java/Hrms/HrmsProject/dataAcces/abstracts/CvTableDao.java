package Hrms.HrmsProject.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Hrms.HrmsProject.entities.concretes.CvTable;
import Hrms.HrmsProject.entities.concretes.dtos.CandidateWithCvTable;

public interface CvTableDao extends JpaRepository<CvTable, Integer>{

    @Query("Select new Hrms.HrmsProject.entities.concretes.dtos.CandidateWithCvTable" +
            "(c.id,c.firstName,c.lastName,cv.photoLink,cv.githubLink,cv.linkedinLink," +
            "cv.description,cv.createDate,s.schoolName,s.department,s.startDate,s.endDate,f.languageName,f.level,je.workplaceName," +
            "je.position,je.startedDate,je.finishDate,p.programingName) " +
            "From CvTable cv Inner Join cv.candidate c Inner Join cv.schools s Inner Join cv.foreignLanguages f Inner Join" +
            " cv.programmingLanguages p Inner Join cv.jobExperiments je where c.id=:id")
    List<CandidateWithCvTable> getByCandidateWithCvTable(Integer id);

}
