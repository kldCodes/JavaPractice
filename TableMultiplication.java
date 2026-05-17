import java.util.Scanner;
public class TableMultiplication {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number for multiplation table: ");
    int num=sc.nextInt();
    for(int i=1;i<=10;i++)
        System.out.println(num+" x "+i+" = "+num*i);
  }  
}
