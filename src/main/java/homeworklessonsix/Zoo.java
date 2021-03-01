package homeworklessonsix;

public class Zoo {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Бобик");
        Cat cat2 = new Cat("Мурзик");
        cat1.run(200);
        cat2.run(300);
        dog1.run(400);
        System.out.println("Собак создано: " + Dog.count);
        System.out.println("Кошек создано: " + Cat.count);
        System.out.println("Животных создано: " + Animal.count);
    }

}
