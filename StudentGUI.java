import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

public class StudentGUI {
    JFrame chooseFrame, regularFrame, presentPercentageFrame, granCertFrame, dropoutFrame;
    JPanel regdrPanel, regularPanel, presentPercentagePanel, granCertPanel, dropoutPanel, payOrRemove;
    JLabel enrollId, name2, dob2, coursesName, courseDuration2, dateOfEnroll, tutionFee2, enrollId2, enrollId3, enrollId4, noOfDaysPresen, coursName, dOfEnroll,
            noOfModules, noOfCreditHours, presentDays, noOfRemainingModules, noOfMonthsAttended, dateOfDropout;
    JTextField enrollmentIdField, nameField, dobField, courseNameField, courseDurationField, tutionFeeField,
            enrollId2Field, enrollIdFieldGrnt, enrollId3Field, enrollId4Field, noOfDaysPresenField, coursField, noOfModulesField, noOfCreditHoursField, presentDaysField,
            noOfRemainingModulesField, noOfMonthsAttendedField;
    JButton clearBtn, regularStdBtn, dropoutStdBtn, backBtn2, backBtn4, calculatePresenPercenBtn, displayBtn2,
            displayBtn3, addRegStdBtn, addDropStdBtn, grantCertificateBtn, grantCertificateBtn2, removeStdBtn, presentPercentageBtn,
            payBillsBtn, clearBtn2, clearBtn3;
    JComboBox<String> dobYear, dobMonth, dobDay, enrollYear, enrollMonth, enrollDay, dropoutYear, dropoutMonth,
            dropoutDay, doEnrollYear, doEnrollMonth, doEnrollDay, enYear, enMonth, enDay;
    final static int INVALID = -1;
    boolean studentObj, regularObj, dropoutObj;
    ArrayList<Student> student = new ArrayList<Student>();

