package com.iowaves.sasbclient;

public class User {
    String userName;
    String firstName;
    String lastName;
    String publicIp;

    public User() {
    }

    public User(String userName, String firstName, String lastName,String publicIp) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.publicIp = publicIp;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

}
