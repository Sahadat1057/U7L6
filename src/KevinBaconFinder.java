import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

public class KevinBaconFinder {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Person1");
        names.add("Person2");
        names.add("Person3");
        names.add("Person4");
        names.add("Person5");
        try {
            File f = new File("src/output.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            for (String n : names) {
                fw.write(n + "\n");
            }
            fw.close();
        }
        catch (IOException ioe) {
            System.out.println("Writing file failed");
            System.out.println(ioe);
        }


    }
}


public static ArrayList,

}