    public StudentGUI() {
        // next frame
        chooseFrame = new JFrame();
        chooseFrame.setSize(450, 530);
        chooseFrame.setLocationRelativeTo(null);
        chooseFrame.setLayout(null);
        chooseFrame.setResizable(false);
        chooseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel for student
        regdrPanel = new JPanel();
        regdrPanel.setBounds(37, 30, 360, 430);
        regdrPanel.setLayout(null);
        regdrPanel.setBackground(Color.decode("#03ebfc"));
        chooseFrame.add(regdrPanel);

        // border for choosing panel
        Font chooseFont = new Font(Font.SERIF, Font.BOLD, 13);
        Border chooseLineBorder = BorderFactory.createLineBorder(Color.black);
        Border chooseTitledBorder = BorderFactory.createTitledBorder(chooseLineBorder, "Regular or Droupout",
                TitledBorder.CENTER,
                TitledBorder.TOP, chooseFont, Color.black);
        regdrPanel.setBorder(chooseTitledBorder);

        // attributes of student
        enrollId = new JLabel("Enrollment Id");
        enrollId.setBounds(10, 33, 105, 15);
        regdrPanel.add(enrollId);

        name2 = new JLabel("Name");
        name2.setBounds(10, 83, 105, 15);
        regdrPanel.add(name2);

        dob2 = new JLabel("Date Of Birth");
        dob2.setBounds(10, 133, 105, 15);
        regdrPanel.add(dob2);

        coursesName = new JLabel("Course Name");
        coursesName.setBounds(10, 183, 90, 15);
        regdrPanel.add(coursesName);

        courseDuration2 = new JLabel("Course Duration");
        courseDuration2.setBounds(10, 233, 95, 15);
        regdrPanel.add(courseDuration2);

        dateOfEnroll = new JLabel("Date Of Enrollment");
        dateOfEnroll.setBounds(10, 283, 112, 15);
        regdrPanel.add(dateOfEnroll);

        tutionFee2 = new JLabel("Tution Fee");
        tutionFee2.setBounds(10, 333, 75, 15);
        regdrPanel.add(tutionFee2);

        // Textfield size and location of attributes of regular or droupout
        enrollmentIdField = new JTextField();
        enrollmentIdField.setBounds(122, 30, 230, 25);
        regdrPanel.add(enrollmentIdField);

        nameField = new JTextField();
        nameField.setBounds(122, 80, 230, 25);
        regdrPanel.add(nameField);

        // ComboBox
        String[] data7 = { "Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007" };
        dobYear = new JComboBox<String>(data7);
        dobYear.setBounds(122, 133, 60, 25);
        regdrPanel.add(dobYear);

        String[] data8 = { "Month", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        dobMonth = new JComboBox<String>(data8);
        dobMonth.setBounds(192, 133, 97, 25);
        regdrPanel.add(dobMonth);

        String[] data9 = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" };
        dobDay = new JComboBox<String>(data9);
        dobDay.setBounds(300, 133, 50, 25);
        regdrPanel.add(dobDay);

        courseNameField = new JTextField();
        courseNameField.setBounds(122, 180, 230, 25);
        regdrPanel.add(courseNameField);

        courseDurationField = new JTextField();
        courseDurationField.setBounds(122, 230, 230, 25);
        regdrPanel.add(courseDurationField);

        // ComboBox
        String[] data1 = { "Year", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" };
        enrollYear = new JComboBox<String>(data1);
        enrollYear.setBounds(122, 280, 60, 25);
        regdrPanel.add(enrollYear);

        String[] data2 = { "Month", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        enrollMonth = new JComboBox<String>(data2);
        enrollMonth.setBounds(192, 280, 97, 25);
        regdrPanel.add(enrollMonth);

        String[] data3 = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" };
        enrollDay = new JComboBox<String>(data3);
        enrollDay.setBounds(300, 280, 50, 25);
        regdrPanel.add(enrollDay);

        tutionFeeField = new JTextField();
        tutionFeeField.setBounds(122, 330, 230, 25);
        regdrPanel.add(tutionFeeField);

        // regular button to go to the next frame
        regularStdBtn = new JButton("Regular");
        regularStdBtn.setBounds(90, 365, 80, 25);
        regdrPanel.add(regularStdBtn);

        regularStdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addRegDetails();
            }
        });

        // dropout button to go to the next frame
        dropoutStdBtn = new JButton("Dropout");
        dropoutStdBtn.setBounds(200, 365, 80, 25);
        regdrPanel.add(dropoutStdBtn);

        dropoutStdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addDropDetails();
            }
        });

        // clear button to clear all the values of main frame
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(148, 400, 70, 25);
        regdrPanel.add(clearBtn);

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String obj = a.getActionCommand();
                if (obj.equals("Clear")) {
                    enrollmentIdField.setText("");
                    nameField.setText("");
                    courseNameField.setText("");
                    courseDurationField.setText("");
                    tutionFeeField.setText("");
                    enrollYear.setSelectedIndex(0);
                    enrollMonth.setSelectedIndex(0);
                    enrollDay.setSelectedIndex(0);
                    dobYear.setSelectedIndex(0);
                    dobMonth.setSelectedIndex(0);
                    dobDay.setSelectedIndex(0);

                }
            }
        });

        // next frame for regular student
        regularFrame = new JFrame();
        regularFrame.setSize(380, 400);
        regularFrame.setLocationRelativeTo(null);
        regularFrame.setLayout(null);
        regularFrame.setResizable(false);
        regularFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // next frame for calculating present percentage
        presentPercentageFrame = new JFrame();
        presentPercentageFrame.setSize(380, 330);
        presentPercentageFrame.setLocationRelativeTo(null);
        presentPercentageFrame.setLayout(null);
        presentPercentageFrame.setResizable(false);
        presentPercentageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // next frame for granting certificate
        granCertFrame = new JFrame();
        granCertFrame.setSize(380, 330);
        granCertFrame.setLocationRelativeTo(null);
        granCertFrame.setLayout(null);
        granCertFrame.setResizable(false);
        granCertFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel for regular student
        regularPanel = new JPanel();
        regularPanel.setBounds(33, 27, 300, 310);
        regularPanel.setLayout(null);
        regularPanel.setBackground(Color.decode("#03ebfc"));
        regularFrame.add(regularPanel);

        // panel for calculating present percentage
        presentPercentagePanel = new JPanel();
        presentPercentagePanel.setBounds(33, 27, 300, 240);
        presentPercentagePanel.setLayout(null);
        presentPercentagePanel.setBackground(Color.decode("#03ebfc"));
        presentPercentageFrame.add(presentPercentagePanel);

        // panel for granting certificate
        granCertPanel = new JPanel();
        granCertPanel.setBounds(33, 27, 300, 240);
        granCertPanel.setLayout(null);
        granCertPanel.setBackground(Color.decode("#03ebfc"));
        granCertFrame.add(granCertPanel);

        // border for regular panel
        Font regularFont = new Font(Font.SERIF, Font.BOLD, 13);
        Border regularLineBorder = BorderFactory.createLineBorder(Color.black);
        Border regularTitledBorder = BorderFactory.createTitledBorder(regularLineBorder, "Regular Student",
                TitledBorder.CENTER,
                TitledBorder.TOP, regularFont, Color.black);
        regularPanel.setBorder(regularTitledBorder);

        // border for present percentage panel
        Font presenFont = new Font(Font.SERIF, Font.BOLD, 13);
        Border presenLineBorder = BorderFactory.createLineBorder(Color.black);
        Border presenTitledBorder = BorderFactory.createTitledBorder(presenLineBorder, "Present Percentage",
                TitledBorder.CENTER,
                TitledBorder.TOP, presenFont, Color.black);
        presentPercentagePanel.setBorder(presenTitledBorder);

        // border for grant certificate panel
        Font grantFont = new Font(Font.SERIF, Font.BOLD, 13);
        Border grantLineBorder = BorderFactory.createLineBorder(Color.black);
        Border grantTitledBorder = BorderFactory.createTitledBorder(grantLineBorder, "Grant Certificate",
                TitledBorder.CENTER,
                TitledBorder.TOP, grantFont, Color.black);
        granCertPanel.setBorder(grantTitledBorder);

        // attributes of regular student
        noOfModules = new JLabel("No. Of Modules");
        noOfModules.setBounds(10, 29, 120, 15);
        regularPanel.add(noOfModules);

        noOfCreditHours = new JLabel("No. Of Credit Hours");
        noOfCreditHours.setBounds(10, 79, 140, 15);
        regularPanel.add(noOfCreditHours);

        presentDays = new JLabel("Present Days");
        presentDays.setBounds(10, 129, 105, 15);
        regularPanel.add(presentDays);

        // Textfield size and location of attributes of regular students
        noOfModulesField = new JTextField();
        noOfModulesField.setBounds(165, 25, 120, 25);
        regularPanel.add(noOfModulesField);

        noOfCreditHoursField = new JTextField();
        noOfCreditHoursField.setBounds(165, 75, 120, 25);
        regularPanel.add(noOfCreditHoursField);

        presentDaysField = new JTextField();
        presentDaysField.setBounds(165, 125, 120, 25);
        regularPanel.add(presentDaysField);

        // attributes of present percentage
        enrollId2 = new JLabel("Enrollment Id");
        enrollId2.setBounds(10, 33, 105, 15);
        presentPercentagePanel.add(enrollId2);

        noOfDaysPresen = new JLabel("No. of days present");
        noOfDaysPresen.setBounds(10, 83, 135, 15);
        presentPercentagePanel.add(noOfDaysPresen);

        // Textfield size and location of attributes of present percentage
        enrollId2Field = new JTextField();
        enrollId2Field.setBounds(128, 30, 150, 25);
        presentPercentagePanel.add(enrollId2Field);

        noOfDaysPresenField = new JTextField();
        noOfDaysPresenField.setBounds(128, 80, 150, 25);
        presentPercentagePanel.add(noOfDaysPresenField);

        // attributes of granting certificate
        enrollId3 = new JLabel("Enrollment Id");
        enrollId3.setBounds(10, 33, 105, 15);
        granCertPanel.add(enrollId3);

        coursName = new JLabel("Course Name");
        coursName.setBounds(10, 83, 135, 15);
        granCertPanel.add(coursName);

        dOfEnroll = new JLabel("Date Of Enrollment");
        dOfEnroll.setBounds(95, 127, 135, 15);
        granCertPanel.add(dOfEnroll);

        // Textfield size and location of attributes of granting certificate
        enrollIdFieldGrnt = new JTextField();
        enrollIdFieldGrnt.setBounds(128, 30, 150, 25);
        granCertPanel.add(enrollIdFieldGrnt);

        coursField = new JTextField();
        coursField.setBounds(128, 80, 150, 25);
        granCertPanel.add(coursField);

        // ComboBox
        String[] yr = { "Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007" };
        enYear = new JComboBox<String>(yr);
        enYear.setBounds(35, 151, 60, 25);
        granCertPanel.add(enYear);

        String[] mn = { "Month", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        enMonth = new JComboBox<String>(mn);
        enMonth.setBounds(105, 151, 97, 25);
        granCertPanel.add(enMonth);

        String[] dy = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" };
        enDay = new JComboBox<String>(dy);
        enDay.setBounds(213, 151, 50, 25);
        granCertPanel.add(enDay);

        // add regular student button
        addRegStdBtn = new JButton("Add Regular Student");
        addRegStdBtn.setBounds(10, 190, 152, 25);
        regularPanel.add(addRegStdBtn);
        addRegStdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addRegularStudent();
            }
        });

        // display button to display the details of regular student
        displayBtn2 = new JButton("Display");
        displayBtn2.setBounds(200, 190, 75, 25);
        regularPanel.add(displayBtn2);
        displayBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (regularObj == true) {
                    for (Student obj : student) {
                        if (obj instanceof Regular) {
                            Regular regular = (Regular) obj;
                            regular.displayDetails();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(regularPanel, "Regular Student has not been added yet", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // grant certificate button
        grantCertificateBtn = new JButton("Grant Certificate");
        grantCertificateBtn.setBounds(10, 230, 152, 25);
        regularPanel.add(grantCertificateBtn);

        grantCertificateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(regularObj == true){
                    granCertFrame.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(regularPanel, "Regular student has not been added yet", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // grant certificate button
        grantCertificateBtn2 = new JButton("Grant Certificate");
        grantCertificateBtn2.setBounds(75, 195, 138, 25);
        granCertPanel.add(grantCertificateBtn2);
        grantCertificateBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                grntCertificate();
            }
        });

        // back button to go to the choose frame
        backBtn2 = new JButton("Back");
        backBtn2.setBounds(203, 230, 70, 25);
        regularPanel.add(backBtn2);

        backBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseFrame.setVisible(true);
                regularFrame.dispose();
            }
        });

        calculatePresenPercenBtn = new JButton("Calculate Present Percentage");
        calculatePresenPercenBtn.setBounds(50, 150, 205, 25);
        presentPercentagePanel.add(calculatePresenPercenBtn);
        calculatePresenPercenBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculatePresenPercen();
            }
        });

        // present percentage button
        presentPercentageBtn = new JButton("Present Percentage");
        presentPercentageBtn.setBounds(10, 270, 152, 25);
        regularPanel.add(presentPercentageBtn);

        presentPercentageBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(regularObj == true){
                    presentPercentageFrame.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(regularPanel, "Regular student has not been added yet", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // next frame for dropout student
        dropoutFrame = new JFrame();
        dropoutFrame.setSize(380, 470);
        dropoutFrame.setLocationRelativeTo(null);
        dropoutFrame.setLayout(null);
        dropoutFrame.setResizable(false);
        dropoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel for dropout student
        dropoutPanel = new JPanel();
        dropoutPanel.setBounds(33, 27, 300, 230);
        dropoutPanel.setLayout(null);
        dropoutPanel.setBackground(Color.decode("#03ebfc"));
        dropoutFrame.add(dropoutPanel);

        // panel for dropout student to pay bills or remove student
        payOrRemove = new JPanel();
        payOrRemove.setBounds(33, 275, 300, 130);
        payOrRemove.setLayout(null);
        payOrRemove.setBackground(Color.decode("#03ebfc"));
        dropoutFrame.add(payOrRemove);

        // border for dropout panel
        Font dropoutFont = new Font(Font.SERIF, Font.BOLD, 13);
        Border dropoutLineBorder = BorderFactory.createLineBorder(Color.black);
        Border dropoutTitledBorder = BorderFactory.createTitledBorder(dropoutLineBorder, "Dropout Student",
                TitledBorder.CENTER,
                TitledBorder.TOP, dropoutFont, Color.black);
        dropoutPanel.setBorder(dropoutTitledBorder);

        // border for pay bills or remove student panel
        Font payorremoveFont = new Font(Font.SERIF, Font.BOLD, 13);
        Border payorremoveFontLineBorder = BorderFactory.createLineBorder(Color.black);
        Border payorremoveFontTitledBorder = BorderFactory.createTitledBorder(payorremoveFontLineBorder, "pay bills or remove student",
                TitledBorder.CENTER,
                TitledBorder.TOP, payorremoveFont, Color.black);
        payOrRemove.setBorder(payorremoveFontTitledBorder);

        // attributes of dropout student
        noOfRemainingModules = new JLabel("No. Of Remaining Modules");
        noOfRemainingModules.setBounds(10, 29, 155, 15);
        dropoutPanel.add(noOfRemainingModules);

        noOfMonthsAttended = new JLabel("No. Of Months Attended");
        noOfMonthsAttended.setBounds(10, 79, 155, 15);
        dropoutPanel.add(noOfMonthsAttended);

        dateOfDropout = new JLabel("Date Of Dropout");
        dateOfDropout.setBounds(100, 119, 105, 15);
        dropoutPanel.add(dateOfDropout);

        // Textfield size and location of attributes of regular students
        noOfRemainingModulesField = new JTextField();
        noOfRemainingModulesField.setBounds(165, 25, 120, 25);
        dropoutPanel.add(noOfRemainingModulesField);

        noOfMonthsAttendedField = new JTextField();
        noOfMonthsAttendedField.setBounds(165, 75, 120, 25);
        dropoutPanel.add(noOfMonthsAttendedField);

        // ComboBox
        String[] data4 = { "Year", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" };
        dropoutYear = new JComboBox<String>(data4);
        dropoutYear.setBounds(30, 140, 60, 25);
        dropoutPanel.add(dropoutYear);

        String[] data5 = { "Month", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        dropoutMonth = new JComboBox<String>(data5);
        dropoutMonth.setBounds(103, 140, 97, 25);
        dropoutPanel.add(dropoutMonth);

        String[] data6 = { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" };
        dropoutDay = new JComboBox<String>(data6);
        dropoutDay.setBounds(210, 140, 50, 25);
        dropoutPanel.add(dropoutDay);

        // attributes of pay bills or remove student
        enrollId4 = new JLabel("Enrollment Id");
        enrollId4.setBounds(10, 29, 105, 15);
        payOrRemove.add(enrollId4);

        // Textfield size and location of attributes of pay bills or remove student
        enrollId4Field = new JTextField();
        enrollId4Field.setBounds(115, 25, 150, 23);
        payOrRemove.add(enrollId4Field);

        // add dropout student button
        addDropStdBtn = new JButton("Add Dropout Student");
        addDropStdBtn.setBounds(10, 190, 155, 25);
        dropoutPanel.add(addDropStdBtn);
        addDropStdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addDropoutStudent();
            }
        });

        // display button to display the details of dropout student
        displayBtn3 = new JButton("Display");
        displayBtn3.setBounds(200, 190, 75, 25);
        dropoutPanel.add(displayBtn3);

        //display button to display the information about dropout student
        displayBtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dropoutObj == true) {
                    for (Student obj : student) {
                        if (obj instanceof Dropout) {
                            Dropout dropout = (Dropout) obj;
                            dropout.display();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(dropoutPanel, "Dropout Student has not been added yet", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // grant certificate button
        removeStdBtn = new JButton("Remove Student");
        removeStdBtn.setBounds(10, 70, 130, 25);
        payOrRemove.add(removeStdBtn);

        removeStdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                    removeStd();

            }
        });

        // pay bills button
        payBillsBtn = new JButton("Pay Bills");
        payBillsBtn.setBounds(155, 70, 125, 25);
        payOrRemove.add(payBillsBtn);

        payBillsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                payBills();
                System.out.println("All bills have been sucessfully paid");
                if (dropoutObj == false) {
                    JOptionPane.showMessageDialog(dropoutFrame, "Dropout student has not been added yet", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                else{
                    payBills();
                }
            }
        });

        JButton backk = new JButton("Back");
        backk.setBounds(100, 102, 65, 23);
        payOrRemove.add(backk);
        backk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseFrame.setVisible(true);
                dropoutFrame.dispose();
            }
        });

        chooseFrame.setVisible(true);
    }

    //method to check unique enrollment id at regular
    public boolean checkRegularEnrollmentIdUnique(int enrollId){
        boolean found = false;
        for(Student obj : student){
            if(obj instanceof Regular){
                Regular std = (Regular) obj;
                if(std.getenrollmentID()== enrollId){
                    found = true;
                }
            }
        }
        return found;
    }

    //method to check unique enrollment id at dropout
    public boolean checkDropoutEnrollmentIdUnique(int enrollId){
        boolean found = false;
        for(Student obj : student){
            if(obj instanceof Dropout){
                Dropout std = (Dropout) obj;
                if(std.getenrollmentID()== enrollId){
                    found = true;
                }
            }
        }
        return found;
    }

    // getter method of enrollment id
    public int getEnrollmentId() {
        String st = enrollmentIdField.getText().trim();
        int enrollmentId = INVALID;
        try {
            enrollmentId = Integer.parseInt(st);
            if (enrollmentId <= 0) {
                enrollmentId = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid Enrollment Id");
        }
        return enrollmentId;
    }

    // getter method of student name
    public String getStudentName() {
        String studentName = nameField.getText().trim();
        return studentName;
    }

    // getter method of course name
    public String getCourseName() {
        String courseName = courseNameField.getText().trim();
        return courseName;
    }

    // getter method of date of birth
    public String getDOB() {
        String date = "";
        String year = dobYear.getSelectedItem().toString();
        String month = dobMonth.getSelectedItem().toString();
        String day = dobDay.getSelectedItem().toString();

        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    // getter method of course duration
    public int getCourseDuration() {
        String st = courseDurationField.getText().trim();
        int courseDuration = INVALID;
        try {
            courseDuration = Integer.parseInt(st);
            if (courseDuration <= 0) {
                courseDuration = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid Course Duration.");
        }
        return courseDuration;
    }

    // getter method of date of birth
    public String getEnrollDate() {
        String date = "";
        String year = enrollYear.getSelectedItem().toString();
        String month = enrollMonth.getSelectedItem().toString();
        String day = enrollDay.getSelectedItem().toString();

        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    // getter method of tution fee
    public int getTutionFee() {
        String st = tutionFeeField.getText().trim();
        int tutionFee = INVALID;
        try {
            tutionFee = Integer.parseInt(st);
            if (tutionFee <= 0) {
                tutionFee = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid Tution Fee.");
        }
        return tutionFee;
    }

    public int getNumOfmodules() {
        String st = noOfModulesField.getText().trim();
        int numOfModul = INVALID;
        try {
            numOfModul = Integer.parseInt(st);
            if (numOfModul <= 0) {
                numOfModul = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid number of modules.");
        }
        return numOfModul;
    }

    public int getNumOfCreditHours() {
        String st = noOfCreditHoursField.getText().trim();
        int numOfCrHr = INVALID;
        try {
            numOfCrHr = Integer.parseInt(st);
            if (numOfCrHr <= 0) {
                numOfCrHr = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid number of credit hours.");
        }
        return numOfCrHr;
    }

    //getter method of present days
    public double getDaysPresent() {
        String st = presentDaysField.getText().trim();
        double presenDy = INVALID;
        try {
            presenDy = Double.parseDouble(st);
            if (presenDy <= 0) {
                presenDy = INVALID;

            }
        } catch (IllegalArgumentException nfe) {
            throw new NumberFormatException("Invalid Present Days.");
        }
        return presenDy;
    }

    //getter method of present days
    public double getPresentPercentDays() {
        String st = noOfDaysPresenField.getText().trim();
        double presenDy = INVALID;
        try {
            presenDy = Double.parseDouble(st);
            if (presenDy <= 0) {
                presenDy = INVALID;

            }
        } catch (IllegalArgumentException nfe) {
            throw new NumberFormatException("Invalid Present Days.");
        }
        return presenDy;
    }

    //getter method of enrollment id of present percentage
    public int getPresentPercentEnrollId() {
        String s = enrollId2Field.getText().trim();
        int enrollId = INVALID;
        try {
            enrollId = Integer.parseInt(s);
            if (enrollId <= 0) {
                enrollId = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid Enrollment Id");
        }
        return enrollId;
    }
    

    public int getNumOfRemainingmodules() {
        String st = noOfRemainingModulesField.getText().trim();
        int noOfRemainingModulesField = INVALID;
        try {
            noOfRemainingModulesField = Integer.parseInt(st);
            if (noOfRemainingModulesField <= 0) {
                noOfRemainingModulesField = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid number of remaining modules.");
        }
        return noOfRemainingModulesField;
    }

    public int getNumOfMonthsAttended() {
        String st = noOfMonthsAttendedField.getText().trim();
        int noOfMonthsAttendedField = INVALID;
        try {
            noOfMonthsAttendedField = Integer.parseInt(st);
            if (noOfMonthsAttendedField <= 0) {
                noOfMonthsAttendedField = INVALID;
            }
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("Invalid number of months attended.");
        }
        return noOfMonthsAttendedField;
    }

    // getter method of course name
    public String getCoursesNm() {
        String courName = coursField.getText().trim();
        return courName;
    }

    // getter method of dropout date
    public String getDropDate() {
        String date = "";
        String year = dropoutYear.getSelectedItem().toString();
        String month = dropoutMonth.getSelectedItem().toString();
        String day = dropoutDay.getSelectedItem().toString();

        if (year.equals("Year") || month.equals("Month") || day.equals("Day")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    //getter method to pay bills
    public int getPayBills(){
        String s = enrollId4.getText().trim();
        int enrollId = INVALID;
        try{
            enrollId = Integer.parseInt(s);
            if(enrollId <=0){
                enrollId = INVALID;
            }
        } catch(NumberFormatException nfe){
            throw new  NumberFormatException("Invalid Enrolllment Id");
        }
        return enrollId;
    }

    //getter method to remove student
    public int getRemoveStd(){
        String s = enrollId4.getText().trim();
        int enrollId = INVALID;
        try{
            enrollId = Integer.parseInt(s);
            if(enrollId <=0){
                enrollId = INVALID;
            }
        } catch(NumberFormatException nfe){
            throw new  NumberFormatException("Invalid Enrolllment Id");
        }
        return enrollId;
    }

    //accessor method to add regular student details
    public void addRegDetails(){
        try{
            if(enrollmentIdField.getText().isEmpty()||nameField.getText().isEmpty()||dobYear.getSelectedItem().equals("Year")||dobMonth.getSelectedItem().equals("Month")||dobDay.getSelectedItem().equals("Day")||courseNameField.getText().isEmpty()||courseDurationField.getText().isEmpty()||enrollYear.getSelectedItem().equals("Year")||enrollMonth.getSelectedItem().equals("Month")||enrollDay.getSelectedItem().equals("Day")||tutionFeeField.getText().isEmpty()){
                JOptionPane.showMessageDialog(regdrPanel, "Please fill all the required fields", "Error", JOptionPane.ERROR_MESSAGE);   
            }
            else{
                int enrollmentId = getEnrollmentId();
                if(enrollmentId == INVALID){
                    JOptionPane.showMessageDialog(regdrPanel, "Enrollment Id should be positive.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String name = getStudentName();
                if(name.isEmpty()){
                    JOptionPane.showMessageDialog(regdrPanel, "Student name is empty.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String dob = getDOB();
                if(dob == null){
                    JOptionPane.showMessageDialog(regdrPanel, "Invalid date of birth.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                String courseName = getCourseName();
                if(courseName.isEmpty()){
                    JOptionPane.showMessageDialog(regdrPanel, " Course Name is empty.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int courseDuration = getCourseDuration();
                if(courseDuration == INVALID){
                    JOptionPane.showMessageDialog(regdrPanel, "Course Duration should be positive.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String doenroll = getEnrollDate();
                if(doenroll == null){
                    JOptionPane.showMessageDialog(regdrPanel, "Invalid date of enrollment.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                int tutionFee = getTutionFee();
                if(tutionFee == INVALID){
                    JOptionPane.showMessageDialog(regdrPanel, "Tution Fee should be positive.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                boolean found = checkRegularEnrollmentIdUnique(enrollmentId);
                if (found == false) {
                    regularFrame.setVisible(true);
                    chooseFrame.dispose();
                } else {
                    throw new IllegalArgumentException("Enrollment id must be unique");
                }
            }
        } catch (IllegalArgumentException nfe) {
            JOptionPane.showMessageDialog(regdrPanel, nfe.getMessage(), "Error box",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

     //accessor method to add dropout student details
    public void addDropDetails(){
        try{
            if(enrollmentIdField.getText().isEmpty()||nameField.getText().isEmpty()||dobYear.getSelectedItem().equals("Year")||dobMonth.getSelectedItem().equals("Month")||dobDay.getSelectedItem().equals("Day")||courseNameField.getText().isEmpty()||courseDurationField.getText().isEmpty()||enrollYear.getSelectedItem().equals("Year")||enrollMonth.getSelectedItem().equals("Month")||enrollDay.getSelectedItem().equals("Day")||tutionFeeField.getText().isEmpty()){
                JOptionPane.showMessageDialog(regdrPanel, "Please fill all the required fields", "Error", JOptionPane.ERROR_MESSAGE);   
            }
            else{
                int enrollmentId = getEnrollmentId();
                if(enrollmentId == INVALID){
                    JOptionPane.showMessageDialog(regdrPanel, "Enrollment Id should be positive.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String name = getStudentName();
                if(name.isEmpty()){
                    JOptionPane.showMessageDialog(regdrPanel, "Student name is empty.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String dob = getDOB();
                if(dob == null){
                    JOptionPane.showMessageDialog(regdrPanel, "Invalid date of birth.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                String courseName = getCourseName();
                if(courseName.isEmpty()){
                    JOptionPane.showMessageDialog(regdrPanel, " Course Name is empty.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int courseDuration = getCourseDuration();
                if(courseDuration == INVALID){
                    JOptionPane.showMessageDialog(regdrPanel, "Course Duration should be positive.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String doenroll = getEnrollDate();
                if(doenroll == null){
                    JOptionPane.showMessageDialog(regdrPanel, "Invalid date of enrollment.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                int tutionFee = getTutionFee();
                if(tutionFee == INVALID){
                    JOptionPane.showMessageDialog(regdrPanel, "Tution Fee should be positive.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                boolean found = checkDropoutEnrollmentIdUnique(enrollmentId);
                if (found == false) {
                    dropoutFrame.setVisible(true);
                    chooseFrame.dispose();
                } else {
                    throw new IllegalArgumentException("Enrollment id must be unique");
                }
            }
        } catch (IllegalArgumentException nfe) {
            JOptionPane.showMessageDialog(regdrPanel, nfe.getMessage(), "Error box",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addRegularStudent() {
        try {
            if (noOfModulesField.getText().trim().isEmpty() || noOfCreditHoursField.getText().isEmpty()
                    || presentDaysField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(regularPanel, "Please fill up all the given information.", "Error box",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int noOfModul = getNumOfmodules();
                if (noOfModul == INVALID) {
                    JOptionPane.showMessageDialog(regularPanel, "Please enter positive number of modules.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int noOfCrHr = getNumOfCreditHours();
                if (noOfCrHr == INVALID) {
                    JOptionPane.showMessageDialog(regularPanel, "Please enter positive number of credit hours.",
                            "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double presenDy = getDaysPresent();
                if (presenDy == INVALID) {
                    JOptionPane.showMessageDialog(regularPanel, "Present Days should be positive.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int enrollmentId = getEnrollmentId();
                String dob = getDOB();
                String courseName = getCourseName();
                String name = getStudentName();
                String doenroll = getEnrollDate();
                int courseDuration = getCourseDuration();
                int tutionFee = getTutionFee();
                boolean found = checkRegularEnrollmentIdUnique(enrollmentId);
                if (found == false) {
                    Student obj = new Regular(enrollmentId, dob, courseName, name, doenroll, courseDuration, tutionFee, noOfModul, noOfCrHr, presenDy);
                    student.add(obj);
                    JOptionPane.showMessageDialog(regularPanel, "Regular student added successfully.", "Error Box", JOptionPane.INFORMATION_MESSAGE);
                    regularObj = true;
                    noOfModulesField.setText("");
                    noOfCreditHoursField.setText("");
                    presentDaysField.setText("");
                } else {
                    throw new IllegalArgumentException("Enrollment Id must be unique");
                }
            }
        } catch (IllegalArgumentException nfe) {
            JOptionPane.showMessageDialog(regularPanel, nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addDropoutStudent() {
        try {
            if (noOfRemainingModulesField.getText().trim().isEmpty() || noOfMonthsAttendedField.getText().isEmpty()
                    || dropoutYear.getSelectedItem().equals("Year") || dropoutMonth.getSelectedItem().equals("Month")
                    || dropoutDay.getSelectedItem().equals("Day")) {
                JOptionPane.showMessageDialog(dropoutPanel, "Please fill up all the given information.", "Error box",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int noOfRemModul = getNumOfRemainingmodules();
                if (noOfRemModul == INVALID) {
                    JOptionPane.showMessageDialog(dropoutPanel, "Please enter positive number of remaining modules.",
                            "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int noOfMnAtt = getNumOfMonthsAttended();
                if (noOfMnAtt == INVALID) {
                    JOptionPane.showMessageDialog(dropoutPanel, "Please enter positive number of months attended.",
                            "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String dropDate = getDropDate();
                if (dropDate == null) {
                    JOptionPane.showMessageDialog(dropoutPanel, "Invalid dropout date.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int enrollmentId = getEnrollmentId();
                String dob = getDOB();
                String courseName = getCourseName();
                String name = getStudentName();
                String doenroll = getEnrollDate();
                int courseDuration = getCourseDuration();
                int tutionFee = getTutionFee();
                boolean found = checkDropoutEnrollmentIdUnique(enrollmentId);
                if (found == false) {
                    Student obj = new Dropout(enrollmentId, dob, courseName, name, doenroll, courseDuration, tutionFee, noOfRemModul, dropDate, noOfMnAtt);
                    student.add(obj);
                    JOptionPane.showMessageDialog(dropoutPanel, "Dropout student added successfully.", "Error Box", JOptionPane.INFORMATION_MESSAGE);
                    dropoutObj = true;
                    noOfRemainingModulesField.setText("");
                    dropoutYear.setSelectedIndex(0);
                    dropoutMonth.setSelectedIndex(0);
                    dropoutDay.setSelectedIndex(0);
                    noOfMonthsAttendedField.setText("");
                } else {
                    throw new IllegalArgumentException("Enrollment Id must be unique");
                }
            }
        } catch (IllegalArgumentException nfe) {
            JOptionPane.showMessageDialog(regularPanel, nfe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void grntCertificate(){
        try{
            if(enrollIdFieldGrnt.getText().trim().isEmpty()&&coursField.getText().trim().isEmpty()&&enYear.getSelectedItem().equals("Year")&&enMonth.getSelectedItem().equals("Month")&&enDay.getSelectedItem().equals("Day")){
                JOptionPane.showMessageDialog(granCertPanel, "Please fill up all the given information.", "Error box",
                        JOptionPane.ERROR_MESSAGE);
            } else{
                int enrollId = getEnrollmentId();
                if (enrollId == INVALID) {
                    throw new IllegalArgumentException("Invalid Enrollment Id.");
                }
                String coursNm = getCoursesNm();
                if(coursNm.isEmpty()){
                    JOptionPane.showMessageDialog(regdrPanel, "Course name is empty.", "Error box",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String enDate = getEnrollDate();
                if (enDate == null) {
                    JOptionPane.showMessageDialog(dropoutPanel, "Invalid date of enrollment.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for (Student obj : student) {
                    if (obj instanceof Regular) {
                        Regular reg = (Regular) obj;
                        if (reg.getenrollmentID() == enrollId) {
                            reg.grantCertificate(coursNm, enrollId, enDate);
                        } else {
                            throw new IllegalArgumentException("Enrollment Id did not match");
                        }
                    }
                }
            }
        }catch (IllegalArgumentException nfe) {
            JOptionPane.showMessageDialog(granCertFrame, nfe.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void calculatePresenPercen() {
        try {
            if (enrollId2Field.getText().trim().isEmpty() || noOfDaysPresenField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(presentPercentageFrame, "Please fill up the given information",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                double noOfDyPresen = getPresentPercentDays();
                if (noOfDyPresen == INVALID) {
                    JOptionPane.showMessageDialog(presentPercentageFrame, "No of present days should be positive",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int enrollId = Integer.parseInt(enrollId2Field.getText());
                if (enrollId == INVALID) {
                    throw new IllegalArgumentException("Invalid Enrollment Id");
                }
                boolean enrollIdFound = false;
                for (Student obj : student) {
                    if (obj instanceof Regular) {
                        Regular reg = (Regular) obj;
                        if (reg.getenrollmentID() == enrollId) {
                            
                            System.out.println(reg.presentPercentage(noOfDyPresen)); 
                            enrollId2Field.setText("");
                            noOfDaysPresenField.setText("");
                            enrollIdFound = true;
                            JOptionPane.showMessageDialog(presentPercentageFrame, "Result Printed on terminal ", "Information" ,JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                if (!enrollIdFound) {
                    JOptionPane.showMessageDialog(presentPercentageFrame, "Enrollment Id not found",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IllegalArgumentException nfe) {
            JOptionPane.showMessageDialog(presentPercentageFrame, nfe.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void payBills() {
            int enrollId = getEnrollmentId();
            if(enrollId == INVALID)
            {
                JOptionPane.showMessageDialog(addRegStdBtn, "Id not valid", "Id error",0);
            }
            boolean enrollFound = false;
            for (Student obj : student) {
                if (obj instanceof Dropout) {
                    Dropout dropout = (Dropout) obj;
                    //System.out.println(dropout.getenrollmentID() == enrollId);
                    if (dropout.getenrollmentID() == enrollId) {

                        dropout.billsPayable();
                        enrollId4Field.setText(""); // Clear the enrollment ID field
                        enrollFound = true;
                        break;
                    }
                }
            }
            // if (enrollFound == false) {
            //     JOptionPane.showMessageDialog(payOrRemove, "Enrollment Id not found", "Error",
            //             JOptionPane.ERROR_MESSAGE);
            // }
    }

    //accessor method to cancel credit card
    public void removeStd() {
        try {
            int enroll = getEnrollmentId();
            System.out.println(enroll);
            if (enroll == INVALID) {
                throw new IllegalArgumentException("Invalid Enrollment Id");

            }
            boolean enrollFound = false;
            for (Student obj : student) {
                if (obj instanceof Dropout) {
                   // System.out.println("B");
                    Dropout dropout = (Dropout) obj;
                    if (dropout.getenrollmentID() == enroll) {
                        dropout.removeStudent();
                       // System.out.println("Bimash");
                        enrollId4Field.setText("");
                        enrollFound = true;
                    }
                }
            }
            if (enrollFound == false) {
                JOptionPane.showMessageDialog(payOrRemove, "Enrollment Id not found",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (IllegalArgumentException nfe) {
            JOptionPane.showMessageDialog(payOrRemove, nfe.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        StudentGUI obj = new StudentGUI();
    }
}