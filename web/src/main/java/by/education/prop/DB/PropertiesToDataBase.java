package by.education.prop.DB;

public class PropertiesToDataBase {
    private String urlDB;
    private String user;
    private String password;


    public PropertiesToDataBase(String urlDB, String user, String password) {
        this.urlDB = urlDB;
        this.user = user;
        this.password = password;
    }

    public String getUrlDB() {
        return urlDB;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
