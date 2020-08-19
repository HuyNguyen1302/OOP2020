package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
    static String filename = "f_out.txt";
    public static void readFile(String filename) throws java.io.FileNotFoundException, IOException {
        BufferedReader br;
        FileReader f = new FileReader("f_out.txt");
        br = new BufferedReader(f);
        System.out.println(br.lines());
    }

    public static void main(String[] args) {

        try {
            readFile(filename);
        } catch ( java.io.FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
