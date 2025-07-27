public class Character{

    String name, dialog;
    int hp, mp, lvl;

    Character(String name, String dialog, int hp, int mp, int lvl){

        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;

    }

        void introduce(){
            System.out.println(name);
            System.out.println(dialog);
            System.out.println(hp);
            System.out.println(mp);
            System.out.println(lvl);
        }

        void talkTo(String firstName){
            System.out.println("name" + " : " + firstName);
        }

        String hello(Character x){
            return "hello mader" + " : " + x.name;
        }
}