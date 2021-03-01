package homeworklessonsix;

public class Dog extends Animal {

    public static int count;

    public Dog(String name) {
        this.name = name;
        this.runDistance = 500;
        this.swimDistance = 10;
        Animal.count++;
        count++;
    }
    public void run(int distance) {
        Animal.run(distance, runDistance, name, isCanRun);
    }
}
