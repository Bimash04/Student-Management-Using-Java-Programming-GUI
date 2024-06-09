

/**-
 * @author (Bimash Dulal )
 * @version (a version number or a date)
 */
public class Student
{
   private int enrollmentID = 0;
   private int courseDuration;
   private String dateOfbirth;
   private String courseName;
   private String studentName;
   private String dateOfEnrollment;
   private double tutionFee;
   //constructor for student class with 4 parameters
   public Student(String dateOfbirth, String studentName, int courseDuration, double tutionFee)
   {
       this.enrollmentID = 0;
       this.courseDuration = courseDuration;
       this.dateOfbirth = dateOfbirth;
       this.studentName = studentName;
       this.tutionFee = tutionFee;
       this.courseName = "";
       this.dateOfEnrollment = "";
   }
   //getter method
   public int getenrollmentID()
   {
       return enrollmentID;
   }
   
   public String getdateOFbirth()
   {
       return dateOfbirth;
   }
   
   public String getcourseName()
   {
       return this.courseName;
   }
   
   public String getstudentName()
   {
       return studentName;
   }
   
   public String getdateOfenrollment()
   {
       return dateOfEnrollment;
   }
   
   public int getcourseDuration()
   {
       return courseDuration;
   }
   
   public double gettutionFee()
   {
       return tutionFee;
   }
   //setter method
   public void setenrollmentID(int enrollmentID)
   {
       this.enrollmentID = enrollmentID;
   }
   
   public void setcourseDuration(int courseDuration)
   {
       this.courseDuration = courseDuration;
   }
   
   public void setdateOfbirth(String dateOfbirth)
   {
       this.dateOfbirth = dateOfbirth;
   }
   
   public void setcourseName(String courseName)
   {
       this.courseName = courseName;
    }
   
    public void setstudentName(String studentName)
    {
        this.studentName = studentName;
    }
   
    public void setdateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment = dateOfEnrollment;
    }
   
    public void settutionFee(double tutionFee)
    {
        this.tutionFee = tutionFee;
    }
   
    public void display()
    {
        if (enrollmentID == 0 || dateOfbirth == null || courseName == null || studentName == null || dateOfEnrollment == null)
        {
            System.out.println("Some attributes have not been set yet.");
        }
        else
        {
            int yearsEnrolled = (int)
            Math.floor(courseDuration/12);
            System.out.println("Enrollment ID:" + enrollmentID);
            System.out.println("Date of Birth:" + dateOfbirth);
            System.out.println("Course Name:" + courseName);
            System.out.println("Student Name:" + studentName);
            System.out.println("Years Enrolled:" + yearsEnrolled);
            System.out.println("Course Duration:" + courseDuration + "months");
            System.out.println("Tution Fee:$" + tutionFee);
        }
    }
   
}