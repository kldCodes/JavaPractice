import java.util.Scanner;

public class Prime {
    public static String prime(int num){
        if(num<=1)
            return "Not a Prime";
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return "Not a Prime";
        }
        return "a Prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println(num+ " is "+prime(num));
    }
}
