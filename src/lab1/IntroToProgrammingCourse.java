package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Michael Grinker
 * @version     1.00
 */
public class IntroToProgrammingCourse extends CollegeCourse{

    private final String COURSE_NAME = "Into to Programming";
    private final String COURSE_NUMBER = "152-107";
    private final double CREDITS = 2;
    private final String PREREQUISITES = "None";
    private final double TUITION = 254.30;
    private String sectionNumber;
    private String instructor;
    private String roomNumber;
    private String dates;
    private String daysOfWeek;
    private String classTime;
    private int numberOfSeats;
    
    
    
    public IntroToProgrammingCourse(String courseName, String courseNumber, 
            double credits, String prerequisites, String instructor, 
            String roomNumber, String daysOfWeek, String classTime) {
        super(courseName, courseNumber, credits, prerequisites, instructor,
                roomNumber, daysOfWeek, classTime);
    }

    
    
    
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
    }
    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }
    
    public void setInstructor(String instructor) {
        if(instructor == null || instructor.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: instructor cannot be null of empty string");
            System.exit(0);
        }
    }
    
    public void setRoomNumber(String roomNumber) {
        if(roomNumber == null || roomNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: roomNumber cannot be null of empty string");
            System.exit(0);
        }
    }
    
    public void setDaysOfWeek(String daysOfWeek) {
        if(daysOfWeek == null || daysOfWeek.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: daysOfWeek cannot be null of empty string");
            System.exit(0);
        }
    }
    
    public void setClassTime(String classTime) {
        if(classTime == null || classTime.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: classTime cannot be null of empty string");
            System.exit(0);
        }
    }
    
    
    
    

    
}
