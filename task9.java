// Записать в файл следующие данные:

// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23 
import java.io.FileWriter;
import java.io.IOException;

public class task9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            String str;
            fw.write("Name Surname Age");
            fw.append('\n');
            fw.write("Kate Smith 20");
            fw.append('\n');
            fw.write("Paul Green 25");
            fw.append('\n');
            fw.write("Mike Black 23");
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
