package com.yang.lea.web.entity;

/**
 * @author Yang
 * @version 1.0
 * @date 2020/5/11 01:06
 * @description 账户信息实体
 */
public class Account {
    private int id;

    private String accountName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
