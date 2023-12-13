package File_Handling;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        File fileobj = new File("D:\\Portfolio\\tree.txt");
        try {
            if (fileobj.createNewFile()) {
                System.out.println("File created: " + fileobj.getName());
            }else{
                System.out.println("Already Exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
