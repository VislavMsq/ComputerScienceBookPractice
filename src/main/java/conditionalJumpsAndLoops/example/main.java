package conditionalJumpsAndLoops.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter your three number!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter your  number!");
        int b = sc.nextInt();

        System.out.println("Enter your  number!");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }


        sc.close();
    }
}
