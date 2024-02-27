import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        String fileName = "test.txt";
//        String fullName = "";
//        String dirName = System.getProperty("user.dir");
//        fullName = dirName + File.separator + fileName;
//        String dirname = dirName + "/tmp/user/java/bin";
//        File d = new File(dirname);
//        d.mkdirs();
//        System.out.println("File path: " + fullName);
//        File file = new File(fullName);
//
//        if(!file.exists()) {
//            try {
//                if (file.createNewFile()) {
//                    System.out.println("File created!");
//                } else {
//                    System.out.println("Something wrong");
//                }
//            } catch (IOException e) {
//                Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, e);
//            }
//        } else {
//            System.out.println("File already exists!");
//        }
        InputStream in = null;
        OutputStream out = null;
        byte[] buffer = null;
        try {
           in = new FileInputStream(new File("test.txt"));
           buffer = new byte[in.available()];
           in.read(buffer);
           File file = new File("outputFile.tmp");
           out = new FileOutputStream(file);
           out.write(buffer);
        } catch (FileNotFoundException e) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
               in.close();
               out.close();
            } catch (IOException e) {
                Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}