import java.util.Scanner;

public class app3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        String ten;
        System.out.print("Ten : ");
        ten = sc.nextLine();
        do{
            System.out.print("Tuoi = ");
            n = sc.nextInt();
        }while(n<=0);
        if(n<16){
            System.out.print("Ban " +  ten    + " tuoi con non ");
        }else if(n<=18){
            System.out.print("Ban " +  ten    + " tuoi da chin");

        }else{
            System.out.print("Ban " +  ten    + " tuoi qua lua");

        }
        

    }
    
}
