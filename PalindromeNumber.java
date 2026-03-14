import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(rev==num)
            System.out.println(num+" is a Palindrome");
        else
            System.out.println(num+" is not a Palindrome");
    }
}
