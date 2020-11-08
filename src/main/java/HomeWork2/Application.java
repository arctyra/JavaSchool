package HomeWork2;

public class Application {
    public static void main(String[] args) {
        Animal cat = new Cat().setNickname("Барсик").setColor("Рыжий").setAge(5);
        Animal dog = new Dog().setNickname("Дружок").setColor("Черный").setAge(7);

        System.out.println(cat);
        System.out.println(dog);
    }
}
