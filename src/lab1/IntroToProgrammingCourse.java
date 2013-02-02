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

    public IntroToProgrammingCourse(String sectionNumber, String instructor,
            String roomNumber, String dates, String daysOfWeek,
            String classTime, int numberOfSeats) {
        this.sectionNumber = sectionNumber;
        this.instructor = instructor;
        this.roomNumber = roomNumber;
        this.dates = dates;
        this.daysOfWeek = daysOfWeek;
        this.classTime = classTime;
        this.numberOfSeats = numberOfSeats;
    }

//    public final void setCourseNumber(String courseNumber) {
//        if(courseNumber == null || courseNumber.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseNumber cannot be null of empty string");
//            System.exit(0);
//        }
//    }

    
    
//    public void setInstructor(String instructor) {
//        if(instructor == null || instructor.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: instructor cannot be null of empty string");
//            System.exit(0);
//        }
//    }
//    
//    public void setRoomNumber(String roomNumber) {
//        if(roomNumber == null || roomNumber.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: roomNumber cannot be null of empty string");
//            System.exit(0);
//        }
//    }
//    
//    public void setDaysOfWeek(String daysOfWeek) {
//        if(daysOfWeek == null || daysOfWeek.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: daysOfWeek cannot be null of empty string");
//            System.exit(0);
//        }
//    }
//    
//    public void setClassTime(String classTime) {
//        if(classTime == null || classTime.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: classTime cannot be null of empty string");
//            System.exit(0);
//        }
//    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
    
    
    
    

    
}
