
/**
 * Write a description of class Droupout here.
 *
 * @author (Bimash Dulal )
 * @version (a version number or a date)
 */

public class Dropout extends Student {
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;

    public Dropout(int enrollmentID, String dateOfBirth, String courseName,
                   String studentName, String dateOfEnrollment, int tuitionFee,
                   int courseDuration, int numOfRemainingModules, String dateOfDropout,
                   int numOfMonthsAttended) {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        super.setenrollmentID(enrollmentID);
        super.setcourseName(courseName);
        super.setdateOfEnrollment(dateOfEnrollment );
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }
    //gettermethod
    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }
    //gettermethod
    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }
    //gettermethod
    public String getDateOfDropout() {
        return dateOfDropout;
    }
    //gettermethod
    public int getRemainingAmount() {
        return remainingAmount;
    }
   
    public boolean isHasPaid() {
        return hasPaid;
    }

    public void billsPayable() {
        this.remainingAmount = (getcourseDuration() - this.numOfMonthsAttended) * 100;
        this.hasPaid = true;
    }

    public void removeStudent() {
        if (this.hasPaid) {
            super.setdateOfbirth("");
            super.setcourseName("");
            super.setstudentName("");
            super.setdateOfEnrollment("");
            super.setcourseDuration(0);
            super.settutionFee(0);
            super.setenrollmentID(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.dateOfDropout = "";
            this.remainingAmount = 0;
        } else {
            System.out.println("All bills has not been cleared");
        }
    }

    public void display() {
        super.display();
        System.out.println("Number of remaining modules: " + this.numOfRemainingModules);
        System.out.println("Number of months attended: " + this.numOfMonthsAttended);
        System.out.println("Date of dropout: " + this.dateOfDropout);
        System.out.println("Remaining amount: " + this.remainingAmount);
    }
}
