package homeworklessomseven;

public class FeedingCats {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat [] cats = new Cat[3];
        cats [0] = new Cat("Барсик", 35);
        cats [1] = new Cat("Мурзик", 40);
        cats [2] = new Cat("Пушок", 30);
        for (Cat cat : cats) {
            cat.eat(plate);
        }

    }

}
