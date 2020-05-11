package com.yang.lea.web.controller;

import com.yang.lea.web.entity.Account;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yang
 * @version 1.0
 * @date 2020/5/11 22:19
 * @description Restful风格的GET、POST、PUT、DELETE
 */
@RestController
public class RestfulController {
    static Map<Integer, Account> accounts = new HashMap<>();

    /**
     * 如果是Get请求，而且请求的格式是/account，则将调用这个方法
     */
    @GetMapping("/account")
    List<Account> getAccountList() {
        return new ArrayList<Account>(accounts.values());
    }

    /**
     * 如果是POST请求，而且请求的格式是/account，则将调用这个方法
     */
    @PostMapping("/account")
    String postAccount(@ModelAttribute Account account) {
        //插入一条数据，并返回OK
        accounts.put(account.getId(), account);
        return "OK";
    }

    /**
     * 如果是POST请求，而且请求时带id参数据，则将调用这个方法
     */
    @GetMapping("/account/{id}")
    Account getAccount(@PathVariable Integer id) {
        // 在实际项目中我们会得到数源，但在这里我们造一个数据
        Account account = new Account();
        account.setId(id);
        account.setAccountName("Yang");
        return account;
    }

    /**
     * 如果是PUT请求，而且请求时带id参数据，则将调用这个方法
     */
    @PutMapping("/account/{id}")
    String putAccount(@PathVariable Integer id, @ModelAttribute Account account) {
        //向数据源插入一条数据并返回
        accounts.put(id, account);
        return "OK";
    }

    /**
     * 如果是DELETE请求，而且请求时带id参数据，则将调用这个方法
     */
    @DeleteMapping("/account/{id}")
    String deleteAccount(@PathVariable Integer id) {
        //从数据源中删除主这条id所指向的账号信息
        accounts.remove(id);
        return "OK";
    }
}
