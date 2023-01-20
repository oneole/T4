import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mySearch {
    public static void main(String[] args) throws IOException {
        String fileName = "E:\\CMU\\ADT\\T4\\src\\data.txt";
        int totalValues = 0;
        int greaterThanHalfValues = 0;

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            totalValues++;
            double value = Double.parseDouble(line);
            if (value > 0.5) {
                greaterThanHalfValues++;
            }
        }
        reader.close();

        System.out.println("Total number of values read: " + totalValues);
        System.out.println("Number of value > 0.5 is: " + greaterThanHalfValues);
    }
}