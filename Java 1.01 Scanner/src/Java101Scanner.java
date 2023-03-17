import java.util.Scanner;
public class Java101Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your address");
        String address = input.nextLine(); 
        
        System.out.println("For how long?");
        String years = input.nextLine(); 
        
        System.out.println("You live in " + address + " for " + years + " years.");
    }
    
}
