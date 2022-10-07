package com.vern.service.Impl;

import com.vern.controller.Code;
import com.vern.dao.AccountDao;
import com.vern.domain.Account;
import com.vern.exception.SystemException;
import com.vern.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 滨
 * @Date 2022/8/21 18:50
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public boolean save(Account account) {
        accountDao.save(account);
        return true;
    }

    @Override
    public boolean update(Account account) {
        accountDao.update(account);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        accountDao.delete(id);
        return true;
    }

    @Override
    public Account getById(Integer id) {
        if(id == -1){
            throw new SystemException(Code.BUSINESS_ERR,"wtf");
        }
        /*try{
            int i = 1/0;
        }catch (ArithmeticException e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"error",e);
        }
*/
        return accountDao.getById(id);
    }

    @Override
    public List<Account> getAll() {
        return accountDao.getAll();
    }
}
