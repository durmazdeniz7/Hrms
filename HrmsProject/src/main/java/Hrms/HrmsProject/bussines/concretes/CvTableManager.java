package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.CvTableServices;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.CvTableDao;
import Hrms.HrmsProject.entities.concretes.CvTable;

@Service
public class CvTableManager implements CvTableServices {
	private CvTableDao cvTableDao;

	@Autowired
	public CvTableManager(CvTableDao cvTableDao) {
		super();
		this.cvTableDao = cvTableDao;
	}

	@Override
	public Result add(CvTable cvTable) {
		this.cvTableDao.save(cvTable);
		return new SuccesResult("Cv Eklendi");
	}

	@Override
	public DataResult<List<CvTable>> getall() {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<CvTable>>(this.cvTableDao.findAll(),"Adaya Ait Cv getirildi");
	}

}
