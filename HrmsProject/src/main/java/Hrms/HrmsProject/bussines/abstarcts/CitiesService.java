package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.entities.concretes.Cities;

public interface CitiesService {
    DataResult<List<Cities>> getall();

}
