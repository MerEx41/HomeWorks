package homeworklessomseven;

public class Plate {
    private final int capacity;
    private int fullness;

    public Plate (int capacity){
        this.capacity = capacity;
        fill(this);

    }

    public void fill (Plate plate){
        this.fullness = capacity;
        System.out.print("Тарелка наполнена: ");
        nowFullness(plate);
    }

    public void nowFullness (Plate plate){
        System.out.println(fullness + "/" + capacity);
    }
    public int getFullness() {
        return fullness;
    }

    public void setCapacity(int fullness) {
        this.fullness = fullness;
    }
}
