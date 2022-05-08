import java.io.*;
import java.util.*;

public class Exercise1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dayso.txt"));
        ArrayList<String> str = new ArrayList<>();
        String line = "";
        while ((line = reader.readLine()) != null) {
            str.add(line);
        }
        reader.close();
        Collections.sort(str);
        FileWriter writer = new FileWriter("sapxep.txt");
        for (String s : str) {
            writer.write(s);
            writer.write("\r\n");
        }
        writer.close();
    }
}
