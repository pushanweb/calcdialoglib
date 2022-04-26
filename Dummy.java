package com.example.registration;

public class Dummy {
    int uId;
    String name;

    public Dummy(int uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
