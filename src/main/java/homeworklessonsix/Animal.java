package homeworklessonsix;

public abstract class Animal {
    protected String name;
    protected boolean isCanRun = true;
    protected int runDistance;
    protected boolean isCanSwim = true;
    protected int swimDistance;
    protected static int count;

    public static void run(int distance, int runDistance, String name, boolean isCanRun) {
        if (isCanRun) {
            if (distance <= runDistance) {
                System.out.println(name + " пробежал " + distance + " метров");
            } else {
                System.out.println(name + " не может пробежать " + distance + " метров");
            }
        } else {
            System.out.println(name + " не умеет бегать");
        }
    }
}
