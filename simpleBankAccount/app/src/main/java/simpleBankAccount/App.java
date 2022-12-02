package simpleBankAccount;

import java.util.Scanner;


public class App {
    
    public static void menu(){
        System.out.println("Welcome to Shaw's Bank!");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        System.out.println("What you want to do?");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        System.out.println("0. End");
        System.out.println("1. See my bank infos(Account number and Balance)");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Change Name");
    }

    
    
    public static void main(String[] args) {
        int option;
        Scanner scan = new Scanner(System.in);
        userBank client = new userBank();
        
        do{         
            menu();
            option = scan.nextInt();
            
            switch(option){
            case 1:
                client.seeInfo();
                break;
                
            case 2:
                client.deposit();
                break;
                
            case 3:
                client.withdraw();
                break;
                
            case 4:
                client.changeName();
                break;
            
            default:
                System.out.println("invalid option");
            }
        } while(option != 0);
        
    
    }
}
