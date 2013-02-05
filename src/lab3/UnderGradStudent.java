
package lab3;

/**
 *
 * @author Michael
 */
public class UnderGradStudent extends Enrollee {
   
    // None of these variables shoud be final because any could change
    // Except for student ID
    
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String studentID;
    private String AreaOfStudy;
    private String courseName;
    private int numberOfCredits;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }
    // This should set the student ID as final, it shouldn't change
    public final void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getAreaOfStudy() {
        return AreaOfStudy;
    }

    public void setAreaOfStudy(String AreaOfStudy) {
        this.AreaOfStudy = AreaOfStudy;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    
    
            
    
}
