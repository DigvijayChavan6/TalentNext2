public class T6 {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[1]);
        if(args[0].equals("Male")){
            if(age<=58)System.out.println("rate is 8.4%");
            else System.out.println("rate is 10.5%");
        }
        else{
            if(age<=58)System.out.println("rate is 8.2%");
            else System.out.println("rate is 9.2%");
        }
    }    
}
