package JavaAssignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Assi5 {
    public static void files() throws IOException {
        File f = new File("/home/mohag/cmd/ass5.txt");
        if (f.createNewFile()){
            System.out.println("file existed");
        }
        else {
            f.getName();
        }

        FileWriter fw=new FileWriter("/home/mohag/cmd/ass5.txt");

        fw.write("priya=25 ");
        fw.append(" all is well.");
        fw.close();
        System.out.println("path of file: "+f.getAbsolutePath());
    }

    public static void main(String[] args) throws IOException {
        try {
            files();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
