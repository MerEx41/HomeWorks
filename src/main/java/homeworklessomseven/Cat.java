package homeworklessomseven;

public class Cat {
    protected final String name;
    protected boolean isHungru = true;
    protected final int consumption;

    public Cat (String name, int consumption){
        this.name = name;
        this.consumption = consumption;
    }
    public void eat (Plate plate) {
        if (this.isHungru && plate.getFullness() >= this.consumption) {
            this.isHungru = false;
            plate.setCapacity(plate.getFullness() - this.consumption);
            System.out.println(this.name + " покушал и теперь сыт");
        } else {
            System.out.print(this.name + " не смог покушать, так как в тарелке осталось мало еды: ");
            plate.nowFullness(plate);
            System.out.println(this.name + " остался голодным");
        }
    }
}
