/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Michael
 */
public interface GraduateInformation {

    String getAddress();

    String getAreaOfStudy();

    String getCourseName();

    String getEmail();

    String getFirstName();

    String getLastName();

    int getNumberOfCredits();

    String getPhone();

    String getStudentID();

    String getYearGraduated();

    void setAddress(String address);

    void setAreaOfStudy(String AreaOfStudy);

    void setCourseName(String courseName);

    void setEmail(String email);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setNumberOfCredits(int numberOfCredits);

    void setPhone(String phone);

    // This should set the student ID as final, it shouldn't change
    void setStudentID(String studentID);

    void setYearGraduated(String yearGraduated);
    
}
