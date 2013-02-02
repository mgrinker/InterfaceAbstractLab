
package lab2;

/**
 *
 * @author Michael Grinker
 */
public interface CourseSection {
   
    
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
