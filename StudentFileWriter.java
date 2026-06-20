import java.io.FileWriter;
import java.io.IOException;
public class StudentFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");
            fw.write("Student Test Details\n");
            fw.write("Name: Rushi Sai\n");
            fw.write("Roll No: 101\n");
            fw.write("Marks: 95\n");
            fw.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
