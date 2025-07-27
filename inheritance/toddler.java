public class toddler extends person {

    void drink(){
        System.out.println("Drinking Milk");
    }

    void checkStatus(){
        super.checkStatus();
        System.out.println("whahhaa");
    }

    String favoriteGame;

    toddler(String name, String sex, int age, String favoriteGame){
        super(name, sex, age);
        this.favoriteGame = favoriteGame;

        System.out.println(name + " " + sex + " " + age);
    }
}
