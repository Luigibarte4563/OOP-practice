public class main {
    
    public static void main(String[]args){

        Character c = new Character("luigi", "here we are", 100, 4, 10);

        c.introduce();
        c.talkTo("maydo");
        
        System.out.println(c.hello(c));
    }
}
