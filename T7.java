import java.util.Scanner;

class T7 {
    public static void main(String[] args) {
        System.out.println("Enter any char:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>=65&&ch<=92)System.out.println(Character.toLowerCase(ch));
        else System.out.println(Character.toUpperCase(ch));
    }    
}
