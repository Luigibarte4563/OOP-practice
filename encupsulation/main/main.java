public class main {

    public static void main(String[]args){

        user u = new user();
        
        u.User(1000, "TheBeast", "luigi", "barte");
        u.setUserID(202020);

        int id = u.getUserID();
        System.out.println(id);
    }

}
