import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=c.nextInt();
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0)cnt++;
        }
        if(cnt==2){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT PRIME");
        }   
    }
}
