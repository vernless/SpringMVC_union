package com.vern.controller;

import com.vern.domain.Account;
import com.vern.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 滨
 * @Date 2022/8/21 18:51
 * @Description: TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    public Result save(@RequestBody Account account) {
        boolean flag = accountService.save(account);
        return new Result(flag ?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Account account) {
        boolean flag = accountService.update(account);
        return new Result(flag ?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = accountService.delete(id);
        return new Result(flag ?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Account account = accountService.getById(id);
        Integer code = account != null ?Code.GET_OK:Code.GET_ERR;
        String msg = account != null ?"":"数据查询失败";
        return new Result(code,account,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Account> accountList = accountService.getAll();
        Integer code = accountList.isEmpty() ? Code.GET_ERR:Code.GET_OK;
        String msg = accountList.isEmpty() ?"数据查询失败":"";
        return new Result(code,accountList,msg);
    }
}
