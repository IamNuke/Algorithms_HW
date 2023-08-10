package ex5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        FileManager fm = new FileManager();
        try {
            File from = new File("src.txt");
            File to = new File("dest.txt");
            fm.CopyFile(from, to);

            fm.Read("test.txt");
            fm.SaveFile("test.txt");
        }
        catch (FileOperationsException ex) {
            ex.printStackTrace();

        }
    }
}
