public abstract class Animal {

    String name;

    abstract void makeSound();

    void showName(){
        System.out.println(name);
    }

    void setName(String name){
        this.name = name;
    }
}
