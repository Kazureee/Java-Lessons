import java.util.Scanner;
public class Java103SwitchCaseBoolean {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your department");
    String dept = input.nextLine();
    
    
    
    boolean dept_valid = true;
    switch(dept){
        case "CIT": 
            System.out.println("CIT");
        break;
        case "EEE": 
            System.out.println("EEE");
        break;
        case "ME": 
            System.out.println("ME");
        break;  
        default:
            dept_valid = false;
            System.out.println("invalid");
        break;
        }
    
    if (dept_valid) {
    System.out.println("Enter your year");
    int year = input.nextInt();
    
    switch(year){
        case 1:
            System.out.println("1st year");
        break;
        case 2:
            System.out.println("2nd year");
        break;
        case 3:
            System.out.println("3rd year");
        break;
        default:
            System.out.println("invalid");
        break;
            }       
        }
    }
    
}
