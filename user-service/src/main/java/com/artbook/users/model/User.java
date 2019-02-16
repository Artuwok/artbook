package com.artbook.users.model;

public class User {
    private long userId;
    private String name;
    private String lastName;

    public User(long l, String name, String lastName) {
        this.userId = l;
        this.name = name;
        this.lastName = lastName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
