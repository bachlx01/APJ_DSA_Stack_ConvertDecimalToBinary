import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String binary = exchange(number);
        System.out.println("Binary of " + number +" is: "  + binary);

    }

    public static String exchange(int num) {
        String binary = "";
        Stack myStack = new Stack();
        while (num > 0) {
            myStack.add(num%2);
            num = num/2 ;
        }
        while (!myStack.empty()){
            binary += myStack.pop();
        }

        return binary;
    }
}
