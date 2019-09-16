import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args){
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);
      
        do {
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
      
            sum += data;
        } while (data !=0);
  
    System.out.println("The sum is " + sum);
    }
}