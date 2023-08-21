import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        System.out.println("Enter color code:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'R':
                System.out.println("RED");
                break;
            case 'W':
                System.out.println("WHITE");
                break;
            case 'Y':
                System.out.println("YELLOW");
                break;
            case 'B':
                System.out.println("BLUE");
                break;
            case 'O':
                System.out.println("ORANGE");
                break;
            default:
                System.out.println("Invalid code");
        }
    }
}
