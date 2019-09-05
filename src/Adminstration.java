public class Adminstration extends Employee {
    private int vacation;

    public Adminstration() {

    }

    public Adminstration(String name, String cpr, int vacation) {
        super(name, cpr);
        this.name = name;
        this.cpr = cpr;
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }


}
