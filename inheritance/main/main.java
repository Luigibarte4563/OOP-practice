public class main {
    public static void main(String[]args){

        person per1 = new person("luigi", "M", 19);
        toddler tod = new toddler("luigi", "m", 19, "game");

        per1.name = "Luigi";
        per1.age = 19;
        per1.sex = "M";

        tod.name = "Lu";
        tod.age = 19;
        tod.sex = "M";

        per1.checkStatus();

        tod.checkStatus();
        tod.drink();
        
    }
}
