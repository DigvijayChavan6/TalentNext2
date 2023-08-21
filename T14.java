import java.util.Scanner;

public class T14 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int sum=0,n=sc.nextInt();
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }    
}
