package homeworklessonfive;

public class Person {
    public static void main(String[] args) {
        Employees [] persArr = new Employees[5];
        persArr[0] = new Employees("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArr[1] = new Employees("Petrov Petr", "Manager", "ppetro@mail.com", "89562362525", 50000, 23);
        persArr[2] = new Employees("Sergeev Sergey", "Boss", "SegBoss@mail.com", "88005005050", 500000, 49);
        persArr[3] = new Employees("Smirnov Vadim", "Builder", "SmirnV@mail.com", "89525685859", 40000, 40);
        persArr[4] = new Employees("Irina Ivanova", "Administrator", "IIvanova@mail.com", "89523653322", 50000, 18);
        for (int i = 0; i < persArr.length; i++){
            if (persArr[i].getAge() >= 40){
                persArr[i].person();
            }
        };
    }
}
