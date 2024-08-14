package by.education.data;

public class Player {

    private final Integer id = 0;
    private final String name;
    private final Integer age;
    private final String country;

    public Player(String name, Integer age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
