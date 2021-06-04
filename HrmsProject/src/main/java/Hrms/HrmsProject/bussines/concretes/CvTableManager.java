package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.CvTableService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.CvTableDao;
import Hrms.HrmsProject.entities.concretes.CvTable;

@Service
public class CvTableManager implements CvTableService {
	private CvTableDao cvTableDao;

	@Autowired
	public CvTableManager(CvTableDao cvTableDao) {
		this.cvTableDao = cvTableDao;
	}

	@Override
	public DataResult<List<CvTable>> gettall() {

		return new SuccesDataResult<List<CvTable>>(this.cvTableDao.findAll(), "Cv Listelendi");
	}

	@Override
	public Result add(CvTable cvtable) {
		this.cvTableDao.save(cvtable);
		return new SuccesResult("Eklendi");
	}

	

}
