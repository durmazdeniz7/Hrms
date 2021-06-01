package Hrms.HrmsProject.dataAcces.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import Hrms.HrmsProject.entities.concretes.Cities;

public interface CitiesDao extends JpaRepository<Cities, Integer>{
	
	

}
