public class Dog implements Animal, landAnimal {

    public  void makeSound(){
         print("Arf");
    }

    public void walk(){
        print("The dog is walking");
    }

    void print(String word){
        System.out.println(word);
    }
    
}
