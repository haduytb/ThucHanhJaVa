import java.util.Scanner;

public class app2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        do{
        System.out.print("nhap n = ");
        n = sc.nextInt();
        }while(n<0);
        if(n%2==0){
            System.out.print("n la so chan ");
        }else{
            System.out.print("n la so le");
        }

    }
    
}
