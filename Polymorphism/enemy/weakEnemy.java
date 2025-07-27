public class weakEnemy extends enemy {

    weakEnemy(){
        name = "Hans";
        hp = 10;
    }

    void dialog(){
        System.out.println(name + " : I am weak");
    }
}
