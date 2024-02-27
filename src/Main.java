import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String fullName = "";
        String dirName = System.getProperty("user.dir");
        fullName = dirName + File.separator + fileName;
        System.out.println("File path: " + fullName);
        File file = new File(fullName);

        if(!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created!");
                } else {
                    System.out.println("Something wrong");
                }
            } catch (IOException e) {
                Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            System.out.println("File already exists!");
        }
    }
}