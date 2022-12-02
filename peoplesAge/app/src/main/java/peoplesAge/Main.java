package peoplesAge;

import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        People userName =  new People();
        
        System.out.println("Welcome to this...");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        System.out.println("...hm..!");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        System.out.println("Software!");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        
        System.out.println("Tell me. What's your name?");
            userName.setName(scan.nextLine());
        
        System.out.println("Nice to meet you " + userName.getName() +"!");
        try { Thread.sleep (4000); } catch (InterruptedException ex) {}
        
        System.out.println("How tall are you?");
            userName.setHeight(scan.nextFloat());
        
        System.out.println("What year were you born?");
            userName.setBirthYear(scan.nextInt());

        System.out.println("Wow...");
        try { Thread.sleep (4000); } catch (InterruptedException ex) {}
        System.out.println("Nothing personal...");
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        
        System.out.println("What month were you born? The number, i mean...");
            userName.setBirthMonth(scan.nextInt());
        
        System.out.println("Finally, which day?");
            userName.setBirthDay(scan.nextInt());
        
        System.out.println("At last but not least. What year is today?");
            userName.setActualYear(scan.nextInt());
            
            int age = userName.getActualYear() - userName.getBirthYear();
            
            
        System.out.println("So, your name is " + userName.getName()
                            + ". You are " + age + " Years old" 
                            + " And you have  " + userName.getHeight()+"Meters");
    }
}
