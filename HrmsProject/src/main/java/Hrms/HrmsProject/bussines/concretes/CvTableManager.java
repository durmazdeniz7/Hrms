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
import Hrms.HrmsProject.entities.concretes.dtos.CandidateWithCvTable;

@Service
public class CvTableManager implements CvTableServices {
private CvTableDao cvTableDao;


@Autowired
    public CvTableManager(CvTableDao cvTableDao) {
        this.cvTableDao = cvTableDao;
    }

    @Override
    public Result add(CvTable cvTable) {
    this.cvTableDao.save(cvTable);
        return new SuccesResult("Cv Eklendi");
    }

    @Override
    public DataResult<List<CvTable>> getall() {
        return new  SuccesDataResult<List<CvTable>>(this.cvTableDao.findAll(),"Listelendi");
    }

	@Override
	public DataResult<List<CandidateWithCvTable>> getByCandidateWithCvTable(int id) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<List<CandidateWithCvTable>>(this.cvTableDao.getByCandidateWithCvTable(id),"Listelendi");
	}




}