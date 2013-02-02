
package lab2;

/**
 *
 * @author Michael Grinker
 */
public abstract class CollegeCourse {
    
    
    private final String COLLEGE_NAME = "WCTC";
    private final String COLLEGE_ADDRESS = "800 Main St.";
    private final String COLLEGE_CITY = "Pewaukee";
    private final String COLLEGE_STATE = "WI";
    private final String COLLEGE_ZIP = "53072";

    public CollegeCourse() {
    }

    public String getCOLLEGE_NAME() {
        return COLLEGE_NAME;
    }

    public String getCOLLEGE_ADDRESS() {
        return COLLEGE_ADDRESS;
    }

    public String getCOLLEGE_CITY() {
        return COLLEGE_CITY;
    }

    public String getCOLLEGE_STATE() {
        return COLLEGE_STATE;
    }

    public String getCOLLEGE_ZIP() {
        return COLLEGE_ZIP;
    }
    //Abstract setter methods for sub classes
    //This is to make sure variables are set in the subclassess for the courses
    public abstract void setSectionNumber(String sectionNumber);
    public abstract void setInstructor(String instructor);
    public abstract void setRoomNumber(String roomNumber);
    public abstract void setDates(String dates);
    public abstract void setDaysOfWeek(String daysOfWeek);
    public abstract void setClassTime(String classTime);
    public abstract void setNumberOfSeats(int numberOfSeats);
    
    //Abstract getter methods
    //This is make sure methods are set in the subclasses to get the information
    public abstract String getSectionNumber();
    public abstract String getInstructor();
    public abstract String getRoomNumber();
    public abstract String getDates();
    public abstract String getDaysOfWeek();
    public abstract String getClassTime();
    public abstract int getNumberOfSeats();
   
}
