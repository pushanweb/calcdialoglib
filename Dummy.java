package com.example.registration;

public class Dummy {
    int uId;
    String username;

    public Dummy(int uId, String username) {
        this.uId = uId;
        this.username = username;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }
}
