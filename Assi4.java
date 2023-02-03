package JavaAssignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assi4 {
    public static void main(String[] args) throws IOException {

        File f = new File("a.txt");

        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("path: "+f.getAbsolutePath());
        System.out.println("length: "+f.length());
        System.out.println("name:" +f.getName());
        System.out.println("readable: "+f.canRead());


             FileWriter fw = new FileWriter("a.txt");
        try
                 {
                fw.write("  i have created a file.");
                fw.write( "   priya gopalakrishnan");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
 Scanner s =new Scanner(f);
        while(s.hasNext()){
            System.out.println("file is read"+s.nextLine());
        }
s.close();

    }

}
