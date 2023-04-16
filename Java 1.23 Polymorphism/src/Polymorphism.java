public class Polymorphism {
    public static void main(String[] args) {
        Student student = new Student(); //parent class         
        Student student1 = new Student1();       
        Student student2 = new Student2();     
        student.displayName();  
        student1.displayName();
        student2.displayName();
    }
    
}
