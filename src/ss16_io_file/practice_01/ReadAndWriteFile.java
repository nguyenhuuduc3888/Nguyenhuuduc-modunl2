package ss16_io_file.practice_01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);
        try (FileReader fileReader=new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)){
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line =null;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try(FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Giá trị lớn nhất là: " + max );
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\ss16_io_file\\practice\\test_practice");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\ss16_io_file\\textfile\\test_practice_1.csv", maxValue);
    }
}
