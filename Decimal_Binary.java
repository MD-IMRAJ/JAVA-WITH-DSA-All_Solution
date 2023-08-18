import java.util.Scanner;

public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal number:-");
        int n=sc.nextInt();
        int pw=1;
        int ans=0;
        while(n>0){
            int parity=n%2;
            ans+=(parity*pw);
            pw*=10;
            n/=2;
        }
        System.out.println("Binary number is:"+" "+ans);
    }
}
