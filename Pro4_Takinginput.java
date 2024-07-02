import java.util.Scanner;
public class Pro4_Takinginput {
    public static void main(String args[]){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number 1");
        // // int a = sc.nextInt();
        // float a = sc.nextFloat();
        // System.out.println("Enter Number2");
        // // int b = sc.nextInt();
        // float b = sc.nextFloat();
        // float sum = a + b;
        // System.out.println("The sum of these number:"+sum);

        // check the user input int or not
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // Print string but this 'next' method  only read first word 
        // String str = sc.next();
        // System.out.println(str);

        // This next line methode read full sentence
        String str = sc.nextLine();
        System.out.println(str);


    }
}
