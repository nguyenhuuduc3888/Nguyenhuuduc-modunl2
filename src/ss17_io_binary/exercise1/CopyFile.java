package ss17_io_binary.exercise1;

import product_list.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile implements Serializable {
    public static void readAndCopyfile(String source, String target) {
        File fileSource = new File(source);
        File fileTarget = new File(target);
        try (FileInputStream fis = new FileInputStream(fileSource);
             ObjectInputStream ois = new ObjectInputStream(fis);
             FileOutputStream fos = new FileOutputStream(fileTarget);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            if (!fileSource.exists() && !fileTarget.exists()) {
                throw new FileNotFoundException();
            }
            String line;
            while (true) {
                line = ois.readLine()
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
