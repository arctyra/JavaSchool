package HomeWork2;

public abstract class Animal {

    private String color;
    private String nickname;
    private int age;

    public String getColor() {
        return color;
    }

    public Animal setColor(String color) {
        this.color = color;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public Animal setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animal setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract String sound();
    public abstract String move();
    public abstract String eat();
    public abstract String climbTree();
    public abstract String swim();

}
