package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrite {

        public static void main(String[] args) {
            try {
            FileWriter fw = new FileWriter("D:\\Portfolio\\tree.txt");
                fw.write("import java.util.Scanner;\n" +
                        "\n" +
                        "public class TaskMaster.splitNUM {\n" +
                        "    public static void main(String[] args){\n" +
                        "        Scanner sc = new Scanner(System.in);\n" +
                        "        long value = sc.nextLong();\n" +
                        "        System.out.println(\"Enter the value \" + value);\n" +
                        "        long even=0,odd=0,remainder=0,count=0;\n" +
                        "\n" +
                        "        while(value!=0){\n" +
                        "            remainder=value%10;\n" +
                        "            value/=10;\n" +
                        "            if(remainder % 2==0){\n" +
                        "                even+=remainder;\n" +
                        "            }\n" +
                        "            else{\n" +
                        "                odd+=remainder;\n" +
                        "            }\n" +
                        "            ++count;\n" +
                        "        }\n" +
                        "        System.out.println(\"The count is \" + count);\n" +
                        "        System.out.println(\"The sum of even is\" + even);\n" +
                        "        System.out.println(\"The sum of odd is\" + odd);\n" +
                        "    }\n" +
                        "}\n");
                fw.close();

                System.out.println("Successfully written");
                }
            catch (IOException ex) {
                System.out.println("An Error has occured");
                ex.printStackTrace();
        }
    }
}
