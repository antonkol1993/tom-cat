package by.education.data.objects;

import by.education.constants.UsersRole;

public class Person {

    private String userName;
    private String password;
    private final UsersRole userRole;

    public Person(String userName, String password, UsersRole userRole) {
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
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
}
