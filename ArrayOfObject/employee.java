public class employee {
    
    String firstName, lastName;
    String jobTittle;

    employee(String firstName, String lastName, String jobTitle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTittle = jobTitle;

        //System.out.println(firstName + " " + lastName + " " + jobTitle);
    }

    public void introduce(){
        System.out.println("I am " + firstName + " " + lastName);
        System.out.println("my jobtitle is " + jobTittle);
        System.out.println();
    }
}
