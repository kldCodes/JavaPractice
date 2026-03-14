import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int maxNum= (a>b&&a>c)?a:(b>c?b:c);
        System.out.println("Maximum number is "+maxNum);
    }
}
