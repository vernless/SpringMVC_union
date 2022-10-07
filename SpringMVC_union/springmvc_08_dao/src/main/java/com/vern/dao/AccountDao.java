package com.vern.dao;

import com.vern.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author 滨
 * @Date 2022/8/21 18:48
 * @Description: TODO
 * @Version 1.0
 */
public interface AccountDao {
    @Insert("insert into account values(null,#{name},#{balance})")
    void save(Account account);
    @Update("update account set name=#{name}, balance=#{balance} where id=#{id}")
    public void update(Account account);
    @Delete("delete from account where id=#{id}")
    public void delete(Integer id);
    @Select("select * from account where id=#{id}")
    public Account getById(Integer id);
    @Select("select * from account")
    public List<Account> getAll();
}
