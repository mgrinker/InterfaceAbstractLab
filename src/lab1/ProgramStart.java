
package lab1;
import java.util.Scanner;

/**
 *
 * @author mgrinker
 */
public class ProgramStart {
    
     public static void main(String[] args) {
        
         String classSection,
                 classInstructor,
                 classRoomNumber,
                 classDates,
                 classDays,
                 classTime;
         int classNumberOfSeats;
                 
        // Create Scanner object for inputs
        Scanner keyboard = new Scanner(System.in);
        
        // Create IntroToProgrammingCourse object
        CollegeCourse introProgSection1 = new IntroToProgrammingCourse(); 
        
        //Get section number, validate and set
         System.out.println("You are going to enter the information for an"
                 + " Introductory to Programming course");
         System.out.println("What is the section number: ");
         classSection = keyboard.nextLine();
         while(classSection == null || classSection.length() == 0){
             System.out.println("You need to enter a section number");
             System.out.println("What is the section number: ");
             classSection = keyboard.nextLine();
         }
         introProgSection1.setSectionNumber(classSection);
         
          //Get instructor, validate and set
         System.out.println("What is the instructor name: ");
         classInstructor = keyboard.nextLine();
         while(classInstructor == null || classInstructor.length() == 0){
             System.out.println("You need to enter a section number");
             System.out.println("What is the instructor name: ");
             classInstructor = keyboard.nextLine();
         }
         introProgSection1.setInstructor(classInstructor);
         
          //Get section number, validate and set
         System.out.println("What is the room number: ");
         classRoomNumber = keyboard.nextLine();
         while(classRoomNumber == null || classRoomNumber.length() == 0){
             System.out.println("You need to enter a room number");
             System.out.println("What is the room number: ");
             classRoomNumber = keyboard.nextLine();
         }
         introProgSection1.setRoomNumber(classRoomNumber);
         
          //Get class dates, validate and set
         System.out.println("What are the dates for the class: ");
         classDates = keyboard.nextLine();
         while(classDates == null || classDates.length() == 0){
             System.out.println("You need to enter the dates for the class");
             System.out.println("What are the dates for the class: ");
             classDates = keyboard.nextLine();
         }
         introProgSection1.setDates(classDates);
         
          //Get class days, validate and set
         System.out.println("What days does the class meet: ");
         classDays = keyboard.nextLine();
         while(classDays == null || classDays.length() == 0){
             System.out.println("You need to enter the class days");
             System.out.println("What days does the class meet: ");
             classDays = keyboard.nextLine();
         }
         introProgSection1.setDaysOfWeek(classDays);
         
          //Get class time, validate and set
         System.out.println("What time does the class meet: ");
         classTime = keyboard.nextLine();
         while(classTime == null || classTime.length() == 0){
             System.out.println("You need to enter a class time");
             System.out.println("What time does the class meet: ");
             classTime = keyboard.nextLine();
         }
         introProgSection1.setClassTime(classTime);
         
          //Get number of seats, validate and set
         System.out.println("How many seats are in this section: ");
         classNumberOfSeats = keyboard.nextInt();
         while(classNumberOfSeats <= 0) {
             System.out.println("You need to enter a positive number");
             System.out.println("How many seats are in this section: ");
             classNumberOfSeats = keyboard.nextInt();
         }
         introProgSection1.setNumberOfSeats(classNumberOfSeats);
         
         
         
        
        
        
    }
    
}
