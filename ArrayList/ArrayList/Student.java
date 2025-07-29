public class Student {
    
    String name, course;

    Student(String name, String course){
        this.name = name;
        this.course = course;
    }

    public void introduce(){
        System.out.println("I am " + name + " my course is " + course);
    }
}
