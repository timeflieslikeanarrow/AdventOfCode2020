import java.io.*;
import java.text.ParseException;

public class Day18 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Day18.class.getResourceAsStream("/day18-input");

        try (InputStreamReader streamReader =
                     new InputStreamReader(inputStream);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            long sum = 0;
            while ((line = reader.readLine()) != null) {
                if(line.isBlank()) continue;

                StringReader sreader = new StringReader(line);
                Calculator calculator = new Calculator(sreader);
                long result = calculator.compute();
                sum += result;

                System.out.println(line + " = " + result);
            }

            System.out.println("Result: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
