package LAB0;

import java.io.*;
import java.util.Scanner;

public class IOStreams {
    static String ROOT = "src/LAB0/";
    public static void main(String[] args) {
        RecapJavaIO recap = new RecapJavaIO();
        String source = ROOT + "myfile.txt";
        String destination = ROOT + "myfile_copy.txt";
        recap.KeyboardToFile(source);
        recap.FileToFile(source, destination);
    }
}

class RecapJavaIO {
    void KeyboardToFile(String fileName) {
        try {
            Scanner sc = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream(fileName, true);

            System.out.println("Enter file content: ");
            String str = sc.nextLine() + "\n\n";

            byte[] b = str.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Your content have been saved to myFile.txt");

            sc.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    void FileToFile(String source, String destination) {
        try {
            FileInputStream istream = new FileInputStream(source);
            FileOutputStream ostream = new FileOutputStream(destination);

            int i;
            while ((i = istream.read()) != -1) {
                ostream.write(i);
            }

            System.out.println("Data successfully copied to another file");

            istream.close();
            ostream.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}