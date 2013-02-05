/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Michael
 */
public class GraduateStudent extends Enrollee implements GraduateInformation {
    
    private String yearGraduated;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String studentID;
    private String AreaOfStudy;
    private String courseName;
    private int numberOfCredits;

    @Override
    public String getYearGraduated() {
        return yearGraduated;
    }

    @Override
    public void setYearGraduated(String yearGraduated) {
        this.yearGraduated = yearGraduated;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getStudentID() {
        return studentID;
    }
    // This should set the student ID as final, it shouldn't change
    @Override
    public final void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String getAreaOfStudy() {
        return AreaOfStudy;
    }

    @Override
    public void setAreaOfStudy(String AreaOfStudy) {
        this.AreaOfStudy = AreaOfStudy;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    @Override
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    
    
            
    
}

