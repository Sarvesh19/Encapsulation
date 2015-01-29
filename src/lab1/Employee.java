package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;

    public Employee(String firstName,String lastName,String ssn) {
        this.currentDate = new Date();
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn = ssn;
    }
    
    
    public void startProcess(){
        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeId);        
        
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }
    
    
    
    private String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        return fmtDate;
    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
//        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//        String fmtDate = sdf.format(currentDate);
        System.out.println("Met with Hr on " + getDate());
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if(metWithHr) {
//            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//            String fmtDate = sdf.format(currentDate);
            System.out.println("Met with Dept. Staff on " +  getDate());
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
//            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//            String fmtDate = sdf.format(currentDate);
            System.out.println("Reviewed Dept. Policies on " + getDate());
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
//            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//            String fmtDate = sdf.format(currentDate);
            System.out.println("Moved into cube on " + getDate());
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
//        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
//        String fmtDate = sdf.format(currentDate);

        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + getDate();
        } else {
            return getDate() + ": Orientation in progress...";
        }
    }
}
