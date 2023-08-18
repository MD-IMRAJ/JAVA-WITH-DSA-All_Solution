import java.util.Scanner;

public class Reverse_Digit {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter number you want to reverse:-");
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n=n/10;
        }
        System.out.println("Reverse number is:"+" "+ans);
    }
}
