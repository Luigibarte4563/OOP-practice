public class main {
    public static void main(String[]args){

        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        c.makeSound();
        
        d.name = "Dog";
        d.showName();
    }
}
