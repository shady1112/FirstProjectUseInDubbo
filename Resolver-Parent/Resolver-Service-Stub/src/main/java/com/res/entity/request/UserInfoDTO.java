package com.res.entity.request;

import java.util.Date;

public class UserInfoDTO {

    private String loginName;

    private String password;

    private Date lastlogin;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    public UserInfoDTO(String loginName, String password, Date lastlogin) {
        this.loginName = loginName;
        this.password = password;
        this.lastlogin = lastlogin;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", lastlogin=" + lastlogin +
                '}';
    }
}
