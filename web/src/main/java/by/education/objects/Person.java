package by.education.objects;

import by.education.constants.UsersRole;

public class Person {

    private String userName;
    private String password;
    private UsersRole userRole;
    private int id;

    public Person(String userName, String password, UsersRole userRole) {
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
    }

    public UsersRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UsersRole userRole) {
        this.userRole = userRole;
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

    public void setId(int id) {
        this.id = id;
    }
}
