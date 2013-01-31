
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

    public abstract void setCourseName(String courseName);
    
    public abstract void setCourseNumber(String courseNumber);

    public abstract void setCredits(double credits);

    public abstract void setPrerequisites(String prerequisites); 

    public abstract void setInstructor(String instructor);
    
    public abstract void setRoomNumber(String roomNumber);

    public abstract void setDaysOfWeek(String daysOfWeek);

    public abstract void setClassTime(String classTime);
       
}
