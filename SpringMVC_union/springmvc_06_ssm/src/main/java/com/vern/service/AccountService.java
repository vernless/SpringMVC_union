package com.vern.service;

import com.vern.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 滨
 * @Date 2022/8/21 18:50
 * @Description: TODO
 * @Version 1.0
 */
@Transactional
public interface AccountService {
    /**
     * @Description: 保存
     * @Params: [account]
     * @Return boolean
     */
    public boolean save(Account account);
    /**
     * @Description:修改
     * @Params: [account]
     * @Return boolean
     */
    public boolean update(Account account);
    /**
     * @Description:删除
     * @Params: [id]
     * @Return boolean
     */
    public boolean delete(Integer id);
    /**
     * @Description:查询单个
     * @Params: [id]
     * @Return com.vern.domain.Account
     */
    public Account getById(Integer id);
    /**
     * @Description:查询全部
     * @Params: []
     * @Return java.util.List<com.vern.domain.Account>
     */
    public List<Account> getAll();
}
