package Hrms.HrmsProject.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.HrmsProject.bussines.abstarcts.UserService;
import Hrms.HrmsProject.core.utilities.result.DataResult;
import Hrms.HrmsProject.core.utilities.result.ErrorResult;
import Hrms.HrmsProject.core.utilities.result.Result;
import Hrms.HrmsProject.core.utilities.result.SuccesDataResult;
import Hrms.HrmsProject.core.utilities.result.SuccesResult;
import Hrms.HrmsProject.dataAcces.abstracts.UserDao;
import Hrms.HrmsProject.entities.concretes.User;
@Service
public class UserManager implements UserService {
    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    @Override
    public Result add(User user) {
        if(this.findByEmail(user.getEmail())!=null){
            return  new ErrorResult("Aynı Email Var");
        }
        this.userDao.save(user);
        return new SuccesResult("Kullanıcı Eklendi");
    }

    @Override
    public DataResult<List<User>> getall() {
        return new SuccesDataResult<List<User>>(this.userDao.findAll(),"Listelendi");
    }

    @Override
    public User findByEmail(String email) {
        return  this.userDao.findByEmail(email);
    }
}