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
        System.out.println(firstName + " " + lastName + " " + gradeLevel + " " + studentID);
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
                this.courses += "\n" + course;
                tuitionBalance += costOfCourse;
            }else {
                break;
            }
        }while(1 != 0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    //view tuition balance

    //pay tuition balance

    //print out student status: name, ID, courses enrolled, and balance
}
