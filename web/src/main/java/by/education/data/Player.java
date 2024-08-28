package by.education.data;

public class Player {

    private Integer id;
    private String name;
    private Integer age;
    private String country;

//    private
    public Player() {
    }

    public Player(String name, Integer age, String country, Integer id) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
