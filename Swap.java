import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers separated by space:");
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping:");
        System.out.println("a= "+a+"\tb= "+b);
        //case 1
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("After swapping:");
        // System.out.println("a= "+a+"\tb= "+b);

        //case2

        // a=a*b;
        // b=a/b;
        // a=a/b;
        // System.out.println("After swapping:");
        // System.out.println("a= "+a+"\tb= "+b);

        //case 3
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:");
        System.out.println("a= "+a+"\tb= "+b);
    }
}
