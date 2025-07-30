package challengStudentInfo;

public class StudentInfo {
    
    int studentCount = 1;
    String firstName, lastName;
    int year;
    String course;
    char section;

    StudentInfo(int studentCount, String firstName, String lastName, int year, String course, char section){
        this.studentCount = studentCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
    }

    void  display(){
        System.out.println("Student no. " + studentCount);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("year       : " + year);
        System.out.println("course     : " + course);
        System.out.println("section    : " + section);
        System.out.println();
    }

}
