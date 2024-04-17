package uz.pdp.backend.models;

import uz.pdp.backend.enums.Status;

public class User extends BaseModel {
    private String name;
    private Integer age;
    private String userName;
    private String password;
    private Status status;

    public User(String name, Integer age, String userName, String password, Status status) {
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return userName;
    }
}
