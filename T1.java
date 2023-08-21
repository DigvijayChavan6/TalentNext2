import java.util.Scanner;

public class T1 {
    boolean lastDigi(int one,int two){
        if(one%10==two%10)return true;
        return false;
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        num=sc.nextInt();
        if(num<0)System.out.println("Negative");
        else if(num>0)System.out.println("Positive");
        else System.out.println("Zero");
        System.out.println("Enter two numbers :");
        int o=sc.nextInt();
        int t=sc.nextInt();
        T1 obj=new T1();
        System.out.println(obj.lastDigi(o,t));
    }
}
