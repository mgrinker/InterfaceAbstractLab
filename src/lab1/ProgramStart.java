
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
        IntroToProgrammingCourse introProgSection1 = 
                new IntroToProgrammingCourse(); 
        
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
         
         //Display IntroToProgramming object
         System.out.println("Here is the course information");
         System.out.println("College name:\t"
                 + introProgSection1.getCOLLEGE_NAME());
         System.out.println("\t\tCollege address: " 
                 + introProgSection1.getCOLLEGE_ADDRESS()
                 + "\n\t\t" + introProgSection1.getCOLLEGE_CITY() + ", " 
                        + introProgSection1.getCOLLEGE_STATE() + "  "
                        + introProgSection1.getCOLLEGE_ZIP());
         System.out.println("Course name:\t"
                 + introProgSection1.getCOURSE_NAME());
         System.out.println("Course number:\t"
                 + introProgSection1.getCOURSE_NUMBER());
         System.out.println("Credits:\t"
                 + introProgSection1.getCREDITS());
         System.out.println("Prerequisite:\t"
                 + introProgSection1.getPREREQUISITES());
         System.out.println("Tuition:\t$"
                 + introProgSection1.getTUITION());
         System.out.println("Section number:\t"
                 + introProgSection1.getSectionNumber());
         System.out.println("Instructor:\t"
                 + introProgSection1.getInstructor());
         System.out.println("Room number:\t"
                 + introProgSection1.getRoomNumber());
         System.out.println("Section dates:\t"
                 + introProgSection1.getDates());
         System.out.println("Section days:\t"
                 + introProgSection1.getDaysOfWeek());
         System.out.println("Section time:\t"
                 + introProgSection1.getClassTime());
         System.out.println("Number of seats in section:\t"
                 + introProgSection1.getNumberOfSeats());
         
         
        
        
        
    }
    
}
