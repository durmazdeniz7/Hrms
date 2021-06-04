package Hrms.HrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.HrmsProject.entities.concretes.CvTable;

public interface CvTableDao extends JpaRepository<CvTable, Integer> {

}
