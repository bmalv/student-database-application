import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        //prompting user for student info
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.gradeLevel = in.nextInt();

        setStudentID();
    }

    //create unique ID
    private void setStudentID(){
        //grade level + ID
        id++;
        this.studentID = gradeLevel + "" + id;
    }

    //enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equalsIgnoreCase("Q")){
                this.courses += "\n  " + course;
                tuitionBalance += costOfCourse;
            }else {
                break;
            }
        }while(1 != 0);
    }

    //view tuition balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //pay tuition balance
    public void payBalance(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //print out student status: name, ID, courses enrolled, and balance
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeLevel +
                "\n Student ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
