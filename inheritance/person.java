public class person {
    
    static String name, sex;
    static int age;

    person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void checkStatus(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Sex " + sex); 
    }
}
