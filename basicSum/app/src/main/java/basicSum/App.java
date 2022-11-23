package basicSum;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int firstNumber;
        int secondNumber;
        int sum;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello, welcome to a simple sum software!");
        
        try { Thread.sleep (4000); } catch (InterruptedException ex) {}
        
        System.out.println("All you need to do is put two numbers and they "
                + "will be magically add up!");
        
        try { Thread.sleep (4000); } catch (InterruptedException ex) {}
        
        System.out.println("You can put your first number down here:");
            firstNumber = scan.nextInt();
            
        System.out.println("Now you will put your second number:");
            secondNumber = scan.nextInt();
            
            sum = firstNumber + secondNumber;
            
        try { Thread.sleep (1500); } catch (InterruptedException ex) {}
            
        System.out.println("Wait a minute... The magic is happening...");
            
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
            
        System.out.println("Your sum is " + sum + "!!");
        
        try { Thread.sleep (1500); } catch (InterruptedException ex) {}
     
        System.out.println("Goodbye!");
        
        try { Thread.sleep (1500); } catch (InterruptedException ex) {}
    }
}
