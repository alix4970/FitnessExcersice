import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {

    private Scanner sc;

    public void openFile() {

        try {
            sc = new Scanner(new File("/Users/alialsharefi/Desktop/Datamatiker/3.semester/Kode/Repetetion/Fitness/src/Persons.txt"));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }

    }


    public void readFile() {
        while (sc.hasNext()) {

            ArrayList<String> listS = new ArrayList<String>();
            listS.add(sc.nextLine());

            System.out.println(listS);

        }
    }

    public void closeFile() {
        sc.close();
    }
}
