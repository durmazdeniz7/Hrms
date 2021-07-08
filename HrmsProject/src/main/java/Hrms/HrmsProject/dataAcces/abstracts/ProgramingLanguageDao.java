package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.ProgrammingLanguage;

public interface ProgramingLanguageDao extends JpaRepository<ProgrammingLanguage, Integer> {

}
