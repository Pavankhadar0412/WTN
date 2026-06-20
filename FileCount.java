import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileCount {
    public static void main(String[] args) {
        int chars = 0;
        int lines = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
            }
            br.close();
            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Characters: " + chars);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}