package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.JobTitleService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.ErrorResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.JobTitleDao;
import Hrms.HrmsProject.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	private JobTitleDao joTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao joTitleDao) {
		this.joTitleDao = joTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getall() {

		return new SuccesDataResult<List<JobTitle>>(this.joTitleDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if (this.joTitleDao.getByJobName(jobTitle.getJobName())!=null) {
			return new ErrorResult("İş adı zaten kayıtlııı");
		}

		this.joTitleDao.save(jobTitle);
		return new SuccesResult("Başarılı bir şekilde kaydedildi");
	}

}
