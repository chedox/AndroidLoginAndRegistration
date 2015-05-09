package com.beliapalagi.loginandregistration.bean;

/**
 * Created by chedoxtop@gmail.com on 4/28/2015.
 */
public class Users {

    private String name;
    private String email;
    private String password;

    public Users(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
