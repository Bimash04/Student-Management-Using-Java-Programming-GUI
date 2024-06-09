

/**-
 * @author (Bimash Dulal )
 * @version (a version number or a date)
 */


public class Regular extends Student {
    private int numOfmodules;
    private int numOfcreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

public Regular(int enrollmentID, String dateOfBirth, String courseName,
                   String studentName, String dateOfEnrollment, int courseDuration,
                   int tuitionFee, int numOfmodules, int numOfcreditHours, double daysPresent) {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setenrollmentID( enrollmentID );
        super.setcourseName(courseName);
        super.setdateOfEnrollment(dateOfEnrollment);
        this.numOfmodules = numOfmodules;
        this.numOfcreditHours = numOfcreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }
    //getter method
public int getNumOfmodules() {
        return numOfmodules;
    }
    //setter method
public void setNumOfmodules(int numOfmodules) {
        this.numOfmodules = numOfmodules;
    }
    //getter method
public int getNumOfCreditHours() {
        return numOfcreditHours;
    }
    //setter method
public void setNumOfCreditHours(int numOfcreditHours) {
        this.numOfcreditHours = numOfcreditHours;
    }
    //getter method
public double getDaysPresent() {
        return daysPresent;
    }
    //setter method
public void setDaysPresent(double daysPresent) {
        this.daysPresent = daysPresent;
    }
    //getter method
public boolean getisGrantedScholarship() {
        return isGrantedScholarship;
    }
    //setter method
public void setisGrantedScholarship(boolean isGrantedScholarship) {
        this.isGrantedScholarship = isGrantedScholarship;
    }

    public String presentPercentage(double daysPresent)
    {
        String bimash = "";
        if((super.getcourseDuration()*30)< daysPresent){
            System.out.println("some value is not insert");
        }
        else{
        double presentPercentage = (daysPresent / getcourseDuration() *30 )* 100;
        {
            if (presentPercentage >= 80 && presentPercentage<=100) {
            setisGrantedScholarship(true);
            return "A";
        } else if (presentPercentage >= 60) {
            setisGrantedScholarship(false);
            return "B";
        } else if (presentPercentage >= 40) {
            setisGrantedScholarship(false);
            return "C";
        } else if (presentPercentage >= 20) {
            setisGrantedScholarship(false);
            return "D";
        } else {
            setisGrantedScholarship(false);
            return "E";
        }
    }
}
         return bimash;
}

public void grantCertificate(String courseName, int enrollmentId, String dateOfEnrollment) {
        System.out.println(getstudentName() + " has graduated in " + courseName + " with enrollment ID " +
                enrollmentId + " and date of enrollment " + dateOfEnrollment + ".");

        if (getisGrantedScholarship()) {
            System.out.println("The scholarship has been granted.");
       
    }
}
public void displayDetails() {
        System.out.println("Enrollment ID: " +getenrollmentID());
        System.out.println("Student Name: " +getstudentName());
        System.out.println("Date of Birth: " + getdateOFbirth());
        System.out.println("Course Name: " + getcourseName());
        System.out.println("Date of Enrollment: " + getdateOfenrollment());
        System.out.println("Course Duration: " + getcourseDuration());
        System.out.println("Tuition Fee: " + gettutionFee());
        System.out.println("Number of Modules: " + getNumOfmodules());
        System.out.println("Number of Credit Hours: " + getNumOfCreditHours());
        System.out.println("Days Present: " + getDaysPresent());
        System.out.println("Scholarship Granted: " + getisGrantedScholarship());
    }
}