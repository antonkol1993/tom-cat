package by.education.data;

public class Player {

    private final Integer id;
    private final String name;
    private final Integer age;
    private final String country;


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
}
