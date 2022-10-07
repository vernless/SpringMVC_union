package com.vern.service;

import com.vern.config.SpringConfig;
import com.vern.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * @Author 滨
 * @Date 2022/8/21 18:58
 * @Description: TODO
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void getById(){
        Account a = accountService.getById(1);
        System.out.println(a);
    }

    public static void main(String[] args) {
        String  s = "abcabcbb";
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsValue(s.charAt(i))){
                left = Math.max(left , map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }

    }
}
