package com.jonr.loginsqlite;

public class CustomerModel {
    private int userId;
    private String name;
    private int age;
    private boolean isActive;

    public CustomerModel() {
    }

    public CustomerModel(int userId, String name, int age, boolean isActive) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
