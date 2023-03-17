import java.util.Scanner; 
public class Java102ScannerWithOperations {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 

        System.out.println("Enter your First Number");
        double num1 = input.nextDouble();

        System.out.println("Enter your Second Number");
        double num2 = input.nextDouble();

        System.out.println("Enter your Third Number");
        double num3 = input.nextDouble();

        double ave = (num1 + num2 + num3) / 3;

        System.out.println("The Average is " + ave);
    }
    
}
