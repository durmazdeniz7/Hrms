package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.ForeginLanguage;

public interface ForeignLanguageDao extends JpaRepository<ForeginLanguage, Integer>{

}
