package conditionalJumpsAndLoops.example.example2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Enter you numbers!");
        Scanner sc = new Scanner(System.in);
        double q = sc.nextDouble();
        double w = sc.nextDouble();

        if(q > 0 && q < 1 && w > 0 && w < 1){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        //
    }
}
