package JavaAssignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assi2 {
    public static void alpha() {
        String s="mohana priya";
        String[] w=s.split("");
        String b="abcdefghijklmnopqrstuvwxyz";
        String[] c=b.split("");

        Set<String> q= new HashSet<>(Arrays.asList(w));
        Set<String> r= new HashSet<>(Arrays.asList(c));
        r.removeAll(q);
        System.out.print("missing letters: "+r+" ");


    }

    public static void main(String[] args) {
        alpha();
    }


}
