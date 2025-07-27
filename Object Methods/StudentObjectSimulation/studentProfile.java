package StudentObjectSimulation;

public class studentProfile {
    
    String firstName, lastName, course;
    int year, section;
    float midtermGrade, finalGrade;

    studentProfile(String firstName, String lastName, String course, int year, int section, float midtermGrade, float finalGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.year = year;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    void introduce(){
        System.out.println("First Name : " + firstName + "\n" + "Last Name : " + lastName + "\n" + "Course : " + course + "\n" + "Year : " + year + "\n" + "Section : " + section + "\n" + "Midter Grade : " + midtermGrade + "\n" + "Final Grade : " + finalGrade);
    }

    void evaluateGrade(){

        String[] standing = {"Invalid Grade", "With Highest Honors", "With High Honors", "With Honors", "Passed", "Failed"};

        float sum = midtermGrade + finalGrade;
        float average = sum / 2;

        if(average > 100){
            System.out.println("Average : " + average + "\n" + "Standing : " + standing[0]);
        }else if(average  <= 100 && average >= 98){
            System.out.println("Average : " + average + "\n" + "Standing : " + standing[1]);
        }else if(average <= 97.99 && average >= 95){
             System.out.println("Average : " + average + "\n" + "Standing : " + standing[2]);
        }else if(average <= 94.99 && average >= 90){
             System.out.println("Average : " + average + "\n" + "Standing : " + standing[3]);
        }else if(average <= 89.99 && average >= 75){
             System.out.println("Average : " + average + "\n" + "Standing : " + standing[4]);
        }else if(average < 75){
             System.out.println("Average : " + average + "\n" + "Standing : " + standing[5]);
        }
    }
}
