package Inheritance;

import org.w3c.dom.css.Rect;

public class Inheritance {
    public static void main(String[] args) {

        
        int[] arr = new int[3];

        
        try{
            System.out.println("before exception");
            int value = arr[-1];
            System.out.println("Is this going to display with an error");
        }catch(Exception exception){
            System.out.println("Exception: " + exception);
        }finally {
            System.out.println("Hit the finally");
        }
        
    
        System.out.println("after exception");
        
        Student student = new Student("Zhe");
        student.gpa = 3.0f;
        System.out.println(student.GetName());

        Instructor instructor = new Instructor("Donald");
        instructor.salary = 50000;
        System.out.println(instructor.GetName());

        User user = new User("Justin");

        System.out.println(student instanceof Student);
        System.out.println(student instanceof User);
        //System.out.println(instructor instanceof Student);
        System.out.println(instructor instanceof User);
  

        Triangle triangle = new Triangle(5, 10);
        System.out.println(triangle.GetArea());

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.GetArea());

        Circle circle = new Circle(5);
        System.out.println(circle.GetArea());

    }
    
}
