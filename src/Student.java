import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    public Student(){
        //prompting user for student info
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.gradeLevel = in.nextInt();

        System.out.println(firstName + " " + lastName + " " + gradeLevel);
    }

    //create 5 digit unique ID

    //enroll in courses

    //view tuition balance

    //pay tuition balance

    //print out student status: name, ID, courses enrolled, and balance
}
