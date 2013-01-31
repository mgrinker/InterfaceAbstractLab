
package lab1;
import java.util.Scanner;

/**
 *
 * @author mgrinker
 */
public class ProgramStart {
    
     public static void main(String[] args) {
        
         String cName,
                 cNumber,
                 cPrerequisires,
                 cInstructor,
                 cRoomNumber,
                 daysOfWeek,
                 cClassTime;
         double cCredits;
                 
        // Create Scanner object for inputs
        Scanner keyboard = new Scanner(System.in);
        
        // Create IntroToProgrammingCourse object
        
         System.out.println("You are going to enter the information for an"
                 + " Introductory to Programming course");
         System.out.println("What is the instructor name? ");
         cInstructor = keyboard.nextLine();
         System.out.println("What is the room number for the course? ");
         cRoomNumber = keyboard.nextLine();
         System.out.println("What days of the week does the class meet? ");
         daysOfWeek = keyboard.nextLine();
         
        
        
        
    }
    
}
