import java.util.ArrayList;

public class main {
    public static void main(String[]args){

        ArrayList<String> name = new ArrayList();

        name.add("luigi");
        name.add("this");
        name.add("luigi");
        name.set(0, "barte");


        for(int i = name.size() - 1; i >= 0; i--){
            System.out.println(name.get(i));
        }

        for(String n: name){
            System.out.println(n);
        }

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("luigi", "BSIT"));
        students.add(new Student("just", "jussst"));
        students.add(new Student("hash", "cs"));

        students.set(0, new Student("lugi", "cs"));
        students.remove(0);
        
        for(int t = 0; t < students.size(); t++){
            Student s = students.get(t);
            s.introduce();
        }

        for(Student s: students){
            s.introduce();
        }
    }
}
