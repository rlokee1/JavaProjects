package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
        public static void main(String[] args) {
            try {

                File fread = new File("D:\\Portfolio\\tree.txt");
                Scanner read = new Scanner(fread);
                while (read.hasNextLine()){
                    String data = read.nextLine();
                    System.out.println(data);
            }
                read.close();
        }
            catch (FileNotFoundException f){
                System.out.println("An Error has occured");
                f.printStackTrace();
            }
    }
}
