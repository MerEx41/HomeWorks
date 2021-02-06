package homeworklesonone;

public class Lesson1 {

    public static void main(String[] args) {
        byte byt = 1;
        short s = 10;
        int i = 100;
        long l = 1000L;
        float f = 1.1f;
        double d = 1.2;
        char c = 'C';
        boolean boo = true;
    }

    public static float math(){
        float a = 2.5f;
        float b = 1.5f;
        float c = 8.75f;
        float d = 2.5f;
        return a * (b + (c / d));
    }

    public static boolean isTenToTwenty(int a, int b){
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void checkPositiveOrNegative(int a){
        if (a >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        };

    }

    public static boolean isPositiveOrNegative(int a){
        return (a >= 0);
    }

    public static void hello(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void checkLeapYear(int year){
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            System.out.println("Високосный");
        } else {
            System.out.println("Обычный");
        }
    }
}
