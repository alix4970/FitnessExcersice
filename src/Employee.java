public class Employee extends Person {
    int hours;
    private int salary = 23000;

    public Employee(){

    }

    public Employee(String name, String cpr) {
        super(name, cpr);
        this.hours = hours;
    }

    public Employee(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }


    public int getSalary() {
       return salary;

    }

}
