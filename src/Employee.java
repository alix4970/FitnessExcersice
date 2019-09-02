public class Employee extends Person {
    int hours;
    private int salary = 23000;

    public Employee(){

    }

    public Employee(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
       return salary;

    }

    public void setSalary(int salary) {
        salary = salary;
    }
}
