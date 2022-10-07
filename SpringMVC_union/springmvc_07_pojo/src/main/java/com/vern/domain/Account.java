package com.vern.domain;

/**
 * @Author 滨
 * @Date 2022/8/21 18:47
 * @Description: TODO
 * @Version 1.0
 */

public class Account {
    private Integer id;
    private String name;
    private Double balance;

    public Account() {
    }

    public Account(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account{id = " + id + ", name = " + name + ", balance = " + balance + "}";
    }
}
