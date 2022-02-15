package inputOutput;

import java.io.*;
import java.util.Scanner;


public class FileInputStreamTests {
    public static void main(String[] args) throws IOException {
        File file = new File("./data.txt");

        InputStream fileInputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNextLine()) {
             String str = scanner.nextLine();
            String validNumbers = ValidNumbers.getValidNumbers(str);
            if (validNumbers != null)
                System.out.println(validNumbers);
        }

        fileInputStream.close();

    }

}
