
import java.io.*;

public class Lesson10_2 {
    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        String line = "";
        try {
            reader = new FileReader("H:\\Java lam lai\\BAIKHOA01-10\\Lesson10\\input.txt");
            BufferedReader bre = new BufferedReader(reader, 100);
            writer = new FileWriter("H:\\Java lam lai\\BAIKHOA01-10\\Lesson10\\output.txt");

            while ((line = bre.readLine()) != null) {
                line = line.replaceAll("\\s\\s+", " ").trim();
                writer.write(line);
            }
            reader.close();
            writer.flush();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
    }
}
