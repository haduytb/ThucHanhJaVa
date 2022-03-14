import java.util.Scanner;

public class app6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        int gt = 1;
        do{
            System.out.print("nhap n = ");
            n = sc.nextInt();
        }while(n<=0 );
        for(int i=1;i<=n;i++){
            gt=gt*i;

        }System.out.print("gia thua so n = " + gt);
    }
    
}
