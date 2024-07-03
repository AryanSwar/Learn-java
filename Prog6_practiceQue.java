import java.util.Scanner;
public class Prog6_practiceQue {
    public static void main(String args[]){

         //                Question-1
        // Write a program to sum three numbers in java
    //     int a = 7;
    //     int b = 9;
    //     int c = 6;
    //     int sum = a+b+c;
    //     System.out.println("Sum of three number:"+sum);


        //                  Question-2
        // write a program to calculate CGPA using marks of three subject
        // float sub1 = 65;
        // float sub2 = 73;
        // float sub3 = 86;
        // float cgpa = (sub1+sub2+sub3)/30;
        // System.out.println("CGPA of three subjecct:"+cgpa);



    //                      Question-3
    // write a java program which ask the user to enter his/her name and greets them with "Hello <name>, Have a good day" text.
    // System.out.println("Enter his/her name");
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // System.out.println("Hello"+" "+name+", Have a good day! :)");


    //                      Question-4
    // write a java program to convert killometers to miles
    // System.out.println("Enter value to convert km to ml");
    // Scanner sc = new Scanner(System.in);
    // float km = sc.nextFloat();
    // float ml = km*0.621371f;
    // System.out.println("converted value of ml is:"+ml);


    //                      Question-5
    //write a java program to detect whether a number entered by the user is integer or not.
    System.out.println("Enter a number to check integer or not");
    Scanner sc = new Scanner(System.in);
    boolean b1 = sc.hasNextInt();
    System.out.println(b1);
    }
}
