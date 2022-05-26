package ss16_io_file.exciser_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunCountry {
    public static void main(String[] args) {
        File file = new File("src\\ss16_io_file\\exciser_1\\test_country");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printCountry(cover(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> cover(String csvLine) {
        List<String> result = new ArrayList<>();
        String[] splitData = csvLine.split(",");
        for (int i = 0; i < splitData.length; i++) {
            result.add(splitData[i]);
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Quốc Gia Có Stt : " + country.get(0)
                        + " ----Tên Viết Tắt: " + country.get(1)
                        + " ----Tên Đầy Đủ: " + country.get(2));
    }
}
