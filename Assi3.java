package JavaAssignments;

import java.text.*;
import java.util.Calendar;
import java.util.Scanner;

public class Assi3 {
    public static Calendar dates(String date, int nos) throws ParseException {
        SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
        Calendar cal=Calendar.getInstance();
        cal.setTime(dt.parse(date));
        cal.add(Calendar.DAY_OF_MONTH,nos);
        return cal;
    }

    public static void main(String[] args)throws ParseException {

        {
            String[] finalSignUp = new String[10];
            String[] finalCurrent = new String[10];
            Scanner s = new Scanner(System.in);
            System.out.println("enter the number ");
            int a = s.nextInt();
            String[] signUp = new String[a];
            String[] current = new String[a];
            for (int i = 0; i < a; i++) {
                Scanner s1 = new Scanner(System.in);
                System.out.println("enter the signup date: ");
                signUp[i] = s1.nextLine();
                System.out.println("enter the current date: ");
                current[i] = s1.nextLine();
                String signDate = signUp[i];
                String currentDate = current[i];
                int inputC = currentDate.lastIndexOf("-");
                String currentYear = currentDate.substring(inputC + 1, inputC + 5);
                System.out.println(currentYear);
                int inputS = signDate.lastIndexOf("-");
                String signYear = signDate.substring(inputS + 1, inputS + 5);
                System.out.println(signYear);
                String lastestSignUp = signDate.replace(signYear, currentYear);
                SimpleDateFormat sd = new SimpleDateFormat("dd-mm-yyyy");
                Calendar cal1 = dates(currentDate, 0);
                System.out.println(cal1 + "CURRENT DATE");
                Calendar cal2 = dates(lastestSignUp, 30);
                String end = sd.format(cal2.getTime());
                System.out.println(end + "Ending window");
                Calendar cal3 = dates(lastestSignUp, -30);
                String start = sd.format(cal3.getTime());
                System.out.println(start + "Starting window");
                Calendar cal4 = dates(signDate, 0);
                System.out.println(cal4 + "SIGNUP DATE");
                if (cal4.after(cal1)) {
                    finalSignUp[i] = "NOT IN RANGE";
                    finalCurrent[i] = " ";
                } else if ((cal3.before(cal1)) && (cal2.after(cal1)) || (cal1 == cal2 || cal1 == cal3)) {
                    String formdate = sd.format(cal3.getTime());
                    System.out.println(formdate + " " + currentDate);
                    finalSignUp[i] = formdate;
                    finalCurrent[i] = currentDate;
                } else if (cal1.after(cal2)) {
                    cal1.add(Calendar.DAY_OF_MONTH, -30);
                    String formSubmit = sd.format(cal3.getTime());
                    String currentSubmit = sd.format(cal1.getTime());
                    System.out.println(formSubmit + " " + currentSubmit);
                    finalSignUp[i] = formSubmit;
                    finalCurrent[i] = currentSubmit;
                }
            }
        }


    }}
