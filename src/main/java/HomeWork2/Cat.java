package HomeWork2;

public class Cat extends Animal {
    @Override
    public String sound() {
        return "Мяу!";
    }

    @Override
    public String move() {
        return "Кошка двигается!";
    }

    @Override
    public String eat() {
        return "Кошка ест!";
    }

    @Override
    public String climbTree() {
        return "Кошка лезет на дерево!";
    }

    @Override
    public String swim() {
        return "Кошка отказывается плавать!";
    }
}
