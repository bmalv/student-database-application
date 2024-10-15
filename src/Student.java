import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses;
    private int tuitionBalance;
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
        System.out.println(firstName + " " + lastName + " " + gradeLevel + " " + studentID);
    }

    //create unique ID
    private void setStudentID(){
        //grade level + ID
        id++;
        this.studentID = gradeLevel + "" + id;
    }

    //enroll in courses

    //view tuition balance

    //pay tuition balance

    //print out student status: name, ID, courses enrolled, and balance
}
