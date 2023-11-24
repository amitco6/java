package Recursion;

public class Main {
    public static void main(String[] args){
        //1.print numbers
        printNumbers(10);

        // 2. cat euues
        System.out.println("Cat Eyes: " + catEyes(9));
    }

    public static void printNumbers(int num){
        if(num == 0) {
            return;
        }
        else
        {
            System.out.println(num);
            printNumbers(num -1);
        }
    }

    public static int catEyes(int cats) {
        if (cats == 0){
            return 0;
        }
        else {
            return  2 + catEyes(cats - 1);
        }
    }
}
