package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.CvTable;
import Hrms.HrmsProject.entities.concretes.dtos.CandidateWithCvTable;

public interface CvTableServices {
	Result add(CvTable cvTable);
    DataResult<List<CvTable>> getall();

    DataResult<List<CandidateWithCvTable>> getByCandidateWithCvTable(int id);
}
