package org.fkit.domain;

import java.io.Serializable;
import java.util.Date;



public class User implements Serializable {

    private String loginname;
    private Date birthday;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User [loginname=" + loginname + ", birthday=" + birthday + "]";
    }


}
