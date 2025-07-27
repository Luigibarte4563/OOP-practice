public class Bird implements Animal, airAnimal{
    
    public void makeSound(){
        print("Twit twit");
    }

    public void fly(){
        print("the Bird is flying");
    }

    void print(String word){
        System.out.println(word);
    }
}
