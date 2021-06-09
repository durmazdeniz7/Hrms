package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageDao extends JpaRepository<ProgramingLanguage, Integer> {

}
