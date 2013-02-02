package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Michael Grinker
 * @version     1.00
 */
public class IntroJavaCourse extends CollegeCourse
    implements CourseSection{
    
    private final String COURSE_NAME = "Into to Java";
    private final String COURSE_NUMBER = "152-134";
    private final double CREDITS = 4;
    private final String PREREQUISITES = "Intro to Programming";
    private final double TUITION = 508.60;
    private String sectionNumber;
    private String instructor;
    private String roomNumber;
    private String dates;
    private String daysOfWeek;
    private String classTime;
    private int numberOfSeats;
    
    public IntroJavaCourse() {
    }

    public IntroJavaCourse(String sectionNumber, String instructor, String roomNumber, String dates, String daysOfWeek, String classTime, int numberOfSeats) {
        this.sectionNumber = sectionNumber;
        this.instructor = instructor;
        this.roomNumber = roomNumber;
        this.dates = dates;
        this.daysOfWeek = daysOfWeek;
        this.classTime = classTime;
        this.numberOfSeats = numberOfSeats;
    }

    
    
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

    public String getCOURSE_NAME() {
        return COURSE_NAME;
    }

    public String getCOURSE_NUMBER() {
        return COURSE_NUMBER;
    }

    public double getCREDITS() {
        return CREDITS;
    }

    public String getPREREQUISITES() {
        return PREREQUISITES;
    }

    public double getTUITION() {
        return TUITION;
    }
}