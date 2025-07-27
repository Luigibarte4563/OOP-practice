package myProject;

import MyArithmethic.*;

public class firstJavaPackageWithAccessModifyers {

    public static void main(String[]args){

        add m = new add();
        add p = new add();

        int sum = m.adding(10, 10);
        System.out.println(sum);

        System.out.println(m.adding(10, 10));

        String words = p.print("hello");
        System.out.println(words);
   
    }
}
