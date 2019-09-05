import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileHandling f = new FileHandling();

        List<Members> people = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        f.filePrint();

        people.add(new Members(f.getSpited()[0], f.getSpited()[1]));
        people.add(new Members(f.getSpited()[2], f.getSpited()[3]));
        people.add(new Members(f.getSpited()[4], f.getSpited()[5]));






        people.add(new Members("Alfito", "150197-2020", false));
        people.add(new Members("Arnold", "210297-3020", true));
        people.add(new Members("Gunnar", "220477-3020", false));
        people.add(new Members("Asger", "230977-4499", true));


        employeeList.add(new Instructor("Kim", "208540-2094", 120));
        employeeList.add(new Adminstration("Kim", "208540-2094", 3));
        employeeList.add(new Instructor("Nicklas", "208750-4876", 30));
        employeeList.add(new Adminstration("Kim", "208540-2094", 5));


        printNameAndCpr((ArrayList<Members>) people, (ArrayList<Employee>) employeeList);
        fitnessMembers((ArrayList<Members>)people);
        printEmployee((ArrayList<Employee>) employeeList);



        /*printPerson();
        printMembers();
        printEmployees();
        */

    }



    //// Denne metode printer alle members og employess navn og cpr.
    public static void printNameAndCpr(ArrayList<Members> people, ArrayList<Employee> employees) {

        System.out.println("Members & Empoloyess Navn / Cpr");
        System.out.printf("%-15s%-12s\n", "Navn", "Cpr");
        start();

        for (Employee e : employees) {
            System.out.printf("%-15s%-12s\n", e.getName(), e.getCpr());
        }

        end();

    }

    ////Denne metode printer alle members info ud.
    public static void fitnessMembers(ArrayList<Members> people) {

        System.out.println("Fitness Members");
        System.out.printf("%-15s%-12s%-12s%-12s\n", "Navn ", "Cpr ", "Member type ", " Fee");
        start();
        for (Members m :
                people) {
            System.out.printf("%-15s%-12s%-12s%-12s\n", m.getName(), m.getCpr(), m.getMemberType(), m.monthlyFee());

        }
        end();
    }


    // Denne metode printer alle employyes info ud.
    public static void printEmployee(ArrayList<Employee> employeeList) {
        System.out.println("Fitness Employees");
        System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", "Navn", "Cpr", "Hours", "Salary", "Vacation");
        start();
        for (Employee e :
                employeeList) {

            if (e instanceof Adminstration) {
                System.out.printf("%-15s%-12s%-12s%-12s%-12s\n", e.getName(), e.getCpr(), e.getHours(), e.getSalary(), ((Adminstration) e).getVacation());
            } else {
                System.out.printf("%-15s%-12s%-12s%-12s\n", e.getName(), e.getCpr(), e.getHours(), e.getSalary());
            }
        }
        end();
    }

    /*public static void printPerson() {
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
    */

    // Denne metode laver *
    public static void start() {

        for (int i = 0; i < 75; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }


    //Denne metode laver =
    public static void end() {
        for (int i = 0; i < 75; i++) {
            System.out.print("=");
        }
        System.out.println("\n\n");
    }

}
