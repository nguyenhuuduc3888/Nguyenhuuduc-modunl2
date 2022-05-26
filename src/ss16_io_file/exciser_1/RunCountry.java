package ss16_io_file.exciser_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RunCountry {
    public static List<Country> readFile() {
        List<Country> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader("src\\ss16_io_file\\exciser_1\\test_country");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(",");
                int id = Integer.parseInt(txt[0]);
                String code = txt[1];
                String name = txt[2];
                list.add(new Country(id, code, name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        RunCountry runCountry = new RunCountry();
        List<Country> list = runCountry.readFile();
        for (Country item : list) {
            System.out.println(item);
        }
    }
}