public class StrongEnemy extends enemy {
    
    StrongEnemy(){
        name = "Strong";
        hp = 21;
    }

    void dialog(){
        System.out.println(name + " : I am Strong");
    }
}
