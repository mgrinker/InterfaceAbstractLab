
package lab1;

/**
 *
 * @author mgrinker
 */
public abstract class CollegeCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private String instructor;
    private final String COLLEGE_NAME = "WCTC";
    private String roomNumber;
    private String daysOfWeek;
    private String classTime;

    public CollegeCourse(String courseName, String courseNumber, double credits, String prerequisites, String instructor, String roomNumber, String daysOfWeek, String classTime) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
        this.instructor = instructor;
        this.roomNumber = roomNumber;
        this.daysOfWeek = daysOfWeek;
        this.classTime = classTime;
    }
    
    public abstract void setCourseName(String courseName);
    
    public abstract void setCourseNumber(String courseNumber);

    public abstract void setCredits(double credits);

    public abstract void setPrerequisites(String prerequisites); 

    public abstract void setInstructor(String instructor);
    
    public abstract void setRoomNumber(String roomNumber);

    public abstract void setDaysOfWeek(String daysOfWeek);

    public abstract void setClassTime(String classTime);

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getCOLLEGE_NAME() {
        return COLLEGE_NAME;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public String getClassTime() {
        return classTime;
    }
       
    
    
}
