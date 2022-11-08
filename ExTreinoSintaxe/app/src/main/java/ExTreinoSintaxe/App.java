package ExTreinoSintaxe;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
      
        Scanner read = new Scanner(System.in);
        
        int fabricYear = 0;
        int semiNewTotal = 0;
        int totalCars = 0; 
        
        String carName;
        
        float carPrice = 0.0f;
        float discountAmount = 0.0f;
        float discountValue = 0.0f;
        float totalPrice = 0.0f;
        
        char repeat = 'y';
        
        while (repeat == 'y' || repeat == 'Y'  ){
            
                
            System.out.println("What is the car model?");
                carName = read.next();
            System.out.println("What is the fabrication year?");
                fabricYear = read.nextInt();
            System.out.println("What is the car price?");
                carPrice = read.nextFloat();
                
                if(fabricYear <= 2000){
                    discountAmount = 0.12f;
                
                } else {
                    discountAmount = 0.07f;
                    semiNewTotal++;
                }
                totalCars++;
                
            discountValue = carPrice * discountAmount;
            totalPrice = carPrice - discountValue;

            
            
            System.out.println("The car " + carName + " model "+ fabricYear 
                    + " has been registered. The discount value is: " 
                    + discountValue + "$." + "   The price to be paid is : "
                    + totalPrice + "$." );

            
            
            System.out.println("Want to make more registers?");
                repeat = read.next().charAt(0);

        }
        
        System.out.println("The total semi new car is: " + semiNewTotal);
        System.out.println("The total amout of cars is: " + totalCars);
        System.out.println("Goodbye!! :D");
        
    }
}