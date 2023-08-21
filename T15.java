import java.util.Scanner;

public class T15 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int c=1;
            while(c<=i){
                System.out.print("*");
                c++;
            }
            System.out.println();
        }
    }
}
