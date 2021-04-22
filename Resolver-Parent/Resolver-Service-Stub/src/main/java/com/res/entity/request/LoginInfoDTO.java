package com.res.entity.request;


import java.io.Serializable;
import java.util.Date;

public class LoginInfoDTO implements Serializable {


    private String account;


    private String password;


    private Date lastlogin;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public LoginInfoDTO(String account, String password, Date lastlogin) {
        this.account = account;
        this.password = password;
        this.lastlogin = lastlogin;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", lastlogin=" + lastlogin +
                '}';
    }
}
