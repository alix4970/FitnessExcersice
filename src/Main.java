import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        printPerson();
        printMembers();
        printEmployees();

        FileHandling f = new FileHandling();

        f.openFile();
        System.out.printf("%-15s%-12s\n", "Name", "CPR");
        printSpace();
        f.readFile();
        f.closeFile();
    }

    public static void printPerson() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mads", "200497-2020"));
        personList.add(new Person("James", "010497-2033"));
        personList.add(new Person("Wajid", "010197-2030"));

        System.out.printf("%-15s%-12s\n", "Name", "CPR");
        printSpace();
        for (Person pers : personList) {

            System.out.printf("%-15s%-12s\n", pers.getName(), pers.getCpr());
        }
    }

    public static void printMembers() {
        List<Members> membersList = new ArrayList<>();
        membersList.add(new Members("john", "220899-2345", false));
        membersList.add(new Members("Henrik", "010878-2345", true));
        membersList.add(new Members("Arnold", "280279-4523", true));

        System.out.printf("%-15s%-12s%-12s\n", "Name", "CPR", "Membership");
        printSpace();

        for (Members memb : membersList) {

            System.out.printf("%-15s%-12s%-12s\n", memb.getName(), memb.getCpr(), memb.getMemberType());

        }
    }


    public static void printEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Adminstration("Wajid", "2343245-2323", 76, 5));
        employeeList.add(new Instructor("Joe", "2837376-4283", 10));

        System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", "Name", "CPR", "Hours", "Salary", "Vacation");
        printSpace();

        for (Employee emp : employeeList) {
            if (emp instanceof Adminstration) {
                System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", emp.getName(), emp.getCpr(), emp.getHours(), emp.getSalary(), ((Adminstration) emp).getVacation());
            } else {
                System.out.printf("%-15s%-12s%-12s%-12s\n", emp.getName(), emp.getCpr(), emp.getHours(), emp.getSalary());
            }
        }

    }

    public static void printSpace() {
        for (int i = 0; i < 70; i++) {

            System.out.print("*");

        }
        System.out.println();
    }

}
