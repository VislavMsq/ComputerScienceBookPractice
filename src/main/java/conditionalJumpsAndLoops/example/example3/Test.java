package conditionalJumpsAndLoops.example.example3;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 2000; i++) {
            if(count % 5 == 0){
                System.out.println();
            }
            System.out.println(i + " ");
            count++;
        }
    }
    public static void example3 (){

    }
}
