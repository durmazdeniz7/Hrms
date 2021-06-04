package Hrms.HrmsProject.bussines.abstarcts;

import java.util.List;

import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.entities.concretes.CvTable;

public interface CvTableService {
	DataResult<List<CvTable>> gettall();
	Result add(CvTable cvtable);

}
