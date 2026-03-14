import java.util.Scanner;
class ReverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number=sc.nextInt();
        int revNum=0;
        while(number>0){
            int rem=number%10;
            number/=10;
            revNum=revNum*10+rem;
        }
        System.out.println("Reversed number: "+revNum);
    }
}