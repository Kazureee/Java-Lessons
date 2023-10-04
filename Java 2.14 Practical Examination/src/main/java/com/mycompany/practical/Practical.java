package com.mycompany.practical;
import java.util.*;

class info {
    private String number;
    private String name;
    private String details;
    private String severity;

    public info(String number, String name, String details, String severity){
        this.number = number;
        this.name = name;
        this.details = details;
        this.severity = severity;
    }

    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public String getDetails(){
        return details;
    }
    public String getSeverity(){
        return severity;
    }
}

public class Practical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<info> queue = new LinkedList<>(); 

        while(true){
            System.out.println("Choose a number: ");
            System.out.println("[1] Create a ticket");
            System.out.println("[2] Close a ticket ");
            System.out.println("[3] Display open tickets");
            System.out.println("[4] Exit");

            int num = input.nextInt();

            switch(num){    
                case 1:
                    while (true){
                        System.out.println("Enter ticket number: ");
                        String number = input.next();
                        System.out.println("Enter customer name: ");
                        String name = input.next();
                        System.out.println("Enter ticket details: ");
                        String details = input.next();
                        System.out.println("Enter severity (1-High, 2-Medium, 3-Low): ");
                        int severityChoice = input.nextInt();
                        String severity;
                        switch(severityChoice){
                            case 1:
                                severity = "1- High severity level";
                                break;
                            case 2:
                                severity = "2 - Medium severity level";
                                break;
                            case 3:
                                severity = "3 - Low severity level";
                                break;
                            default:
                                severity = "Invalid";
                                break;
                        }

                        queue.add(new info(number, name, details, severity)); 
                        System.out.println("Added successfully");
                        System.out.println("Do you want to create another ticket [Y/N]");
                        String create = input.next();
                        if(!create.equalsIgnoreCase("Y")) {
                            break; 
                        }  
                    }
                    break;
                    
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Enter ticket number to delete: ");
                        String ticketToDelete = input.next();
                        boolean found = false;
                        
                        Iterator<info> iterator = queue.iterator();
                        while (iterator.hasNext()) {
                            info ticket = iterator.next();
                            if (ticket.getNumber().equals(ticketToDelete)) {
                                System.out.println("Ticket Number " + ticket.getNumber() + " was raised by customer " + ticket.getName() + " about " + ticket.getDetails() + " This ticket has severity of " + ticket.getSeverity());

                                System.out.println("Do you want to delete this ticket? [Y/N]");
                                String confirmDelete = input.next();
                                if (confirmDelete.equalsIgnoreCase("Y")) {
                                    iterator.remove(); 
                                    found = true;
                                    System.out.println("Ticket " + ticketToDelete + " is Closed");
                                    System.out.println("Open tickets: ");
                                if(!queue.isEmpty()){
                                
                                for (info person : queue) {
                            System.out.println(person.getNumber());
                        }
                    }
                    else {
                        System.out.println("No open tickets.");
                    }

                                } else {
                                    System.out.println("Ticket " + ticketToDelete + " is not deleted.");
                                }
                                break; 
                            }
                        }
                        

                        if (!found) {
                            System.out.println("Ticket " + ticketToDelete + " not found.");
                        }
                    } else {
                        System.out.println("No open tickets to close.");
                    }
                    break;          
                case 3:
                    if(!queue.isEmpty()){
                        System.out.println("Open tickets: ");
                        for (info person : queue) {
                            System.out.println("Ticket Number " + person.getNumber() + " was raised by customer " + person.getName() + " about " + person.getDetails() + " This ticket has severity of " + person.getSeverity());
                        }
                    }
                    else {
                        System.out.println("No open tickets.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Option.");
            }
        }
    }
}