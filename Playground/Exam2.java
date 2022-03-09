package Playground;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.io.Reader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam2 {
    public static void main(String[] args) {
        final String path1 = args[0];
        final String path2 = args[1];

        FileReader reader = null;
        FileWriter writer = null;

        String data1 = "";
        String data2 = "";

        try {
            reader = new FileReader(path1);

            int ch = reader.read();
            while (ch != -1) {
                data1 += (char) ch;
                ch = reader.read();
            }
            if (data1 != "")
                System.out.println("String Read from file: " + data1);
            else
                System.out.println(path1 + " is Empty.");
        } catch (FileNotFoundException e) {
            System.out.println(path1 + " does not already exist.");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        try {
            reader = new FileReader(path2);

            int ch = reader.read();
            while (ch != -1) {
                data2 += (char) ch;
                ch = reader.read();
            }
            if (data2 != "")
                System.out.println("String Read from file: " + data2);
            else
                System.out.println(path2 + " is Empty.");
        } catch (FileNotFoundException e) {
            System.out.println(path2 + " does not already exist.");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println(data1);
        if (data1.toString().toLowerCase().equals(data2.toString().toLowerCase()))
            System.out.println("Both files are same.");
        else
            System.out.println("Both files are different.");

        int count = 0;
        for (int i = 0; i < data1.length(); i++) {
            for (int j = 0; j < data2.length(); j++) {
                if (data1.charAt(i) == data2.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println("Number of common characters in both the files are: " + count);

    }
}
