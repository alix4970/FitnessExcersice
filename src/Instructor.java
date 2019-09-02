public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours);
    }

    public int getSalary() {
        if (hours == 37) {
            return 23000;
        } else {
            return hours * 456;
        }
    }
}