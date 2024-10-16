public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many students we want to add
        Student student1 = new Student();
        student1.enroll();
        student1.payBalance();
        System.out.print(student1.showInfo());
        // create n number of new students
    }
}