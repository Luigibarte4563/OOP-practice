public class enemy {

    static String name;
    static int hp;

    void dialog(){
        System.out.println("Please Override this");
    }

    void showStats(){
        System.out.println("I am " + name + " " + hp);
    }
}
