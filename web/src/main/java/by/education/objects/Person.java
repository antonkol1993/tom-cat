package by.education.objects;

import by.education.constants.UsersRole;

public class Person {

    private String userName;
    private String password;
    private final UsersRole userRole;
    private final int id;

    public Person(String userName, String password, UsersRole userRole, int id) {
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
        this.id = id;
    }

    public UsersRole getUserRole() {
        return userRole;
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

    public int getId() {
        return id;
    }
}