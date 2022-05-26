package ss16_io_file.exciser;

import java.io.*;

public class CopyFile {
    public static void readAndCopyFile(String source, String target) {
        File fileSource = new File(source);
        File fileTarget = new File(target);
        try (FileReader fileReader = new FileReader(fileSource);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(fileTarget);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            if (!fileSource.exists()) {
                throw new FileNotFoundException();
            }
            String[] arr;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split("");
                for (String copy : arr) {
                    bufferedWriter.write(copy);
                }
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        String source = "src\\ss16_io_file\\exciser\\source";
        String target = "src\\ss16_io_file\\exciser\\target";
        readAndCopyFile(source, target);
        System.out.println("Sao chép thành công....");
    }
}
