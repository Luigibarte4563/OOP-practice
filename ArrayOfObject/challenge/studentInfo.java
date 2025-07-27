package challenge;

public class studentInfo {
    
    private String firstName, lastName;
    private int year;
    private String course;
    private char section;

    studentInfo(String firstName, String lastName, int year, String course, char section){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
    }

    void display(){
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("year       : " + year);
        System.out.println("course     : " + course);
        System.out.println("section    : " + section);
        System.out.println();
    }

    String getFirstName(){
        return firstName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    String getLastName(){
        return lastName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    int getYear(){
        return year;
    }

    void setYear(int year){
        this.year = year;
    }

    String getCourse(){
        return course;
    }

    void setCourse(String course){
        this.course = course;
    }

    char getSection(){
        return section;
    }

    void setSection(char section){
        this.section = section;
    }
}
