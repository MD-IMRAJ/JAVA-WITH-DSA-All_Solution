import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:-");
        int n=sc.nextInt();
        int pw=1;
        int ans=0;
        while(n>0){
            //n=n%10;
            ans+=n%10*pw;
            n=n/10;
            pw*=2;
        }
        System.out.println("Decimal Number is:"+" "+ans);
    }
}
