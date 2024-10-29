package objects;

public class Player {

    private Integer id;
    private String name;
    private Integer age;
    private String country;
    private String position;
    private String rating;

//    private
    public Player() {
    }

    public Player(String name, Integer age, String country, String position, String rating) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.position = position;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
