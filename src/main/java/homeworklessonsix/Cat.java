package homeworklessonsix;

public class Cat extends Animal {

    public static int count;

    public Cat(String name) {
        this.name = name;
        this.runDistance = 200;
        this.isCanSwim = false;
        Animal.count++;
        count++;

    }

    public void run(int distance) {
        Animal.run(distance, runDistance, name, isCanRun);
    }
}
