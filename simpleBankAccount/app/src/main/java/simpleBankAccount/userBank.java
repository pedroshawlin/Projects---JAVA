package simpleBankAccount;

import java.util.Scanner;

public class userBank {
    Scanner scan = new Scanner(System.in);
    
    String name = "User1565421";
    String accNumber = "82-35418/23";
    float balance = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
   
    
    public void changeName(){
        
        System.out.println("What name you want to be called?");
        this.name = scan.next();
        System.out.println("Thank you " + name);
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
    }
    
    public void deposit(){
        
        System.out.println("How much money you'll deposit?");
        this.balance = balance + scan.nextFloat();
        System.out.println("Your actual balance is: $"+ balance);
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
    }
    
    public void withdraw(){
        
        System.out.println("How much money you'll withdraw?");
        this.balance = balance - scan.nextFloat();
        System.out.println("Your actual balance is: $"+ balance);
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
    }
    
    public void seeInfo(){
        
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance+"$");
        System.out.println("Account number: " + accNumber);
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
    }
}

