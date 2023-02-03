package JavaAssignments;

public class Assi1 {
    public static void muliples() {
        int i;
        for (i=1;i<=100;i++){
            if (((i % 3) == 0) && ((i % 5) == 0)){
                System.out.println("fizzbuzz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        muliples();
    }
}