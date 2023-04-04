package instagram.model;

import instagram.enums.Gender;

public class User {
    private int id;
    private String nickName;
    private int age;
    private String password;
    private String photo;
    private Gender gender;

    @Override
    public String toString() {
        return " " +
                "\nnickName='" + nickName + '\'' +
                "\n age=" + age +
                "\n password='" + password + '\'' +
                "\n photo='" + photo + '\'' +
                "\n gender=" + gender +
                ' ';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public User(String nickName, int age, String password, String photo, Gender gender) {
        this.nickName = nickName;
        this.age = age;
        this.password = password;
        this.photo = photo;
        this.gender = gender;
    }

    public User() {
    }
}
