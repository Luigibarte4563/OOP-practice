public class main {
    public static void main(String[]args){

        employee employees[] = new employee[2];

        employees[0] = new employee("Luigi", "Barte", "network engineer");
        employees[1] = new employee("Luigi", "Bet", "cyber security");

        

        for(int i = 0; i < employees.length; i++){
            
            employees[i].introduce();
        }
    }
}
