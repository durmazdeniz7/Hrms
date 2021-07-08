package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.ForeignLanguage;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer>{

}
