package HomeWork2;

public class Dog extends Animal {
    @Override
    public String sound() {
        return "Гав!";
    }

    @Override
    public String move() {
        return "Собака двигается!";
    }

    @Override
    public String eat() {
        return "Собака ест!";
    }

    @Override
    public String climbTree() {
        return "Собака отказывается лезть на дерево!";
    }

    @Override
    public String swim() {
        return "Собака плавает!";
    }
}
