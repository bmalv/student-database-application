import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        //Ask how many students we want to add
        System.out.print("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // create n number of new students
        for(int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payBalance();
        }

        for(int n = 0; n < numOfStudents; n++){
            System.out.println(students[n].showInfo());
        }
    }
}