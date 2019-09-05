import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {


    private String[] spited;

    public String[] getSpited() {

            return spited;
    }

    public void setSpited(String[] spited){
        this.spited = spited;

    }

    public void filePrint() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("/Users/alialsharefi/Desktop/Datamatiker/3.semester/Kode/Repetetion/Fitness/src/Persons.txt"));

        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNextLine()){
            list.add(sc.nextLine());
        }
        sc.close();

        String listString = String.join(", ", list);

        setSpited(listString.split("\\s+"));

    }


}
