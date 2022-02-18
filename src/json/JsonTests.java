package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Scanner;
import java.util.StringJoiner;

public class JsonTests {
    public JsonTests() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        Contact contact = new Contact();
        File file = new File("./file.txt");

        InputStream fileInputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(fileInputStream);
        StringJoiner result = new StringJoiner(","+"\n");
        String result1;


        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().split(" ");
            String str1 = words[0];
            String str2 = words[1];
            String str3 = " ";

            int age;

            try {
                age = Integer.parseInt(str2);
            } catch (NumberFormatException e) {
                continue;
            }

            contact.setName(str1);
            contact.setAge(age);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            //to json
            String json = gson.toJson(contact);
            System.out.println(json);


          result.add(json);

         result1 = " [" + "\n" + "  " + String.valueOf(result) + str3 + "\n" + " ]";
            File file1 = new File("./User.json");
            //try-with-resources
            try (FileWriter writer = new FileWriter(file1))
            {
                writer.write(result1);
                writer.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }}

        


