public class Adminstration extends Employee {
    private int vacation;

    public Adminstration() {

    }

    public Adminstration(String name, String cpr, int hours, int vacation) {
        super(name, cpr, hours);
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }


}
