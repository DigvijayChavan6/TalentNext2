public class T9 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        String[] month={"","Jan","Feb","March","April","May","June","July","August","Sep","Oct","Nov","December"};
        if(num>=1&&num<=12)System.out.println(month[num]);
        else System.out.println("Invalid month");
    }
}
