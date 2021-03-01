package homeworklessonfive;

public class Employees {
    private String Full_name;
    private String Position;
    private String Email;
    private String Phone;
    private int Salary;
    private int Age;

    public Employees(String Full_name, String Position,String Email,String Phone,int Salary,int Age) {
       this.Full_name = Full_name;
       this.Position = Position;
       this.Email = Email;
       this.Phone = Phone;
       this.Salary = Salary;
       this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void person() {
        System.out.println("Name: " + Full_name);
        System.out.println("Position: " + Position);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + Phone);
        System.out.println("Salary: " + Salary);
        System.out.println("Age: " + Age);
        System.out.println();

    }

}

