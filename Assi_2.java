package JavaAssignments;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Assi_2 {
    public static void alphabets() {
        String input;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string name");
        input = s.nextLine();
        char[] c = input.toLowerCase().replaceAll(" ", "").toCharArray();
        int a[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = 0;
        while (i != c.length) {
            int index = c[i] - 65;
            a[index] = 1;
            ++i;
        }
        i = 0;
        while (i != 26) {
            if (a[i] == 1) {
                ++i;
            } else {
                System.out.println("dont contain all alphabets");
                break;
            }
            System.out.println("Contains all alphabets");
        }}
    public static void main(String[] args) {
        alphabets();
    }}
