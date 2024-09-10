package by.education.data;

import by.education.constants.UsersRole;

public class Person {

    private String userName;
    private String password;
    private final UsersRole usersRole;

    public Person(String userName, String password, UsersRole usersRole) {
        this.userName = userName;
        this.password = password;
        this.usersRole = usersRole;
    }

    public UsersRole getUsersRole() {
        return usersRole;
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
