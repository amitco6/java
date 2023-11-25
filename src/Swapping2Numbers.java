import java.util.Scanner;

public class Swapping2Numbers {
    public static void main(String[] args){
        System.out.println("Please Enter number A");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Please Enter number B");
        int b = input.nextInt();

        System.out.println("Before swapping valuews are: "+"a="+a + " b="+b);
        //Logic 1 - third varaible
        /*int t=a;
        a=b;
        b=t;*/

        //Logic 2 - use + & -without using third variable
        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("after swapping values are: "+"a="+a + " b="+b);
        System.out.println("after swapping values are: "+"a="+a + " b="+b);


    }
}
