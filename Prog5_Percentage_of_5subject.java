import java.util.Scanner;

public class Prog5_Percentage_of_5subject{
    public static void main(String args[]){
        System.out.println("Enter each 5 subject marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject marks:");
        int sub1 = sc.nextInt();
        System.out.println("Enter Second Subject marks:");
        int sub2 = sc.nextInt();
        System.out.println("Enter Third Subject marks:");
        int sub3 = sc.nextInt();
        System.out.println("Enter Fourth Subject marks:");
        int sub4 = sc.nextInt();
        System.out.println("Enter Fiveth Subject marks:");
        int sub5 = sc.nextInt();
        int tmarks = (sub1+sub2+sub3+sub4+sub5);
        float per = (tmarks*100)/500f;
        System.out.println("Total percentage of five subject:"+per);

    }
}