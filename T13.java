public class T13 {
    public static void main(String[] args) {
        for(int num=10;num<=99;num++){
            int cnt=0;
            for(int i=1;i<=num;i++)if(num%i==0)cnt++;
            if(cnt==2)System.out.println(num+" ");
        }
    }
}
