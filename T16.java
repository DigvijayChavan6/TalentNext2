import java.util.Scanner;

public class T16 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int re=0;
        while(n!=0){
            re=re*10+n%10;
            n/=10;
        }
        System.out.println(re);
    }
}
