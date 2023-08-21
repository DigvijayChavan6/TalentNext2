import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        System.out.println("Enter any two characters:");
        Scanner sc = new Scanner (System.in);
        char one=sc.next().charAt(0);
        char two=sc.next().charAt(0);
        if(one<two)System.out.println(one+","+two);
        else System.out.println(two+","+one);
    }
}
